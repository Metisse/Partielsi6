/**
 * 
 */
package com.monecole;

/**
 * @author sio
 *
 */
public class Power {
		
	Calculette calculette = new Calculette ();
	Calculette calculette2 = new Calculette ();
	public Integer Carre (Integer nombre1){
		if (nombre1 == null){
			throw new RuntimeException("impossible de faire car le nombre est null");
		}
		return calculette.multiplication(nombre1, nombre1);					
	}
}
