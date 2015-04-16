package com.assusio2;

public class Vehicule {
	public int prix = 2000;
	public String nom = "vehi_";
	
	public Vehicule(int prix) {
		super();
		this.prix = prix;
	}

	Option option1 = new Option(200 ,"op1");
	Option option2 = new Option(300, "op2");
	
	public int CalculerPrix(){
		return prix+option1.getPrix()+option2.getPrix();
	}

	public Vehicule() {
		// TODO Auto-generated constructor stub
	}

	public Vehicule(int prix, String nom) {
		super();
		this.prix = prix;
		this.nom = nom;
	}
}
