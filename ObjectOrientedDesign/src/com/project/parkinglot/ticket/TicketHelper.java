package com.project.parkinglot.ticket;

import com.parkinglot.cost.BusCostCalculator;
import com.parkinglot.cost.CarCostCalculator;
import com.parkinglot.cost.CostCalculator;
import com.parkinglot.vehicle.Bus;
import com.parkinglot.vehicle.Car;
import com.parkinglot.vehicle.Vehicle;
import com.parkinglot.vehicle.VehicleTypes;

public class TicketHelper {

    public Vehicle createVehicle(String registerNumber, VehicleTypes type) {
        if (type == VehicleTypes.Car) {
            return new Car(registerNumber);
        } else if (type == VehicleTypes.Bus) {
            return new Bus(registerNumber);
        }
        return null;
    }

    public CostCalculator getCostCalculator(VehicleTypes types) {
        if (types == VehicleTypes.Car) {
            return new CarCostCalculator();
        } else if (types == VehicleTypes.Bus) {
            return new BusCostCalculator();
        }
        return null;
    }
}