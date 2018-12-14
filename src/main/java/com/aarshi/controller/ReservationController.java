package com.aarshi.controller;

import com.aarshi.dto.request.CreateFlightRequest;
import com.aarshi.dto.request.CreateReservationRequest;
import com.aarshi.dto.response.CreateReservationResponse;
import com.aarshi.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {

  @Autowired
  ReservationService reservationService;

  @RequestMapping(value = "/createReservation", method = RequestMethod.POST)
  @ResponseBody
  CreateReservationResponse createReservation(@Validated @RequestBody CreateReservationRequest createReservationRequest){
    return  reservationService.createReservation(createReservationRequest);
  }



}
