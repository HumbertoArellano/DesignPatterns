package com.arellano.designpatterns.openclose;

/* Este design patterns consta de que dichas clases una unica
 * cosa dentro de ellas y no extenderlas con responsabilidades
 * que no les toca.
 *
 * Ejemplo;
 * Class: Dog
 * Todo lo relacionado con 'dog' y no de otros animales tambien.
 * */

public class Dog implements IComida{
    private String raza;
    private int years;
    private int establecimiento;
    private float cantidadDeComida;

    public Dog(String raza, int years, int establecimiento, float cantidadDeComida) {
        this.raza = raza;
        this.years = years;
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

    public int getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(int establecimiento) {
        this.establecimiento = establecimiento;
    }

    public float getCantidadDeComida() {
        return cantidadDeComida;
    }

    public void setCantidadDeComida(float cantidadDeComida) {
        this.cantidadDeComida = cantidadDeComida;
    }

    @Override
    public float cantidadDeComidaPorEstablecimiento() {
        return this.establecimiento * cantidadDeComida;
    }
}
