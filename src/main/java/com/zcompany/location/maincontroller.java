package com.zcompany.location;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontroller {

    @GetMapping ("/locations")
    public String getLocations() {

        return "Locations";
    }
}