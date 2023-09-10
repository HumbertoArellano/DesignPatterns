package com.arellano.designpatterns.singleresponsibility;

public class Cat {
    private String raza;
    private int years;

    public Cat(String raza, int years) {
        this.raza = raza;
        this.years = years;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Raza: " + this.raza + "\nYears: " + this.years;
    }
}
