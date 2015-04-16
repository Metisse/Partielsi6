package com.monecole;

import junit.framework.Assert;

import org.junit.Test;

public class CalculetteTest {

	Calculette calculette = new Calculette();
	//test addition
	@Test
	public void testAdditionDoitRenvoyerLeBonResultat() {
		int resultat = calculette.addition(2, 3);
		Assert.assertEquals("Mauvais résultat de l'addition", 5, resultat);

	}

	@Test(expected = RuntimeException.class)
	public void testAdditionNeDoitPasAccepterDeParametre1null() {
		calculette.addition(null, 3);
	}

	@Test(expected = RuntimeException.class)
	public void testAdditionNeDoitPasAccepterDeParametre2null() {
		calculette.addition(3, null);
	}
	//test soustraction
	@Test
	public void TestSoustracion(){
		int resultat = calculette.soustraction(6, 3);
		Assert.assertEquals(3, resultat);				
	}
	@Test(expected = RuntimeException.class)
	public void TestSoustractionNull1(){
		calculette.soustraction(2, null);
	}
	@Test(expected = RuntimeException.class)
	public void TestSoustractionNull2(){
		calculette.soustraction(null, 5);
	}
	//test multiplication
	@Test
	public void TestMulti(){
		int resultat =  calculette.multiplication(2, 3);
		Assert.assertEquals(6, resultat);
	}
	@Test(expected = RuntimeException.class)
	public void TestMultiNull1(){
	calculette.multiplication(null, 3);
	}
	@Test(expected = RuntimeException.class)
	public void testMultiNull2(){
		calculette.multiplication(2, null);
	} 
	//test division
	@Test
	public void TestDiv(){
		int resultat =  calculette.division(6, 2);
		Assert.assertEquals(3, resultat);
	}
	@Test(expected = RuntimeException.class)
	public void TestDivNull1(){
	calculette.division(null, 3);
	}
	@Test(expected = RuntimeException.class)
	public void testDivNull2(){
		calculette.division(2, null);
	} 
}
