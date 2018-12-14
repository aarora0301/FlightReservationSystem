package com.aarshi.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.JoinColumn;

public class CreateFlightRequest {

  @JsonProperty("flightNumber")
  private Long flightNumber;

  @JsonProperty("price")
  private Long price;

  @JsonProperty("source")
  private String source;

  @JsonProperty("destination")
  private String destination;

  @JsonProperty("departureTime")
  private String departureTime;

  @JsonProperty("arrivalTime")
  private String arrivalTime;

  @JsonProperty("seatsLeft")
  private  Integer seatsLeft;

  @JsonProperty("capacity")
  private Integer capacity;

  @JsonProperty("model")
  private String model;

  @JsonProperty("manufacturer")
  private String manufacturer;

  @JsonProperty("year_of_manufacture")
  private String yearOfManufacture;


  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public Integer getSeatsLeft() {
    return seatsLeft;
  }

  public void setSeatsLeft(Integer seatsLeft) {
    this.seatsLeft = seatsLeft;
  }

  public Long getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(Long flightNumber) {
    this.flightNumber = flightNumber;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getYearOfManufacture() {
    return yearOfManufacture;
  }

  public void setYearOfManufacture(String yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
  }

  @Override
  public String toString() {
    return "Flight{" +
        "flightNumber=" + flightNumber +
        ", price=" + price +
        ", source='" + source + '\'' +
        ", destination='" + destination + '\'' +
        ", departureTime='" + departureTime + '\'' +
        ", arrivalTime='" + arrivalTime + '\'' +
        ", seatsLeft=" + seatsLeft +
        ", capacity=" + capacity +
        ", model='" + model + '\'' +
        ", manufacturer='" + manufacturer + '\'' +
        ", yearOfManufacture='" + yearOfManufacture + '\'' +
        '}';
  }
}
