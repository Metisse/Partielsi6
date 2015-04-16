package com.assusio2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestMoto {

	@Test
	public void test() {
		Moto m1 = new Moto(1500,"mot",true);
		Assert.assertEquals(m1.prix, 1500);
		Assert.assertEquals(m1.nom, "vehi_mot");
		
	}

}
