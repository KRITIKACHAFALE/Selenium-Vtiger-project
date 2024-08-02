package Vtigertestcases;

import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClass;
import Com.Crm.Pom.Contacts;
import Com.Crm.Pom.Home;
public class CreateContact extends BaseClass {

	@Test
	public void createContact()
	{
		
		Home h = new Home(driver);
		h.contacts();
		
		Contacts c = new Contacts(driver);
		c.plus();
		c.firstName("Rutuja");
		c.lastName("Pingle");
		c.group();
		c.startDate("2024-09-10");
		c.endDate("2024-11-10");
		c.saveBtn();		
	}
}
