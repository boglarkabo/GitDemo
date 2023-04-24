package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String uname) 
	{
		//login into web application
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
		
	}
	
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//login to mobile app
		System.out.println("Mobileloginhome");
	}
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APIloginhome");
	}
	
}
