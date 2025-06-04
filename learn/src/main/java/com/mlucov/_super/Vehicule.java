package com.mlucov._super;

public class Vehicule {
    private String make;    //
    private String color;   // Vehicle Fields
    private int year;       //
    private String model;   //


    public Vehicule(String make, String color, int year, String model) {
        this.make = make;    //
        this.color = color;  // Constructor of Vehicle
        this.year = year;    //
        this.model = model;  //
    }

    public void printDetails() {  //public method to print details
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }
}
