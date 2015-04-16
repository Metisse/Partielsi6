package com.monecole;

import org.junit.Assert;
import org.junit.Test;

public class VehiculeTest {

	@Test
	public void test() {
		Vehicule v3 = new Vehicule();
		v3.prix = 2000;
		Assert.assertEquals(2001, v3.augmentePrix());
		Assert.assertEquals(2002, v3.augmentePrix());
	}
	@Test
	public void test2() {
		Moto m1 = new Moto();
		Assert.assertEquals(1501, m1.changeCylindre());
	}
	@Test
	public void test3() {
		Moto m2 = new Moteur ();
		Assert.assertEquals(4, m2.moteur);
	}
}
