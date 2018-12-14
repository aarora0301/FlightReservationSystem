package com.aarshi.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePassengerRequest {


  @JsonProperty("firstName")
  String firstName;
  @JsonProperty("lastName")
  String lastName;
  @JsonProperty("age")
  Integer age;
  @JsonProperty("gender")
  Character gender;
  @JsonProperty("phoneNumber")
  String phoneNumber;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Character getGender() {
    return gender;
  }

  public void setGender(Character gender) {
    this.gender = gender;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Passenger{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", gender=" + gender +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
