package com.construction;

import junit.framework.Assert;

import org.junit.Test;

import com.constructsio.Immeuble;

public class ImmeubleTest {
	
	@Test
	public void ImmeubleFirstTest(){
		Immeuble I1 = new Immeuble(false, false);
		Assert.assertEquals(false, I1.isConstruction());
		Assert.assertEquals(false, I1.isPaiment());
		Assert.assertEquals(0, I1.getEtage());
		I1.setEtage(3);
		Assert.assertEquals(3, I1.getEtage());
	}
}
