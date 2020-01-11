package com.dxcTesting.practiceSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import basePackage.baseTestSuite;

public class TestNGAnnotations2 extends baseTestSuite {
	
	@BeforeClass
	public void beforeClass1() {
		System.out.println("Execute @BeforeCLass before class");
	}
	

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("Excute this before test method");

	}

	@Test
	public void testCase1() {
		System.out.println("This is a test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("This is a test case 2");
	}

	@AfterMethod
	public void afterMethod1() {
		System.out.println("Excute this after test method");

	}
	
	@AfterClass
	public void afterClass1() {
		System.out.println("Execute @AfterCLass after class");
	}
}
