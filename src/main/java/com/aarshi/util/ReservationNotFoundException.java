package com.aarshi.util;

import ch.qos.logback.core.encoder.EchoEncoder;

public class ReservationNotFoundException extends Exception {

  public ReservationNotFoundException(String message){
    super(message);
  }


}
