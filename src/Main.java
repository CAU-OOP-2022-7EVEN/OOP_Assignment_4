import Model.Car;

public class Main{
    public static void main(String[] args){
        Car testCar = new Car("Veloster N", "Hyundai", "123구1234", 2300, 5, 2019, true);
        testCar.printCarInfo();
    }
}