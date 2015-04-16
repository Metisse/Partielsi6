package com.assusio2;



import org.junit.Assert;
import org.junit.Test;

public class testVehicule {

	@Test
	public void test() {
		Vehicule v1 = new Vehicule();
		Assert.assertEquals(2000, v1.prix);
		Assert.assertEquals(v1.nom, "vehi_");
		Assert.assertEquals(2500, v1.CalculerPrix());
	}

}
