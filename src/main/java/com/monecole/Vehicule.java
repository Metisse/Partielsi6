/**
 * 
 */
package com.monecole;

/**
 * @author sio
 *
 */
public class Vehicule {
	int cynlindre = 0;
	int prix =0;
	int moteur = 0;
	public Vehicule() {
		prix=1000;
	}
	
	public int augmentePrix() {
		prix = prix + 1;
		return prix;
	}
	public int changeCylindre() {
		cynlindre = cynlindre + 1;
		return cynlindre;
	}
}
