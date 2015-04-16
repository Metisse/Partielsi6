package com.assusio;

public class Vehicule {
	int prix;
	public String nom="ktm";
	 Option option1 = new Option(1,"");
	 Option option2 = new Option(2,"");
	 
	public Vehicule(int prix) {
		super();
		this.prix = prix;
		if (prix<=0){
			throw new  RuntimeException("Le prix n'est pas valide");
		}
	}
	
	public int calculerPrix() {
		return prix + option1.prix + option2.prix;
	}
}
