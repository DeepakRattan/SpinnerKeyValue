package com.example.deepakrattan.spinnerkeyvalue;

/**
 * Created by deepak.rattan on 1/4/2017.
 */

public class City {
    String id, city;

    public City(String id, String city) {
        this.id = id;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return city;
    }
}
