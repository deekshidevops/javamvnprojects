package com.mycompany.app;

public class Factorial {

	   public long factorial(int n) {
	       int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       System.out.println("The factorial of "+n+" is " + result);
	       return result;
	   }
	}