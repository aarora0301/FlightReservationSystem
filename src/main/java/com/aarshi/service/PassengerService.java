package com.aarshi.service;

import com.aarshi.dao.PassengerDao;
import com.aarshi.dto.request.CreatePassengerRequest;
import com.aarshi.dto.response.CreatePassengerResponse;
import com.aarshi.model.Passenger;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PassengerService {

  @Autowired
  PassengerDao passengerDao;

  public CreatePassengerResponse createPassengerResponse(CreatePassengerRequest createPassenger) {
    CreatePassengerResponse response = new CreatePassengerResponse();
    Passenger passenger = new Passenger();
    passenger.setFirstName(createPassenger.getFirstName());
    passenger.setLastName(createPassenger.getLastName());
    passenger.setAge(createPassenger.getAge());
    passenger.setGender(createPassenger.getGender());
    passenger.setPhoneNumber(createPassenger.getPhoneNumber());
    passengerDao.savePassenger(passenger);

    Passenger retrievePassenger = passengerDao.getPassenger(createPassenger.getPhoneNumber());
    Long passengerId;
    if (retrievePassenger != null) {
      passengerId = retrievePassenger.getPassengerId();
      response.setPassengerId(passengerId.toString());
      response.setCode(1);
      response.setMessage("Passenger Created Successfully");
    }
    return response;
  }


}
