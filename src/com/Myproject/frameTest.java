package com.Myproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frameTest {
	@Test
	public void frames() {
		System.setProperty("webdriver.chrome.driver", "E:\\Imp Jars\\Selenium Jars\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.javatpoint.com/");
		driver.findElement(By.linkText("Selenium")).click();
		WebElement Scroll = driver.findElement(By.xpath("//div[@class='leftmenu']/a[text()='Scrolling a Web Page']"));
		Scroll.click();
		driver.close();

	}

}
