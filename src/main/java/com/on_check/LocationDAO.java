package com.on_check;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("locationDAO")
public class LocationDAO implements LocationDAOInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void persistLocation(Location location) {
        sessionFactory.getCurrentSession().persist(location);
    }

    @Override
    public Location findLocationByName(String name) {
        return (Location) sessionFactory.getCurrentSession().get(Location.class, name);
    }
}
