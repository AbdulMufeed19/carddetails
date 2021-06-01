package com.example.carddetails.mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.carddetails.model.CardDetails;


public interface CardDetailsRepository extends MongoRepository<CardDetails, String> {

}
