package com.on_check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("locationService")
public class LocationService implements  LocationServiceInterface{

    @Autowired
    LocationDAO locationDAO;

    @Override
    @Transactional
    public void persistLocation(Location location) {
        locationDAO.persistLocation(location);
    }

    @Override
    @Transactional
    public Location findLocationByName(String name) {
        return locationDAO.findLocationByName(name);
    }

}
