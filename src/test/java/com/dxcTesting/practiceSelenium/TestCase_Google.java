package com.dxcTesting.practiceSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestCase_Google {
	
	WebDriver driver;
	String baseUrl="http:\\google.com";
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }
  
  @Test
  public void f() throws InterruptedException {
	  driver.get(baseUrl);
	  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Test");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.partialLinkText("Speedtest by Ookla")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Apps")).click();
		System.out.println("Test Passed");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
