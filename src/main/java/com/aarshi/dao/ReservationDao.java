package com.aarshi.dao;

import com.aarshi.model.Reservation;
import com.aarshi.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationDao {

@Autowired
  ReservationRepository reservationRepository;

public Reservation saveReservation(Reservation res){
  return  reservationRepository.save(res);
}
}
