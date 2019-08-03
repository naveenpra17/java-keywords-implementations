package com.stackroute.keywordsassignment;

public class Scooty implements Bike {
    private int wheels;
    private int mileage;

    public void wheels(){
        wheels=5;

    }
    public void mileage(){
        mileage=10;
    }

    public static void main(String[] args) {
        Scooty bike=new Scooty();
        bike.wheels();
        bike.mileage();
        System.out.println(bike.wheels);
        System.out.println(bike.mileage);

    }

}
