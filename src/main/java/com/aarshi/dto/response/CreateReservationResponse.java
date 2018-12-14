package com.aarshi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateReservationResponse {

  @JsonProperty
  private int reservation_id;
  @JsonProperty
  private Long totalFare;
  @JsonProperty
  private String message;


  public int getReservation_id() {
    return reservation_id;
  }

  public void setReservation_id(int reservation_id) {
    this.reservation_id = reservation_id;
  }

  public Long getTotalFare() {
    return totalFare;
  }

  public void setTotalFare(Long totalFare) {
    this.totalFare = totalFare;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "CreateReservationResponse{" +
        "reservation_id=" + reservation_id +
        ", totalFare=" + totalFare +
        ", message='" + message + '\'' +
        '}';
  }
}
