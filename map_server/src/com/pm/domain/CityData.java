package com.pm.domain;

import java.io.Serializable;

public class CityData implements Serializable {
    private String name;
    private int value;
    private float longtitude;
    private float altitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public float getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(float longtitude) {
        this.longtitude = longtitude;
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "CityData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", longtitude=" + longtitude +
                ", altitude=" + altitude +
                '}';
    }
}
