package com.arellano.designpatterns.openclose;

public class Caballos implements IComida{
    private String velocidad;
    private String raza;
    private int years;
    private int establecimiento;
    private float cantidadDeComida;

    public Caballos(String velocidad, String raza, int years) {
        this.velocidad = velocidad;
        this.raza = raza;
        this.years = years;
    }

    public Caballos(int establecimiento, float cantidadDeComida) {
        this.establecimiento = establecimiento;
        this.cantidadDeComida = cantidadDeComida;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
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
        return this.raza + " " + this.velocidad + " " + this.years;
    }
}
