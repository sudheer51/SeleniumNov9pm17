package org.h2k.openmrs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Modify the code for the branch US_12345
 * @author qa
 *
 */
public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver)
	{
		this.driver= driver;
	}
	public void registerPatient()
	{
		driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
		driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[1]/ul/li[1]/span")).click();
		driver.findElement(By.name("givenName")).sendKeys("Mr");
		driver.findElement(By.name("familyName")).sendKeys("abc");
		
		driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[1]/ul/li[2]")).click();
		driver.findElement(By.xpath(".//*[@id='gender-field']/option[1]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[1]/ul/li[3]")).click();
		driver.findElement(By.id("birthdateDay-field")).sendKeys("10");
		new Select(driver.findElement(By.id("birthdateMonth-field"))).selectByVisibleText("January");
		driver.findElement(By.id("birthdateYear-field")).sendKeys("1990");
		
		driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[2]/ul/li[1]")).click();
		driver.findElement(By.id("address1")).sendKeys("abc");
		driver.findElement(By.id("address2")).sendKeys("abc");
		
		driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[2]/ul/li[2]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("+123-1251515");

		driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[3]/ul/li")).click();
		
		driver.findElement(By.xpath(".//*[@id='formBreadcrumb']/li[4]")).click();
		driver.findElement(By.id("submit")).click();;

	}
}
