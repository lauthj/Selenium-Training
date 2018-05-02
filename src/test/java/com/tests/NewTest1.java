package com.tests;
//testing pull request

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=1)
  public void f() {
	  System.out.println("in f()");
  }
  @Test(priority=2)
  public void abc()
  {
	  System.out.println("in abc()");
  }
  @Test(priority=3)
  public void xyz()
  {
	 System.out.println("in xyz()"); 
  }
}
