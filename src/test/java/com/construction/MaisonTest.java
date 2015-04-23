package com.construction;


import junit.framework.Assert;

import org.junit.Test;

import com.constructsio.Maison;

public class MaisonTest {

	@Test
	public void MaisonFirstTest() {
		Maison m1 = new Maison(false, false);
		Assert.assertEquals(150000, m1.getPrix());
		Assert.assertEquals(false, m1.isPaiment());
		Assert.assertEquals(false, m1.isConstruction());
		
	}
	@Test
	public void MaisonModif(){
		Maison m1 = new Maison(false, false);
		m1.enConstruction();
		Assert.assertEquals(true, m1.isConstruction());
		m1.paimentBon();
		Assert.assertEquals(true, m1.isPaiment());
		m1.paimentPasBon();
		Assert.assertEquals(false, m1.isPaiment());
	}

}
