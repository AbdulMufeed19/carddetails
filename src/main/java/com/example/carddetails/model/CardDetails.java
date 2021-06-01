package com.example.carddetails.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class CardDetails {


	    @Id
	    private String cardId;
	    private int numberofHits;
		public String getCardId() {
			return cardId;
		}
		public void setCardId(String cardId) {
			this.cardId = cardId;
		}
		public int getNumberofHits() {
			return numberofHits;
		}
		public void setNumberofHits(int numberofHits) {
			this.numberofHits = numberofHits;
		}
		@Override
		public String toString() {
			return "CardDetails [cardId=" + cardId + ", numberofHits=" + numberofHits + "]";
		}
	    
}
