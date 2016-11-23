package com.hertz.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wie Jie Tjoeng on 11/23/2016.
 */

@RestController
public class ReservastionCar {

    @RequestMapping(value = "/")
    public String sayHello() {
        return "Hello World from Reservation-Microservice ";
    }

    @RequestMapping(value = "/conformation/{number}/{name}")
    public String retrieveReservation(@PathVariable long number, @PathVariable String name){

        // build a simple service component that will query the data in mysql database.

        // Display message for quick unit test
        return "Retrieve for conformation number: " + number
               + " --  Name: " + name;

    }

}
