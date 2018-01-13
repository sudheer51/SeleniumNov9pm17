package org.h2k.openmrs.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenMRSHelper {

	WebDriver driver;
	public OpenMRSHelper(WebDriver driver)
	{
		this.driver = driver;
	}
	public void login(String username,String password)
	{
		  //Send username and password
		  driver.findElement(By.id("username")).clear();
		  driver.findElement(By.id("username")).sendKeys("Admin");
		  driver.findElement(By.id("password")).clear();
		  driver.findElement(By.id("password")).sendKeys("Admin123");

		  //Pick 'Inpatient Ward'
		  driver.findElement(By.id("Inpatient Ward")).click();

		  //Click Login 
		  driver.findElement(By.id("loginButton")).click();
	}
	public void logout()
	{
		driver.findElement(By.xpath("html/body/header/ul/li[3]/a/i")).click();
	}
}
