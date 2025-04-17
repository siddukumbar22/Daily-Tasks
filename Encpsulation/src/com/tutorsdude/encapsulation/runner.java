package com.tutorsdude.encapsulation;

import com.tutorsdude.encapsulation.object.Car;

public class runner {


        public static void main(String[] args) {

            Car car = new Car();

            byte NoOfWheels = 2;

            car.setNoOfWheels(NoOfWheels);
            System.out.println(car.getNoOfWheels());

            byte Average = 12;

            car.setAverage(Average);
            System.out.println(car.getaverage());

            byte NoOfSeats = 6;

            car.setNoOfSeats(NoOfSeats);
            System.out.println(car.getnumberOFSeats());

            byte NoOfDoors = 4;
            car.setNoOfDoors(NoOfDoors);
            System.out.println(car.getNoOfDoors());

            byte TopSpeed = 126;

            car.setTopSpeed(TopSpeed);
            System.out.println(car.getopSpeed());


            car.setWeight((short) 9000);
            System.out.println(car.getWeight());

            car.setSeries((short) 626);
            System.out.println(car.getSeries());

            car.setManufacturingYear((short) 9000);
            System.out.println(car.getManufacturingYear());

            car.setCarNumber(9999);
            System.out.println(car.getcarNumber());

            car.setPrice(855000);
            System.out.println(car.getPrice());

            car.setManufacturingPerYear(50000);
            System.out.println(car.getManufacturingPerYear());

            car.setNoOfDistributers(223);
            System.out.println(car.getNoOfDistributers());

            car.setFastagNumber(343212112);
            System.out.println(car.getfastagNumber());

            car.setcarCompany("bmw");
            System.out.println(car.getcarCompany());

            car.setCarName("bmw xs");
            System.out.println(car.getcarName());

            car.setDrivingType("manual");
            System.out.println(car.getdrivingType());

            car.setOwnerName("siddu");
            System.out.println(car.getOwnerName());

            car.setManufacturingLocation("japan");
            System.out.println(car.getManufacturingLocation());

            car.setColor("black");
            System.out.println(car.getColor());

            car.setEngineType("petrolEngie");
            System.out.println(car.getEngineType());

            car.setCarType("fuel");
            System.out.println(car.getCarType());

            car.setCarVersion((float) 1.4);
            System.out.println(car.getCarVersion());

            car.setSellingRatio((float) 6.7);
            System.out.println(car.getSellingRatio());

            car.setProfitRatio((float) 8.7);
            System.out.println(car.getProfitRatio());


            car.setPerformanceIsGood(false);
            System.out.println(car.getPerformanceIsGood());

            car.setAverageIsBad(true);
            System.out.println(car.getaverageIsBad());


    }

}
