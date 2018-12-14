package com.aarshi.model;


import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.springframework.boot.autoconfigure.web.ResourceProperties.Strategy;

@Entity
@Table(name = "plane")
public class Plane {

  private Long planeId;
  private String model;
  private String manufacturer;
  private Integer capacity;
  private String yearOfManufacture;

  public Flight flight;

  @Id @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="plane_id")
  public Long getPlaneId() {
    return planeId;
  }

  public void setPlaneId(Long planeId) {
    this.planeId = planeId;
  }

  @Column(name="model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Column(name="manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  @Column(name="capacity")
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  @Column(name="year_of_manufacture")
  public String getYearOfManufacture() {
    return yearOfManufacture;
  }

  public void setYearOfManufacture(String yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
  }


@OneToOne(mappedBy = "plane")
  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  @Override
  public String toString() {
    return "Plane{" +
        "planeId=" + planeId +
        ", model='" + model + '\'' +
        ", manufacturer='" + manufacturer + '\'' +
        ", capacity=" + capacity +
        ", yearOfManufacture='" + yearOfManufacture + '\'' +
        '}';
  }
}
