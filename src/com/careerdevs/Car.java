package com.careerdevs;

public class Car {

    // 1) Fields
    private String make ;
    private String model ;
    private String year ;

    // 2) Constructor/s

    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    // 3) Getter/Setter


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

