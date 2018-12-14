package com.aarshi.service;

import com.aarshi.dao.FlightDao;
import com.aarshi.dao.PlaneDao;
import com.aarshi.dto.request.CreateFlightRequest;
import com.aarshi.dto.response.CreateFlightResponse;
import com.aarshi.model.Flight;
import com.aarshi.model.Plane;
import java.util.Set;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FlightService {

  @Autowired
  FlightDao flightDao;

  @Autowired
  PlaneDao planeDao;

  @Autowired
  ReservationService reservationService;

  public CreateFlightResponse createFlightResponse(CreateFlightRequest flightRequest){

    CreateFlightResponse response= new CreateFlightResponse();
    Flight flight;
    try{

      flight =flightDao.getFlightByFlightNumber(flightRequest.getFlightNumber());
          if(flight!=null){
           response.setCode(0);
           response.setMessage("Flight Already Exists" + flight.getFlightId());
           response.setFlightId(flight.getFlightId());
           return response;
          }
          else {
            Plane plane = new Plane();
            plane.setCapacity(flightRequest.getCapacity());
            plane.setManufacturer(flightRequest.getManufacturer());
            plane.setModel(flightRequest.getModel());
            plane.setYearOfManufacture(flightRequest.getYearOfManufacture());
            flight = new Flight();
            flight.setArrivalTime(flightRequest.getArrivalTime());
            flight.setDepartureTime(flightRequest.getDepartureTime());
            flight.setDestination(flightRequest.getDestination());
            flight.setFlightNumber(flightRequest.getFlightNumber());
            flight.setSource(flightRequest.getSource());
            flight.setDestination(flightRequest.getDestination());
            flight.setPrice(flightRequest.getPrice());
            flight.setPlane(plane);
            flightDao.saveFlight(flight);
            Flight retrieveFlight = flightDao.getFlightByFlightNumber(flightRequest.getFlightNumber());
            response.setMessage("Flight Successfully Created");
            response.setCode(1);
            response.setFlightId(retrieveFlight.getFlightId());
            return response;
          }

    }

    catch(Exception ex){
     ex.printStackTrace();
     }
    return response;
  }

  public Boolean checkflightAvailability(Long flightNumber){
    Boolean status=false;
    try{
      Flight flight=flightDao.getFlightByFlightNumber(flightNumber);
      if(flight != null)
        status=flight.getSeatsLeft()>0;
      else throw new Exception ("Flight does not Exists");
    }
    catch(Exception ex){
      ex.getMessage();
    }
    return  status;
  }

  public Boolean checkFlightsAvailability(Set<Flight> flights){
    Boolean flightStatus=true;
    for(Flight flight: flights){
      flightStatus=flightStatus&& checkflightAvailability(flight.getFlightNumber());
    }
      return flightStatus;
  }

}
