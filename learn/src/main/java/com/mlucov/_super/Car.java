package com.mlucov._super;

class Car extends Vehicule {    //derived class of Car

    private String bodyStyle;  //Car field

    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);  //parent class constructor
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {  //details of car
        printDetails();         //calling method from parent class
        System.out.println("Body Style: " + bodyStyle);
    }

}
