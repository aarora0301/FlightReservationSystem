package com.aarshi.dao;

import com.aarshi.model.Flight;
import com.aarshi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FlightDao {

  @Autowired
  FlightRepository flightRepository;

  public Flight saveFlight(Flight flight){
    return flightRepository.save(flight);
  }

  public Flight getFlight(Long flight_id){
    return flightRepository.getFlight(flight_id);
  }

  public Flight getFlightByFlightNumber(Long flightNumber){
    return  flightRepository.getFlightByFlightNumber(flightNumber);
  }

  public void deleteFlight(Long flight_id){
     flightRepository.deleteFlight(flight_id);
  }
}
