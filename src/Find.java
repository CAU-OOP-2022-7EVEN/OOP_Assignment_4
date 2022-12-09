import Model.Accident;
import Model.Car;
import Model.Tune;

class Find {


    public void findCar(String type, int maxPrice, int minPrice, int maxDistanceDriven, int minDistanceDriven, int maxYear, int minYear, String fuel, boolean isAccident, boolean isTuned) {

        ArrayList<Car> resultCarList = new ArrayList<>();

        for (Car car : Car.cars ){
            if (type == All) {
                if (fuel == All) {
                    if (car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear &&  car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        resultCarList.add(car);
                    }
                }
                else {
                    if (car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear && car.getFuel().equals(fuel) && car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        resultCarList.add(car);
                    }
                }

            else {
                if (fuel == all) {
                    if (car.getType().equals(type) && car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear && car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        resultCarList.add(car);
                    }
                }

                else {
                    if (car.getType().equals(type) && car.getPrice() <= maxPrice && car.getPrice() >= minPrice && car.getDistanceDriven() <= maxDistanceDriven && car.getDistanceDriven() >= minDistanceDriven && car.getYear() <= maxYear && car.getYear() >= minYear && car.getFuel().equals(fuel) && car.getIsAccident() == isAccident && car.getIsTuned() == isTuned) {
                        resultCarList.add(car);
                    }
                }

                }
            }
        }
        return resultCarList;
    }
}




