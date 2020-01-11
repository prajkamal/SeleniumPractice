package com.dxcTesting.practiceSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestNG_DataProviders {
	
	/*
	 * @DataProvider public Object[][] dp() { return new Object[][] { new Object[] {
	 * 1, "a" }, new Object[] { 2, "b" }, }; }
	 */
	
	@DataProvider(name="data")
	public Object[][] dpTest(){
		return new Object[][] {
			{1,"one"},
			{2,"two"},
			{3,"three"}
		};
	}
	
  @Test(dataProvider = "data")
  public void testDP(Integer n, String s) {
	  System.out.println("Integer is : " +n );
	  System.out.println("String is : "+s);
  }


}
