package lesson10.parking;

import lesson10.parking.Cars.*;

/**
 * Created by Артём on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car sedan1 = new Sedan("Toyota", "Corolla",2015, "АВ2544-5", "black", 1.6);
        Car sedan2 = new Sedan("Volkswagen", "Polo",2010, "АВ2534-5", "white", 1.4);
        Car crossover1 = new Crossover("KIA", "Sportage",2012, "ВВ1243-5", "blue", "four-wheel drive");
        Car bus1 = new Bus("Volkswagen", "Transporter",2008, "ЕЕ2984-7", "yellow", 20);
        Car bus2 = new Bus("Mercedes", "Sprinter",2009, "ЕА1111-7", "green", 22);
        Car bus3 = new Bus("Газель", "NEXT",2017, "АА6666-5", "dirty dirt", Integer.MAX_VALUE);
        Car truck1 = new Truck("MAN", "Bigcar",2011, "АР9327-5", "white", 20.7 );

        Garage.drivesIn(sedan1);
        Garage.drivesIn(sedan2);
        Garage.drivesIn(bus1);
        Garage.drivesIn(bus2);
        Garage.drivesIn(bus3);
        Garage.drivesIn(crossover1);
        Garage.drivesIn(crossover1);
        Garage.drivesIn(crossover1);

        Garage.numberOfCars();
//        Garage.numberOfTypeOfCars();

        Garage.drivesOut(crossover1);
        Garage.drivesOut(bus3);
        Garage.drivesOut(truck1);

        Garage.numberOfCars();
//        Garage.numberOfTypeOfCars();
    }
}
