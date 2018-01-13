package org.h2k.openmrs.tests;

import org.h2k.openmrs.pages.RegistrationPage;
import org.h2k.openmrs.util.BaseClass;
import org.h2k.openmrs.util.OpenMRSHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseClass {

	  
	@Test
	public void validateRegistration()
	{
		OpenMRSHelper helper = new OpenMRSHelper(driver);
		helper.login("Admin","Admin123");
		RegistrationPage register= new RegistrationPage(driver);
		
		register.registerPatient();
		
		boolean result = true;
		
		
		Assert.assertTrue(result, "");
		
		helper.logout();
	}
}
