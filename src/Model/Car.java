package Model;

import java.util.ArrayList;

public class Car{
    private String name;
    private String manufacture;
    private String number;
    private int price;
    private int capacity;
    private int year;
    private boolean isAccident;
    private ArrayList<Accident> accidents;

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

    public String getName(){
        return this.name;
    }

    public String getManufacture(){
        return this.manufacture;
    }

    public String getNumber(){
        return this.number;
    }

    public int getPrice(){
        return this.price;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getYear(){
        return this.year;
    }

    public boolean getIsAccident(){
        return this.isAccident;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setManufacture(String manufacture){
        this.manufacture = manufacture;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setIsAccident(boolean isAccident){
        this.isAccident = isAccident;
    }
}