/**
 * 
 */
package com.monecole;

/**
 * @author sio
 *
 */
public class Garage {
	Voiture voiture1 = new Voiture();
	Voiture voiture2 = new Voiture();
	
	public void creerVoitures() {
		voiture1.setMarque("audi");
		voiture2.setMarque("opel");
		System.out.println(voiture1.getMarque());
		System.out.println(voiture2.getMarque());
		

	}
}
