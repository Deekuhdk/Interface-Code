package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface Deposit extends MongoRepository<BankPojo , Integer> {
  public double deposit(int amount);
}
