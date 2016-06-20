package com.on_check;

import javax.persistence.*;

@Entity
@Table(name="location")
public class Location {

    @Id
    @Column(name="name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
