package com.aarshi.controller;

import com.aarshi.dto.request.CreateFlightRequest;
import com.aarshi.dto.response.CreateFlightResponse;
import com.aarshi.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/flight")
public class FlightController {

  @Autowired
  FlightService flightService;

  @RequestMapping(value = "/createFlight", method = RequestMethod.POST)
  @ResponseBody
  CreateFlightResponse createFlight(@Validated @RequestBody CreateFlightRequest createFlight){
    return flightService.createFlightResponse(createFlight);
  }

}
