package com.aarshi.repository;

import com.aarshi.model.Passenger;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface PassengerRepository  extends CrudRepository<Passenger,Long> {

  @Query("Select p from Passenger p where p.phoneNumber = :phone_number")
  public Passenger getPassengerByPhoneNumber(@Param("phone_number") String phone_number);


}
