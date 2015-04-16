package com.assusio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testVoiture {

	@Test
	public void prixVoiture() {
		Voiture vo1 = new Voiture(1500);
		assertEquals(1500, vo1.prix);
	}

	@Test(expected = RuntimeException.class)
	public void testPrixZero() {
		 new Voiture(0);

	}

}
