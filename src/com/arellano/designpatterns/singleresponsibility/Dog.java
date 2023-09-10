package com.arellano.designpatterns.singleresponsibility;

/* Este design patterns consta de que dichas clases una unica
 * cosa dentro de ellas y no extenderlas con responsabilidades
 * que no les toca.
 *
 * Ejemplo;
 * Class: Dog
 * Todo lo relacionado con 'dog' y no de otros animales tambien.
 * */

public class Dog {
    private String raza;
    private int years;


    public Dog(String raza, int years) {
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
