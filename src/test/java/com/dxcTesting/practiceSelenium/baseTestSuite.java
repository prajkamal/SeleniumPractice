package com.dxcTesting.practiceSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseTestSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Execute this before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Execute this After test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class from Base Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class from Base Class");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite from Base Class");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite from Base Class");
	}

}
