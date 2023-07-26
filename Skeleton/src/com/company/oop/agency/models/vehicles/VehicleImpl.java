package com.company.oop.agency.models.vehicles;

import com.company.oop.agency.models.vehicles.contracts.Vehicle;
import  java.lang.reflect.Type;
public class VehicleImpl implements Vehicle {



    private  int passengerCapacity;
    private  double pricePerKm;
    private VehicleType type;

    public VehicleImpl(int passengerCapacity, double pricePerKm, VehicleType type) {
        setPassengerCapacity(passengerCapacity);
        setPricePerKm(pricePerKm);
        setType(type);
    }


    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }


    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    @Override
    public double getPricePerKilometer() {
        return pricePerKm;
    }

    @Override
    public VehicleType getType() {
        return type;
    }
}
