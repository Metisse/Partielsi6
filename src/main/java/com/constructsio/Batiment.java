package com.constructsio;

public class Batiment {
	
	int prix = 0;
	boolean paiment = false;
	boolean construction = false;
	
	Option option1 = new Option(0, "Option non défini");
	Option option2 = new Option(0, "Option non défini");
	
	int prixGlobal(){
		return prix+option1.prix+option2.prix;
	}	

	public void enConstruction(){
		construction = true;
	}
	public void pasEnConstruction(){
		construction = false;
	}
	public boolean isConstruction() {
		return construction;
	}
	
	public void paimentBon(){
		paiment=true;
	}
	public void paimentPasBon(){
		paiment=false;
	}

	public Batiment(boolean paiment, boolean construction) {
		super();
		this.paiment = paiment;
		this.construction = construction;
	}



	public Batiment() {
		// TODO Auto-generated constructor stub
	}

	public boolean isPaiment() {
		return paiment;
	}


	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void setConstruction(boolean construction) {
		 this.construction = construction;
		
	}
	public void setPaiment(boolean paiment) {
		this.paiment = paiment;
	}
}
