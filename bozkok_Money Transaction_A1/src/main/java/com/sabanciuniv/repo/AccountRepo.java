package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sabanciuniv.model.Account;

public interface AccountRepo extends MongoRepository<Account, String>{
	@Query("{account.id:'?0'}")
	public String findWithId(String id);

}
   