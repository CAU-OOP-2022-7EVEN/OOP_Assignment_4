import Model.Accident;
import Model.Car;
import Model.Tune;
import java.util.Iterator;
import java.util.Scanner;

class Find {


    public static ArrayList<Car> findCar = new ArrayList<>();

    public void findCar(int type, int maxPrice, int minPrice, int maxDistanceDriven, int minDistanceDriven, int maxYear, int minYear, String fuel, boolean isAccident, boolean isTuned) {

        for (Car car : Car.cars ){

            if (type == 0) {
                if (fuel == 0) {
                    if (car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear &&  car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        findCar.add(car);
                    }
                }
                else {
                    if (car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear && car.getFuel().equals(fuel) && car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        findCar.add(car);
                    }
                }

            else {
                if (fuel == 0) {
                    if (car.getType().equals(type) && car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear && car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        findCar.add(car);
                    }
                }

                else {
                    if (car.getType().equals(type) && car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear && car.getFuel().equals(fuel) && car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        findCar.add(car);
                    }
                }

                }
            }
        }
    }
}









/*
    Iterator<Car> iterator = Cars.iterator();
    public void optPriceRange(int min, max) {
        //iterator를 이용하여 Cars의 모든 Car 객체를 순회하며, 해당 Car 객체의 price가 min과 max 사이에 있는지 확인

        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getPrice() >= min && car.getPrice() <= max){
                System.out.println(car.getName());
                //해당 car를
            }
        }
    }

    public void optDistanceDrivenRange(int min, max){
        //iterator를 이용하여 Cars의 모든 Car 객체를 순회하며, 해당 Car 객체의 distanceDriven이 min과 max 사이에 있는지 확인

        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getDistanceDriven() >= min && car.getDistanceDriven() <= max){
                System.out.println(car.getName());
            }
        }
    }

    public void optYearRange(int min, max){
        //iterator를 이용하여 Cars의 모든 Car 객체를 순회하며, 해당 Car 객체의 year가 min과 max 사이에 있는지 확인

        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getYear() >= min && car.getYear() <= max){
                System.out.println(car.getName());
            }
        }
    }

    }

    public void optFuel(String fuel){
        //iterator를 이용하여 Cars의 모든 Car 객체를 순회하며, 해당 Car 객체의 fuel이 fuel과 같은지 확인하고, 해당 Car 객체를 새로운 Arraylist에 추가

        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getFuel().equals(fuel)){
                System.out.println(car.getName());
            }
        }
    }

    }

    public void optManufacture(String manufacture){
        //iterator를 이용하여 Cars의 모든 Car 객체를 순회하며, 해당 Car 객체의 manufacture가 manufacture와 같은지 확인

        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getManufacture().equals(manufacture)){
                System.out.println(car.getName());
            }
        }
    }

    public void optName(String name){
        //iterator를 이용하여 Cars의 모든 Car 객체를 순회하며, 해당 Car 객체의 name이 name과 같은지 확인

        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getName().equals(name)){
                System.out.println(car.getName());
            }
        }
    }


    public void optColor(String color){
        //iterator를 이용하여 Cars의 모든 Car 객체를 순회하며, 해당 Car 객체의 color가 color와 같은지 확인

        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getColor().equals(color)){
                System.out.println(car.getName());
            }
        }
    }


    public void optIsAccident(boolean isAccident){
        //iterator를 이용하여 Cars의 모든 Car 객체를 순회하며, 해당 Car 객체의 isAccident가 isAccident와 같은지 확인

        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getIsAccident() == isAccident){
                System.out.println(car.getName());
            }
        }
    }

    public void optIsTuned(boolean isTuned){
        //iterator를 이용하여 Cars의 모든 Car 객체를 순회하며, 해당 Car 객체의 isTuned가 isTuned와 같은지 확인

        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getIsTuned() == isTuned){
                System.out.println(car.getName());
            }
        }
    }
*/