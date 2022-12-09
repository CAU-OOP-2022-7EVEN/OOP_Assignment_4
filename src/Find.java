import Model.Accident;
import Model.Car;
import Model.Tune;
import Model.User;
import java.util.ArrayList;
class Find {


    public ArrayList<Car> findCar(String type, int maxPrice, int minPrice, int maxDistanceDriven, int minDistanceDriven, int maxYear, int minYear, String fuel, boolean isAccident, boolean isTuned) {

        ArrayList<Car> resultCarList = new ArrayList<>();

        for (Car car : User.getCarList()) {
            if (type.equals("All")) {
                if (fuel.equals("All")) {
                    if (car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear &&  car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        resultCarList.add(car);
                    }
                }
                else {
                    if (car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear && car.getFuel().equals(fuel) && car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        resultCarList.add(car);
                    }
                }
            }
            else {
                if (fuel.equals("All")) {
                    if (car.getType().equals(type) && car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear && car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        resultCarList.add(car);
                    }
                } else {
                    if (car.getType().equals(type) && car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear && car.getFuel().equals(fuel) && car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        resultCarList.add(car);
                    }
                }
            }
        }
        return resultCarList;
    }
}




