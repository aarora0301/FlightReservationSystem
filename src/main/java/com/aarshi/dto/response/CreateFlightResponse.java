package com.aarshi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateFlightResponse {

  @JsonProperty("message")
  private String message;
  @JsonProperty("code")
  private  Integer code;
  @JsonProperty("flightId")
  private Long flightId;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Long getFlightId() {
    return flightId;
  }

  public void setFlightId(Long flightId) {
    this.flightId = flightId;
  }

  @Override
  public String toString() {
    return "CreateFlightResponse{" +
        "message='" + message + '\'' +
        ", code=" + code +
        ", flightId=" + flightId +
        '}';
  }
}
