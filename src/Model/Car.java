package Model;

public class Car{
    private String name;
    private String manufacture;
    private String number;
    private int price;
    private int capacity;
    private int year;
    private boolean isAccident;

    public Car(String name, String manufacture, String number, int price, int capacity, int year, boolean isAccident){
        this.name = name;
        this.manufacture = manufacture;
        this.number = number;
        this.price = price;
        this.capacity = capacity;
        this.year = year;
        this.isAccident = isAccident;
    }

    public void printCarInfo(){
        System.out.printf("Name : %s\nManufacture : %s\nNumber : %s\nPrice : %d\nCapacity : %d\nYear : %d\nHas Accident History : %s\n", name, manufacture, number, price, capacity, year, this.isAccident ? "Y" : "N");
    }
}