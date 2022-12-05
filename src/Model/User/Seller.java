package Model.User;

import Model.Car;

import java.util.ArrayList;

public class Seller extends User {
    public Seller(String name, ArrayList<Car> CarList) {
        setIsSeller(true);
        setName(name);
        setCarList(CarList);
    }

    public void AddCar(Car newCar){
        Cars.add(newCar);
        // 신규 판매 차량 등록, 차량 리스트에 새로운 차량 추가
        // 파일 입출력을 통해 판매 차량 명단 txt 파일에 차량에 대한 정보 추가
        // 파일 내용 로직 상에서 갱신하는 과정 필요
    }

}