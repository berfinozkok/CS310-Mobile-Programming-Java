package com.sabanciuniv.model;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transaction {
	@Id private String id;
	@DBRef
	private Account from;
	@DBRef
	private Account to;
	private double Amount;
	private LocalDateTime createDate;

	
	public Transaction() {
		//Auto-generated
	}
	public Transaction(Account from, Account to, double transferAmount,LocalDateTime createDate) {
		super();
		this.from = from;
		this.to = to;
		this.Amount = transferAmount;
		this.createDate=createDate;
	}
	public Transaction( Account from, Account to, double transferAmount) {
		super();
		this.from = from;
		this.to = to;
		this.Amount = transferAmount;
	}
	public Transaction(String id, Account from, Account to, double transferAmount, LocalDateTime createDate) {
		super();
		this.id=id;
		this.from = from;
		this.to = to;
		this.Amount = transferAmount;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	

	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public void setFrom(Account from) {
		this.from = from;
	}
	public Account getFrom() {
		return from;
	}

	public void setFromAccountid(Account from) {
		this.from = from;
	}

	public Account getTo() {
		return to;
	}

	public void setTo(Account to) {
		this.to = to;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
}
