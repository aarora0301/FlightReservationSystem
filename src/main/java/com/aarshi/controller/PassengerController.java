package com.aarshi.controller;

import com.aarshi.dto.request.CreatePassengerRequest;
import com.aarshi.dto.response.CreatePassengerResponse;
import com.aarshi.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/passenger")
public class PassengerController {

  @Autowired
  PassengerService passengerService;

  @RequestMapping(value = "/createPassenger", method = RequestMethod.POST)
  @ResponseBody
  CreatePassengerResponse createPassenger( @Validated@RequestBody CreatePassengerRequest passengerRequest){
    return passengerService.createPassengerResponse(passengerRequest);
  }

}
