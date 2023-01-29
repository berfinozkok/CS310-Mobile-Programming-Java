package com.sabanciuniv.controller;

import java.time.LocalDateTime;
import java.util.List;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sabanciuniv.model.Account;
import com.sabanciuniv.model.Transaction;
import com.sabanciuniv.model.TransactionPayload;
import com.sabanciuniv.repo.AccountRepo;
import com.sabanciuniv.repo.TransactionRepo;

@RestController
@RequestMapping("/")
public class WebServiceController {
	@Autowired private AccountRepo  accountRepo;
	@Autowired private TransactionRepo transactionRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(WebServiceController.class);
	@PostConstruct
	public void init() {
		if(accountRepo.count() ==0) {
			Account acc0= new Account("3333", "Mary Perkinson", LocalDateTime.now());
			Account acc1= new Account("1111", "Jack Johns", LocalDateTime.now());
			Account acc2= new Account("2222", "Henry Williams", LocalDateTime.now());
			accountRepo.save(acc0);
			accountRepo.save(acc1);
			accountRepo.save(acc2);

			List<Account> accounts = accountRepo.findAll();
			Transaction tr1= new Transaction(accounts.get(0), accounts.get(1), 1500.0,LocalDateTime.now());
			Transaction tr2= new Transaction(accounts.get(1), accounts.get(0), 2000.0,LocalDateTime.now());
			transactionRepo.save(tr1);
			transactionRepo.save(tr2);			
		}
	}

	@GetMapping("/account/{accountid}")
	public Msgg searchAccount(@PathVariable String accountid){
		Account searchedAccount = accountRepo.findById(accountid).get();
		List<Transaction> transactionOut = transactionRepo.findSpecificFromId(accountid);
		List<Transaction> transactionIn = transactionRepo.findSpecificToId(accountid);
		
		double sumOut=0;
		double sumIn=0;
		for(Transaction transaction:transactionOut) {
			sumOut += transaction.getAmount();
		}
		for(Transaction transaction:transactionIn) {
			sumIn += transaction.getAmount();			
		}
		double balance = sumIn-sumOut;
		
		Msgg mymsgg = new Msgg(searchedAccount, transactionOut, transactionIn, balance);
		return mymsgg;		
	}
	
	@PostMapping("/account/save")
	public Message saveAccount(@RequestBody Account account) {
		account.setCreateDate(LocalDateTime.now());
		Account accountSaved = accountRepo.save(account);
		Message msg= new Message(accountSaved);
		return msg;
		
	}
	
	@GetMapping("/transaction/to/{accountid}")
	public TrInOutMessage to(Account account1, @PathVariable String accountid){
		account1= accountRepo.findById(accountid).get();
		List<Transaction> to = transactionRepo.findSpecificToId(accountid);
		TrInOutMessage trmsg= new TrInOutMessage(account1, to);
		return trmsg;
		
	}
	@GetMapping("/transaction/from/{accountid}")
	public TrOutMessage from(Account account1,@ PathVariable String accountid){
		account1= accountRepo.findById(accountid).get();
		List<Transaction> from = transactionRepo.findSpecificFromId(accountid);
		TrOutMessage tromsg= new TrOutMessage(account1, from);
		return tromsg;
	}
	
	@PostMapping("/transaction/save")
	public TMessage saveTransaction(@RequestBody TransactionPayload payload) {
		Account account1= accountRepo.findById(payload.getFrom()).get();		
		Account account2= accountRepo.findById(payload.getTo()).get();
		Transaction transactionToSave = new Transaction(account1, account2, payload.getAmount(), payload.getCreateDate());
		Transaction transactionToSaved= transactionRepo.save(transactionToSave);

		TMessage tmsg= new TMessage(transactionToSaved);
		return tmsg;
	}
	
	class Message{
		private String message;
		@DBRef
		private Account data;
		
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
		public TMessage(String message, Transaction data) {
			super();
			this.message = message;
			this.data = data;
		}
		public TMessage(String message) {
			super();
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
		public Transaction getData() {
			return data;
		}
		public void setData(Transaction data) {
			this.data = data;
		} 
	}
	class Msgg{
		private String message;
		@DBRef
		private Account data;
		@DBRef
		private List<Transaction> transactionOut;
		private List<Transaction> transactionIn;
		private double balance;
		public Msgg(Account data, List<Transaction> transactionOut, List<Transaction> transactionIn, double balance) {
			if(accountRepo.findById(data.getId())==null) {
				this.message="ERROR:account doesnt exist!";
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
		public Msgg(String message, Account data, List<Transaction> transactionOut, List<Transaction> transactionIn,
				double balance) {
			super();
			this.message = message;
			this.data = data;
			this.transactionOut = transactionOut;
			this.transactionIn = transactionIn;
			this.balance = balance;
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
	class TrInOutMessage{
		private String message;
		@DBRef
		private Account data;
		@DBRef
		private List<Transaction> transactionIn;
		
		public TrInOutMessage(Account account, List<Transaction> transactionIn) {
			if(transactionRepo.findSpecificToId(account.getId())==null) {
				this.message="ERROR:account doesn’t exist";
				this.data=null;
			}
			else {
				this.message= "SUCCESS";
				this.data=account;
				this.transactionIn=transactionIn;
			}
		}
		
		public TrInOutMessage(String message, Account data, List<Transaction> transactionIn) {
			super();
			this.message = message;
			this.data = data;
			this.transactionIn = transactionIn;
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
			if(transactionRepo.findSpecificFromId(account.getId())==null) {
				this.message="ERROR:account doesn’t exist";
				this.data=null;
			}
			else {
				this.message= "SUCCESS";
				this.data=account;
				this.transactionOut=transactionOut;
			}
		}
		
		public TrOutMessage(String message, Account data, List<Transaction> transactionOut) {
			super();
			this.message = message;
			this.data = data;
			this.transactionOut = transactionOut;
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
	
}
