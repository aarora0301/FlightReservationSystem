package com.aarshi.dto.request;

import com.aarshi.model.Flight;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;

public class CreateReservationRequest {

  @JsonProperty
  private Set<Flight> flights;
  @JsonProperty("passenger_phone_number")
  private String passengerPhoneNumber;


  public String getPassengerPhoneNumber() {
    return passengerPhoneNumber;
  }

  public void setPassengerPhoneNumber(String passengerPhoneNumber) {
    this.passengerPhoneNumber = passengerPhoneNumber;
  }

  public Set<Flight> getFlights() {
    return flights;
  }

  public void setFlights(Set<Flight> flights) {
    this.flights = flights;
  }

  @Override
  public String toString() {
    return "CreateReservationRequest{" +
        "flights=" + flights +
        ", passengerPhoneNumber='" + passengerPhoneNumber + '\'' +
        '}';
  }
}
