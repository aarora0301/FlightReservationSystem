package com.aarshi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePassengerResponse {

  @JsonProperty("message")
  private String message;
  @JsonProperty("code")
  private  Integer code;
  @JsonProperty("passengerId")
  private String passengerId;

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

  public String getPassengerId() {
    return passengerId;
  }

  public void setPassengerId(String passengerId) {
    this.passengerId = passengerId;
  }

  @Override
  public String toString() {
    return "CreatePassengerResponse{" +
        "message='" + message + '\'' +
        ", code=" + code +
        ", passengerId='" + passengerId + '\'' +
        '}';
  }
}
