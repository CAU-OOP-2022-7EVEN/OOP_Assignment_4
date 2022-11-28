import Model.Accident;
import Model.Car;

public class Main{
    public static void main(String[] args){
        Car testCar = new Car("Veloster N", "Hyundai", "123구1234", 2300, 5, 2019, true);
        testCar.addAccident(new Accident("2022. 11. 28. 12:00", "차선변경 중 상대방 과실 100% 접촉사고. 좌측 휀더 교환"));
        testCar.printCarInfo();
    }
}