import Model.Accident;
import Model.Car;
import Model.Tune;

public class Main{
    public static void main(String[] args){
        Car testCar = new Car("Veloster N", "Hyundai", "123구1234", "White", 2300, 5, 87120, 2019, "Gasoline", true, true);
        testCar.addAccident(new Accident("2022. 11. 28. 12:00", "차선변경 중 상대방 과실 100% 접촉사고. 좌측 휀더 교환"));
        testCar.addTune(new Tune("2022. 10. 23.", "배기구 2개, 가변밸브 1개"));
        testCar.printCarInfo();
    }
}