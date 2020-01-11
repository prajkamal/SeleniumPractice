package com.dxcTesting.practiceSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNGTestGrouping {

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@Test(groups= {"cars","suv"})
	public void AUDIQ5() {
		System.out.println("Running Test - AUDI Q5 SUV");
	}

	@Test(groups={"cars","sedan"})
	public void AUDIA6() {
		System.out.println("Running Test - Audi A6 Sedan");
	}

	@Test(groups= {"bike"})
	public void HONDACBR() {
		System.out.println("Running Test - HONDACBR Bike");
	}

	@Test(groups= {"bike"})
	public void NINJA() {
		System.out.println("Running Test - NNJA Bike");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("After Class");
	}

}
