package com.aarshi.dao;

import com.aarshi.model.Plane;
import com.aarshi.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlaneDao {

  @Autowired
  PlaneRepository planeRepo;

  public Plane savePlane(Plane p){
    return planeRepo.save(p);
  }



}
