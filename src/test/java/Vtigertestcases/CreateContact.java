package Vtigertestcases;

import org.testng.annotations.Test;

import com.crm.Baseclass.BaseClass;
public class CreateContact extends BaseClass {

	@Test
	public void createContact()
	{
		
		Home h = new Home(driver);
		h.contacts();
		
		Contacts c = new Contacts(driver);
		c.plus();
		c.firstName("krutika");
		c.lastName("chafale");
		c.group();
		c.startDate("2024-09-10");
		c.endDate("2024-11-10");
		c.saveBtn();		
	}
}
