package lesson10.parking;

import lesson10.parking.Cars.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Артём on 12.03.2017.
 */
public class Garage {

    private static Map <Car, Integer> garageMap = new HashMap<>();

    public static void drivesIn(Car car) {
        garageMap.put (car, garageMap.containsKey(car) ?  garageMap.get(car) + 1: 1);
    }

    public static void drivesOut(Car car) {
        if (!garageMap.containsKey(car)) {
            System.out.println("There is no "+car.getClass().getSimpleName().toString()+" in garage.");
        } else if (garageMap.get(car) == 1) {
            garageMap.remove(car);
        }else {
            garageMap.put(car, garageMap.get(car) - 1);
        }
    }

    public static void numberOfCars() {
        System.out.println("Cars in garage:");
            for (Map.Entry<Car, Integer> entry : garageMap.entrySet()) {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
    }
//    Я тут поназапутывался, не смог догнать как пробежаться по классам ключей одной карты, сравнить их
//    и загнать в другую карту.

//    public void numberOfCarsOfCertainType() {
//
//        Map<String, Integer> certainType = new HashMap<String, Integer>(garageMap);
//
//        int numberOfSameTypes = 0;
//        for (Map.Entry<String, Integer> type : garage.entrySet()) ;
//        {
//            if (certainType.containsKey(garageMap.getClass().toString())) {
//                certainType.put(certainType.getClass().getSimpleName(), numberOfSameTypes + 1);
//            } else {
//                certainType.put(certainType.getClass().getSimpleName(), numberOfSameTypes);
//            }
//        }
//        for (Map.Entry<String, Integer> entry : certainType.entrySet()) {
//            System.out.println("Number of cars of  " + entry.getKey() + " class -  " + entry.getValue());
//        }
//    }
}
