package com.aarshi.service;


import com.aarshi.dao.FlightDao;
import com.aarshi.dao.PassengerDao;
import com.aarshi.dao.ReservationDao;
import com.aarshi.dto.request.CreateFlightRequest;
import com.aarshi.dto.request.CreateReservationRequest;
import com.aarshi.dto.response.CreateFlightResponse;
import com.aarshi.dto.response.CreateReservationResponse;
import com.aarshi.model.Flight;
import com.aarshi.model.Passenger;
import com.aarshi.model.Reservation;
import com.aarshi.repository.ReservationRepository;
import com.aarshi.util.ReservationNotFoundException;
import java.util.Set;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReservationService {

  @Autowired
  ReservationDao reservationDao;

  @Autowired
  FlightDao flightDao;

  @Autowired
  FlightService flightService;

  @Autowired
  PassengerDao passengerDao;

  public CreateReservationResponse createReservation(CreateReservationRequest createReservationRequest){
    CreateReservationResponse response=new CreateReservationResponse();
    try{
   Passenger passenger= passengerDao.getPassenger(createReservationRequest.getPassengerPhoneNumber());
    if(passenger==null)
      throw new ReservationNotFoundException("Passenger does not exist");

    Set<Flight> flightLists=createReservationRequest.getFlights();

    if(!flightService.checkFlightsAvailability(flightLists))
      throw new Exception("Not enough seats available");

    Long totalPrice=0L;

    for(Flight flight:flightLists){
      totalPrice+=flight.getPrice();
    }
      Reservation reservation=new Reservation();
    reservation.setFlights(flightLists);
    reservation.setPrice(totalPrice);
    reservation.setReservationNumber(123L);
    reservationDao.saveReservation(reservation);
    passenger=passengerDao.getPassenger(createReservationRequest.getPassengerPhoneNumber());
    passenger.setReservation(reservation);
    passengerDao.savePassenger(passenger);
    for(Flight flight: flightLists){
      flight.setSeatsLeft(flight.getSeatsLeft()-1);
      flight.setReservation(reservation);
      flightDao.saveFlight(flight);
    }


    return response;
  }
  catch(ReservationNotFoundException ex){
      response.setMessage(ex.getMessage());
      return  response;
    }
    catch(Exception e){
      response.setMessage(e.getMessage());
      return  response;

    }
  }

}
