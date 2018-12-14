package com.aarshi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {

  private Long flightId;
  private Long flightNumber;
  private Long price;
  private String source;
  private  String destination;
  private String departureTime;
  private String arrivalTime;
  private Integer seatsLeft;
  private String Description;
  private Plane plane;
  private Reservation reservation;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="flight_id")
  public Long getFlightId() {
    return flightId;
  }

  public void setFlightId(Long flightId) {
    this.flightId = flightId;
  }

  @Column(name="price")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  @Column(name="source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  @Column(name="destination")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  @Column(name="departure_time")
  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  @Column(name="arrival_time")
  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  @Column(name="seats_left")
  public Integer getSeatsLeft() {
    return seatsLeft;
  }

  public void setSeatsLeft(Integer seatsLeft) {
    this.seatsLeft = seatsLeft;
  }

  @Column(name="description")
  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }


  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "plane_id")
  public Plane getPlane() {
    return plane;
  }

  public void setPlane(Plane plane) {
    this.plane = plane;
  }

  @Column(name="flight_number")
  public Long getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(Long flightNumber) {
    this.flightNumber = flightNumber;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="fk_reservation")
  public Reservation getReservation() {
    return reservation;
  }

  public void setReservation(Reservation reservation) {
    this.reservation = reservation;
  }

  @Override
  public String toString() {
    return "Flight{" +
        "flightId=" + flightId +
        ", flightNumber=" + flightNumber +
        ", price=" + price +
        ", source='" + source + '\'' +
        ", destination='" + destination + '\'' +
        ", departureTime='" + departureTime + '\'' +
        ", arrivalTime='" + arrivalTime + '\'' +
        ", seatsLeft=" + seatsLeft +
        ", Description='" + Description + '\'' +
        ", plane=" + plane +
        ", reservation=" + reservation +
        '}';
  }
}
