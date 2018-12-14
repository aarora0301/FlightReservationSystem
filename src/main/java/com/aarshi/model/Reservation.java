package com.aarshi.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "reservation")
public class Reservation {

  private Long reservationId;
  private Long reservationNumber;
  private Long price;
  private Set<Flight> flights = new HashSet<>();
  private Passenger passenger;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "reservation_id")
  public Long getReservationId() {
    return reservationId;
  }


  public void setReservationId(Long reservationId) {
    this.reservationId = reservationId;
  }

  @Column(name="price")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  @OneToMany(mappedBy = "reservation")
  public Set<Flight> getFlights() {
    return flights;
  }

  public void setFlights(Set<Flight> flights) {
    this.flights = flights;
  }

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "fk_passenger_id")
  public Passenger getPassenger() {
    return passenger;
  }

  public void setPassenger(Passenger passenger) {
    this.passenger = passenger;
  }

  @Column(name="reservation_number")
  public Long getReservationNumber() {
    return reservationNumber;
  }

  public void setReservationNumber(Long reservationNumber) {
    this.reservationNumber = reservationNumber;
  }

  @Override
  public String toString() {
    return "Reservation{" +
        "reservationId=" + reservationId +
        ", reservationNumber=" + reservationNumber +
        ", price=" + price +
        ", flights=" + flights +
        ", passenger=" + passenger +
        '}';
  }
}
