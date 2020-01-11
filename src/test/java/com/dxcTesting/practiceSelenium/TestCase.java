package com.dxcTesting.practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		String baseURL="http://www.google.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		//driver.findElement(By.className("gLFyf gsfi")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Test");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.partialLinkText("Speedtest by Ookla")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Apps")).click();
		driver.close();
		System.out.println("Test Passed");

	}

}
