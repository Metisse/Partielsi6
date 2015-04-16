package com.assusio;

public class Moto extends Vehicule {
	
	boolean antivol;
	
	public Moto(int prix){
		super(prix);
		super.prix= prix *2;
	
		}
	public void setAntivol() {
		antivol = true;
	}
	public void removeAntivol(){
		antivol = false;
	}
	public boolean hasAntivol(){
		return  antivol ;
	}
}
