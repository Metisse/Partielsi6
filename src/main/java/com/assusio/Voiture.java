package com.assusio;

public class Voiture extends Vehicule {
	
	boolean tatouageVitre;
	
	public Voiture(int prix){
		super(prix);
		
	
		}
	public void tatouerVitre() {
		tatouageVitre = true;
	}
	public void detatouer(){
		tatouageVitre = false;
	}

}
