package com.praveen.microservices.currencyexchangeservice.bean;

import java.math.BigDecimal;

public class CurrencyExchange {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal converstionMultiple;
	
	public CurrencyExchange(Long id, String from, String to, BigDecimal converstionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.converstionMultiple = converstionMultiple;
	}
	
	
	public CurrencyExchange() {
		super();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConverstionMultiple() {
		return converstionMultiple;
	}
	public void setConverstionMultiple(BigDecimal converstionMultiple) {
		this.converstionMultiple = converstionMultiple;
	}
	
	
	

}
