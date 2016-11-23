package com.hertz.service;

import com.hertz.controller.ReservastionCar;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 11/23/2016.
 */
public class ReservationService {

    @Autowired
    ReservastionCar reservastionCar;

    public String getConformationCar(){
        return "12345";
    }

    public String bookTypeCar(){
        return "Ford";
    }

}
