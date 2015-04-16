package com.monecole;

import junit.framework.Assert;

import org.junit.Test;

public class PowerTest {
	Power power = new Power();
	@Test
	public void testCarre() {
		int resultat = power.Carre(3);
		Assert.assertEquals(9, resultat);
		
	}
	@Test(expected = RuntimeException.class)
	public void CarreNull(){
		power.Carre(null);
	}
	
	
}
