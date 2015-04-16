package com.assusio;


import org.junit.Assert;
import org.junit.Test;


public class testVehicule {

	@Test
	public void test() {
		Vehicule v1 = new Vehicule(2000);
		Assert.assertEquals(2000, v1.prix);
		Assert.assertEquals(2001, v1.prix + v1.option1.prix);
		Assert.assertEquals(2002, v1.prix + v1.option2.prix);
		Assert.assertEquals(2003, v1.calculerPrix());
	}

}
