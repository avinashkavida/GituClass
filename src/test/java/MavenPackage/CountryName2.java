package MavenPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountryName2 {
  @Test
  public void gl() {
	  String name = "Greenland";
	  Assert.assertEquals("Greenland", name);
	  System.out.println("The Given Country is :"+name);  
  }
  @Test
  public void hk() {
	  String name = "Hongkong";
	  Assert.assertEquals("Hongkong", name);
	  System.out.println("The Given Country is :"+name);  
  }
  @Test
  public void hg() {
	  String name = "Hungary";
	  Assert.assertEquals("Hungary", name);
	  System.out.println("The Given Country is :"+name);  
  } @Test
  public void il() {
	  String name = "Ireland";
	  Assert.assertEquals("Ireland", name);
	  System.out.println("The Given Country is :"+name);  
  } @Test
  public void ind() {
	  String name = "India";
	  Assert.assertEquals("India", name);
	  System.out.println("The Given Country is :"+name);  
  } @Test
  public void jd() {
	  String name = "Jordan";
	  Assert.assertEquals("Jordan", name);
	  System.out.println("The Given Country is :"+name);  
  }
 @Test
public void ky() {
	  String name = "Kenya";
	  Assert.assertEquals("Kenya", name);
	  System.out.println("The Given Country is :"+name);  
 } @Test
public void ko() {
	  String name = "Korea";
	  Assert.assertEquals("Korea", name);
	  System.out.println("The Given Country is :"+name);  
 } 
}
