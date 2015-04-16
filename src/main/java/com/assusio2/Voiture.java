package com.assusio2;

public class Voiture extends Vehicule {
	boolean tatouageVitre=true;

	public Voiture(boolean tatouageVitre) {
		super();
		this.tatouageVitre = tatouageVitre;
	}

	public Voiture() {
		super();
	}
	
	public void tatouerVitre(){
		tatouageVitre=true;
	}
	public void detatouerVitre(){
		tatouageVitre=false;
	}
		
	
}
