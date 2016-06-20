package com.on_check;

public interface LocationServiceInterface {

    void persistLocation(Location location);

    Location findLocationByName(String name);
}
