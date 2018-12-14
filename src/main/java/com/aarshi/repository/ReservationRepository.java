package com.aarshi.repository;

import com.aarshi.model.Plane;
import com.aarshi.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation,Long>{


}