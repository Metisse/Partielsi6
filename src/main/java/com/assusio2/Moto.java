package com.assusio2;

public class Moto extends Vehicule{
	boolean antivol= true;

	
	public Moto(int prix, String nom, boolean antivol) {
		super(prix);
		this.nom = this.nom+nom;
		this.antivol = antivol;
	}
	public Moto() {
		// TODO Auto-generated constructor stub
	}
	public void setAntivol(){
		antivol=true;
	}
	public void removeAntivol(){
		antivol=false;
	}
	public boolean hasAntivol(){
		return antivol;
	}
}
