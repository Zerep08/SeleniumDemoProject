package com.selenium.test.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Prueba {

@Test(priority=2)  //(groups= {"smoke"})
  public void movf() {
	  System.out.println("probando testNG");
  }
  
  @Test(priority=1)  //(groups= {"smoke"})
  public void movg() {
	  System.out.println("punto movg");
  }
  
  
  //@Parameters({"a","b"})
  @Test(priority=0)
  public void g() {
	  System.out.println("punto g");
	
  }
  
  @BeforeClass
  public void wea() {
	  System.out.println("Ejecutando el beforeclass de la wea");
  }
  
  /*
  @BeforeMethod
  public void method() {
	  System.out.println("Ejecutando el method");
  }*/

  @BeforeTest
  public void antes() {
	  System.out.println("Ejecutanto el befotest");
  }
  
  @Test(dependsOnMethods= {"g","movf"})
  public void otrometodo() {
	  
	  System.out.println("Dependiendo del g");
  }

  
  
  @Test(dataProvider="numbers")
  public void add(String a, String b) {
	  System.out.println("");
	  System.out.println("********");
	  System.out.println(a+b);
	  System.out.println("********");
  }
  
  
  
  
  @DataProvider
  public Object[][] numbers(){
	  Object[][] obj = new Object[3][2];
	  
	  obj[0][0] = 1;
	  obj[0][1] = 2;
	  obj[1][0] = 3;
	  obj[1][1] = 4;
	  obj[2][0] = 5;
	  obj[2][1] = 6;
	  
	  return obj;
  }
  
  
  
}
