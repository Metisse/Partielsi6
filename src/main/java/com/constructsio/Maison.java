package com.constructsio;

public class Maison extends Batiment{
	int prix = 150000;
	
	
	public Maison(boolean construction, boolean paiment) {
		super(construction, paiment);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
		 if (prix <=0) {
		     throw new RuntimeException("nombre superieur a 0 ");				 
		  }
	}
	
	
}
