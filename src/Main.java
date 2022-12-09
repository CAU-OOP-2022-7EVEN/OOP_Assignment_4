import Model.Accident;
import Model.Car;
import Model.Tune;
import Model.User;

import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String pw = sc.next();

        int logincode = Login(id, pw);
        // LOGIN success - > program start
        Car testCar = new Car("Veloster N", "Hyundai", "123구1234", "White", 2300, 5, 87120, 2019, "Gasoline", true, true);
        testCar.addAccident(new Accident("2022. 11. 28. 12:00", "차선변경 중 상대방 과실 100% 접촉사고. 좌측 휀더 교환"));
        testCar.addTune(new Tune("2022. 10. 23.", "배기구 2개, 가변밸브 1개"));
        testCar.printCarInfo();
    }

    static int Login(String id, String pw){
        if(id.equals("sans") && pw.equals("1234")){
            System.out.println("seller login");
            return 1; // seller login
        } else if ((id.equals("Son") && pw.equals("1234")) || (id.equals("Yoo") && pw.equals("1234"))){
            System.out.println("customer login");
            return 0; // customer login
        } 
        System.out.println("wrong id or pw");
        return -1; // wrong login trying
    }

}
