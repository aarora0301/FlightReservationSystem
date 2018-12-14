package com.aarshi.repository;

import com.aarshi.model.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface FlightRepository  extends CrudRepository<Flight,Long> {


  @Query("Select f from Flight f where f.flightId=:flight_id")
  public Flight getFlight(@Param("flight_id") Long flight_id);

  @Query ("Select f from Flight f where f.flightNumber=:flight_number")
    public Flight getFlightByFlightNumber(@Param("flight_number") Long flight_number);

  @Query("Delete from Flight f where f.flightId=:flight_id")
  public void deleteFlight(@Param("flight_id") Long flight_id);

}
