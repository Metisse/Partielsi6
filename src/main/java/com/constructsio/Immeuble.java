package com.constructsio;

public class Immeuble extends Batiment {
		int prix = 1000000;
		int etage;
		
	public Immeuble(boolean construction, boolean paiment) {
		super(construction, paiment);
		// TODO Auto-generated constructor stub
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
		 if (prix <=0) {
		     throw new RuntimeException("nombre superieur a 0 ");				 
		  }
	}
	
	
	
}
