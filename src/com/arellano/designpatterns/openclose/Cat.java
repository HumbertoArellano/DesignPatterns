package com.arellano.designpatterns.openclose;

public class Cat implements IComida{
    private String raza;
    private int years;

    private int establecimiento;
    private float cantidadDeComida;
    public Cat(String raza, int years) {
        this.raza = raza;
        this.years = years;
    }

    public Cat(int establecimiento, float cantidadDeComida) {
        this.establecimiento = establecimiento;
        this.cantidadDeComida = cantidadDeComida;
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
    public float cantidadDeComidaPorEstablecimiento() {
        return this.establecimiento * cantidadDeComida;
    }

    @Override
    public String toString() {
        return "Raza: " + this.raza + "\nYears: " + this.years;
    }
}
