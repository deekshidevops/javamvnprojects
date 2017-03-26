package com.mycompany.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFactorial {
  @Test
  public void testFactorial() {
	  Factorial factorial = new Factorial();
	  Assert.assertEquals(24,factorial.factorial(4));
  }
}
