package Model;

import java.util.ArrayList;

public class Car{
    private String name;
    private String manufacture;
    private String number;
    private String color;
    private int price;
    private int capacity;
    private int distanceDriven;
    private int year;
    private boolean isAccident;
    private boolean isTuned;
    private final ArrayList<Accident> accidents = new ArrayList<>();
    private final ArrayList<Tune> tunes = new ArrayList<>();

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

        System.out.println("<Accident Info>");
        for(Accident accident : accidents){
            System.out.printf("Accident Date : %s\nAccident Content : %s\n", accident.getDate(), accident.getContent());
        }

        System.out.println("<Tune Info>");
        for(Tune tune : tunes){
            System.out.printf("Tune Date : %s\nTune Content : %s\n", tune.getDate(), tune.getContent());
        }
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

    public String getColor(){
        return this.color;
    }

    public int getPrice(){
        return this.price;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getDistanceDriven(){
        return this.distanceDriven;
    }

    public int getYear(){
        return this.year;
    }

    public boolean getIsAccident(){
        return this.isAccident;
    }

    public boolean getIsTuned(){
        return this.isTuned;
    }

    public ArrayList<Accident> getAccidents(){
        return this.accidents;
    }

    public ArrayList<Tune> getTunes(){
        return this.tunes;
    }

    public void addAccident(Accident accident){
        this.accidents.add(accident);
    }

    public void removeAccident(int idx){
        this.accidents.remove(idx);
    }

    public void addTune(Tune tune){
        this.tunes.add(tune);
    }

    public void removeTune(int idx){
        this.tunes.remove(idx);
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

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setDistanceDriven(int distanceDriven){
        this.distanceDriven = distanceDriven;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setIsAccident(boolean isAccident){
        this.isAccident = isAccident;
    }

    public void setIsTuned(boolean isTuned){
        this.isTuned = isTuned;
    }
}