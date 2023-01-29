package com.sabanciuniv.repo;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sabanciuniv.model.Account;
import com.sabanciuniv.model.Transaction;

public interface TransactionRepo extends MongoRepository<Transaction, String>{
	
	@Query("{'from.id':'?0'}")
	public List<Transaction> findSpecificFromId(String id);
	
	@Query("{'Amount.from':'?0'}")
	public List<Transaction> findSpecificFromAmount(double Amount);
	
	@Query("{'to.id':'?0'}")
	public List<Transaction> findSpecificToId(String id);
	
	@Query("{'Amount.to':'?0'}")
	public List<Transaction> findSpecificToAmount(double Amount);
	
}
