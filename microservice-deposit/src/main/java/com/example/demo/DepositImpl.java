package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;

@Controller
public class DepositImpl {
	public BankPojo bankPojo;
	public double AccountBalance;
	@Autowired
 public Deposit deposit;
	@RequestMapping(value="/deposit/{id}")
	public double deposit(@PathVariable int id, int amount) {
	   
	    AccountBalance += amount;
		return AccountBalance;
	}

	
	
}
