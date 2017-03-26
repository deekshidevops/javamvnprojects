package com.mycompany.app;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestPrimeNumbers {
  @Test
  public void testPrimeNumber() {
	  PrimeNumbers pn = new PrimeNumbers();
	  Assert.assertTrue(pn.isPrime(5));
	  Assert.assertFalse(pn.isPrime(4));
	  Assert.assertEquals(true, pn.isPrime(11));
	  Assert.assertEquals(false, pn.isPrime(10));
  }
}
