package com.on_check;

public interface LocationDAOInterface {

    void persistLocation(Location location);

    Location findLocationByName(String name);
}
