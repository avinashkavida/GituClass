package MavenPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountryName1 {
      @Test	 
	  public void ja() {
		  String name = "Japan";
		  Assert.assertEquals("Japan", name);
		  System.out.println("The Given Country is :"+name);  
	  }
      @Test	 
	  public void ru() {
		  String name = "Russia";
		  Assert.assertEquals("Russia", name);
		  System.out.println("The Given Country is :"+name);  
	  }
      @Test	 
	  public void at() {
		  String name = "Austria";
		  Assert.assertEquals("Austria", name);
		  System.out.println("The Given Country is :"+name);  
	  }
      @Test	 
	  public void ant() {
		  String name = "Antarctica";
		  Assert.assertEquals("Antarctica", name);
		  System.out.println("The Given Country is :"+name);  
	  }
      @Test	 
	  public void chi() {
		  String name = "Chile";
		  Assert.assertEquals("Chile", name);
		  System.out.println("The Given Country is :"+name);  
	  }
      @Test	 
	  public void fi() {
		  String name = "Fiji";
		  Assert.assertEquals("Fiji", name);
		  System.out.println("The Given Country is :"+name);  
	  }
    
}