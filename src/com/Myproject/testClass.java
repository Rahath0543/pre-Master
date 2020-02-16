package com.Myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testClass {
	@Test
	public void calculateEMI() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Imp Jars\\Selenium Jars\\SeleniumDrivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		Actions actions = new Actions(driver);
		WebElement homeloancircle = driver.findElement(By.cssSelector("#loanamountslider >span"));
		WebElement interestcircle = driver.findElement(By.cssSelector("#loaninterestslider >span"));
		WebElement tenurecircle = driver.findElement(By.cssSelector("#loantermslider >span"));
		actions.dragAndDropBy(homeloancircle, 83, 0).build().perform();
		Thread.sleep(5000);
		actions.dragAndDropBy(interestcircle, 88, 0).build().perform();
		Thread.sleep(5000);
		actions.dragAndDropBy(tenurecircle, -111, 0).build().perform();
		Thread.sleep(5000);
		
		WebElement amount = driver.findElement(By.cssSelector("#emiamount >p span"));
		String amounttext = amount.getText();
		Assert.assertEquals("92,439", amounttext);
		Thread.sleep(5000);
		driver.quit();
		}

	

}
