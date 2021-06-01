package com.example.carddetails.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.carddetails.model.CardDetails;
import com.example.carddetails.model.Root;
import com.example.carddetails.mongodb.CardDetailsRepository;

@RestController
@RequestMapping("/card-scheme")
public class CardDetailsController {

	@Autowired 
	private CardDetailsRepository repo;
	@RequestMapping("/")
	public ModelAndView getHomeScreen() {
		ModelAndView mvc= new ModelAndView("homepage");
		return mvc;
	}

	@RequestMapping("/verify")
	private ModelAndView getBankDetails( @RequestParam ("cardNumber") String cardNumber, Model model)
	{
		try {
			String uri = "https://lookup.binlist.net/" + cardNumber;
			RestTemplate restTemplate = new RestTemplate();
			Root result = restTemplate.getForObject(uri, Root.class);
			System.out.println(result);

			if(repo!=null) {
				CardDetails cardetails = new CardDetails();
				Optional<CardDetails> dtls = repo.findById(cardNumber);
				if(dtls.isPresent()) {
					cardetails =dtls.get();
					cardetails.setNumberofHits(cardetails.getNumberofHits()+1);
				}
				else {
					cardetails.setCardId(cardNumber);
					cardetails.setNumberofHits(1);
				}
				repo.save(cardetails);
				System.out.print("pushed card details in mongo");
			}
			model.addAttribute("scheme",result.getScheme());
			model.addAttribute("type",result.getType());
			model.addAttribute("bank",result.getBank().getName());
			ModelAndView mvc = new ModelAndView("showCardDetails");
			return mvc;
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ModelAndView("exception");
		}

	}

	@RequestMapping(value="/stats")
	private ModelAndView getStats( @RequestParam ("start") String start, @RequestParam ("limit")  String limit, Model model)
	{
		System.out.println("entered tetargfdgf");
		List<CardDetails> listofCards = repo.findAll();
		int size  = listofCards.size();
		int startInt,limitInt;
		List <CardDetails> carddetailslist = new ArrayList<CardDetails>();
		if(start!=null && limit!=null) {
			startInt = Integer.parseInt(start);
			limitInt = Integer.parseInt(limit);
			for(int i=startInt; i <=limitInt && i<size;i++)
			{
				carddetailslist.add(listofCards.get(i));
			}
			System.out.println(listofCards.toString());	
			model.addAttribute("start",start);
			model.addAttribute("limit",limit);
			model.addAttribute("dtls",carddetailslist);
			model.addAttribute("size",size);
		}
		else
			System.out.println("listofCards is null");
		ModelAndView mvc = new ModelAndView("showStats");
		return mvc;

	}


}
