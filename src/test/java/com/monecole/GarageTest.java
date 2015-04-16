package com.monecole;

import junit.framework.Assert;

import org.junit.Test;

public class GarageTest {

	@Test
	public void testCreerVoiture() {

		Garage garage = new Garage();

		garage.creerVoitures();
		Vehicule v1 = new Voiture();
		Voiture v2 = new Voiture();
	
		
		garage.voiture1.cynlindre=1000;
		Assert.assertEquals("audi", garage.voiture1.getMarque());
		Assert.assertEquals("opel", garage.voiture2.getMarque());
	}

}
