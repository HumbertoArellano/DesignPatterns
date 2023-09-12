package com.arellano.designpatterns.liskovandsegregation;

public class Jaguar implements IFelinoSalvaje{
	public final static String newLine = System.lineSeparator();
    private Integer edad;
	private String habitat;

	public Jaguar(Integer edad, String habitat){
		this.edad = edad;
		this.habitat = habitat;
	}

	public Integer getEdad() { return this.edad; }

	public void setEdad(Integer edad) { this.edad = edad; }

	public String getHabitat() { return this.habitat; }

	public void setHabitat(String habitat) { this.habitat = habitat; }

	@Override
	public String cazar() {
		return "El felino salvaje puede cazar";
	}

	@Override
	public String rugir() {
		return "El felino puede rugir";
	}

	@Override
	public String toString() {
		return "Edad: " + this.edad + newLine + this.habitat;
	}
}
