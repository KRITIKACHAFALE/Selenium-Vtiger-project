package Vtigertestcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClass;
import Com.Crm.JavaUtility.JavaUtility;
import Com.Crm.Pom.Home;
import Com.Crm.Pom.HomePage;
import baseclass.JavaUtiltity;

public class CreateOrganizationWithIndustry extends BaseClass {

	@Test
	public void createOrganization()
	{
		Home h = new Home(driver);
		h.organizations();
		
		HomePage org = new HomePage(driver);
		org.plusIcon();
		org.organizationName("sriram laptops"+JavaUtiltity.generateRandomNumber());
		org.selectIndustry("Technology");
		org.group();
		org.assignedto("Team Selling");
		org.saveBtn();
		
		assertTrue((org.getCreatedOrgText().getText()).contains("sriram laptops"));
		assertTrue((org.getIndustryText().getText()).contains("Technology"));
	}

}