package com.constructsio;

public class Option {
	int prix;
	String description = "Option non défini";
	public Option(int prix, String description) {
		super();
		this.prix = prix;
		this.description = description;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
