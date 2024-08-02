package Vtigertestcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.crm.Baseclass.BaseClass;
import com.crm.FileUtility.JavaUtility;
import com.crm.pom.HomePage;

import Com.Crm.Pom.Home;

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