package com.sabanciuniv.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

class Msgg{
	private String message;
	@DBRef
	private Account data;
	@DBRef
	private List<Transaction> transactionOut;
	private List<Transaction> transactionIn;
	private double balance;
	
	
	public Msgg(Account data, List<Transaction> transactionOut, List<Transaction> transactionIn, double balance) {
		if(data.getId()==null || data.getOwner()==null) {
			this.message="ERROR:mising fields";
			this.data=null;
		}
		else {
			this.message= "SUCCESS";
			this.data=data;
			this.transactionOut=transactionOut;
			this.transactionIn=transactionIn;
			this.balance=balance;
		}
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Account getData() {
		return data;
	}
	public void setData(Account data) {
		this.data = data;
	}
	public List<Transaction> getTransactionOut() {
		return transactionOut;
	}
	public void setTransactionOut(List<Transaction> transactionOut) {
		this.transactionOut = transactionOut;
	}
	public List<Transaction> getTransactionIn() {
		return transactionIn;
	}
	public void setTransactionIn(List<Transaction> transactionIn) {
		this.transactionIn = transactionIn;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	
	}			
}
class Message{
	private String message;
	@DBRef
	private Account data;
	@DBRef 
	private Transaction transaction;
	
	public Message(Account account) {
		if(account.getId()==null || account.getOwner()==null) {
			this.message="ERROR:mising fields";
			this.data=null;
		}
		else {
			this.message= "SUCCESS";
			this.data=account;
		}
	}
	public Message(Account account, Transaction transaction) {
		if(account.getId()==null || account.getOwner()==null) {
			this.message="ERROR:mising fields";
			this.data=null;
		}
		else {
			this.message= "SUCCESS";
			this.data=account;
			this.transaction=transaction;
		}
	}
	public Message(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String text) {
		this.message = message;
	}
	public Account getData() {
		return data;
	}
	public void setData(Account data) {
		this.data = data;
	}
		
}
class TMessage{
	private String message;
	@DBRef
	private Transaction data;
	
	public TMessage(Transaction transaction) {
		if(transaction.getFrom()==null || transaction.getTo()==null) {
			this.message="ERROR:mising fields";
			this.data=null;
		}
		else {
			this.message= "SUCCESS";
			this.data=transaction;
		}
	}
	public TMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String text) {
		this.message = message;
	}
	public Transaction getData() {
		return data;
	}
	public void setData(Transaction data) {
		this.data = data;
	} 
}
class TrInOutMessage{
	private String message;
	@DBRef
	private Account data;
	@DBRef
	private List<Transaction> transactionIn;
	
	public TrInOutMessage(Account account, List<Transaction> transactionIn) {
		if(account.getId()==null) {
			this.message="ERROR:mising fields";
			this.data=null;
		}
		else {
			this.message= "SUCCESS";
			this.data=account;
			this.transactionIn=transactionIn;
		}
	}
	
	public TrInOutMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Account getData() {
		return data;
	}

	public void setData(Account data) {
		this.data = data;
	}

	public List<Transaction> getTransactionIn() {
		return transactionIn;
	}

	public void setTransactionIn(List<Transaction> transactionIn) {
		this.transactionIn = transactionIn;
	}		
	
}
class TrOutMessage{
	private String message;
	@DBRef
	private Account data;
	@DBRef
	private List<Transaction> transactionOut;
	
	public TrOutMessage(Account account, List<Transaction> transactionOut) {
		if(account.getId()==null) {
			this.message="ERROR:mising fields";
			this.data=null;
		}
		else {
			this.message= "SUCCESS";
			this.data=account;
			this.transactionOut=transactionOut;
		}
	}
	
	public TrOutMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Account getData() {
		return data;
	}

	public void setData(Account data) {
		this.data = data;
	}

	public List<Transaction> getTransactionOut() {
		return transactionOut;
	}

	public void setTransactionOut(List<Transaction> transactionOut) {
		this.transactionOut = transactionOut;
	}
}

