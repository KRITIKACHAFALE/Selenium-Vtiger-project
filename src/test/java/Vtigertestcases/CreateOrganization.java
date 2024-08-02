package Vtigertestcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClass;
import Com.Crm.JavaUtility.JavaUtility;
import Com.Crm.Pom.Home;
import Com.Crm.Pom.HomePage;

public class CreateOrganization extends BaseClass { 
		
		@Test
		public void create()
		{
			Home h = new Home(driver);
			h.organizations();
			
			HomePage org = new HomePage(driver);
			org.plusIcon();
			org.organizationName("sriram laptops"+JavaUtility.generateRandomNumber());
			org.group();
			org.assignedto("Team Selling");
			org.saveBtn();
			
			assertTrue((org.getCreatedOrgText().getText()).contains("sriram laptops"));
	}
}