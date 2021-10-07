package com.service.CardsBackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.CardsBackend.modal.Card;
import com.service.CardsBackend.modal.DebitCards;

@RestController
@CrossOrigin
@RequestMapping("/api/cardBackend")
public class CardBackendController {
	
	@GetMapping(value = "/hello")
	public String HelloWorld() {
		return "Hello String";
	}
	
	@GetMapping("/getNewPlafformCards")
	public Card getCard() {
		Card card= new Card();
		List<DebitCards> cardList= new ArrayList<>();
		DebitCards debitCard=  new DebitCards();
		
		debitCard.setTypeOfCard("1");
		debitCard.setBrand("L");
		debitCard.setNameOnCard("ALEX L");
		debitCard.setCardNumber("5454449943798767");
		debitCard.setMaskedCardNumber("XXXX XXXX XXXX 8767");
		debitCard.setCardId(11222);
		debitCard.setReplacedBycardNumber("5454449943798767");
		debitCard.setReplacedCardNumber("");
		debitCard.setPlasticType("0412");
		debitCard.setBasePlasticType("0412");
		debitCard.setIssueDate("2017-03-01");
		debitCard.setCardStatus("0");
		debitCard.setCardDispatchDate("2017-03-07");
		debitCard.setCardCancellationDate("");
		debitCard.setCardExpiryDate("2021-12-28");
		debitCard.setSortCode(23424);
		debitCard.setAccountNumber(1313123123);
		debitCard.setProductName("");
		debitCard.setCustomerProductName("");
		debitCard.setPar("");
		
		
		cardList.add(debitCard);
		card.setViewPinDebitCards(cardList);
		return card;
	}

}
