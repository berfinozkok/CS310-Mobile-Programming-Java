package com.sabanciuniv.model;

import java.time.LocalDateTime;

public class TransactionPayload {
	private String from;
	private String to;
	private double Amount;
	private LocalDateTime createDate;
	
	public TransactionPayload(String from, String to, double Amount, LocalDateTime createDate) {
		super();
		this.from = from;
		this.to = to;
		this.Amount = Amount;
		this.createDate=LocalDateTime.now();
	}
	
	public String getFrom() {
		return from;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		
		this.createDate = LocalDateTime.now();
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
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
	
}
