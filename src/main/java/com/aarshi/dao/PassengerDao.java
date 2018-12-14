package com.aarshi.dao;

import com.aarshi.model.Passenger;
import com.aarshi.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class  PassengerDao  {

  @Autowired
  PassengerRepository passengerRepository;

  public Passenger savePassenger(Passenger  passenger){
   return passengerRepository.save(passenger);
  }

  public Passenger getPassenger(String phoneNumber){
    return passengerRepository.getPassengerByPhoneNumber(phoneNumber);
  }


}
