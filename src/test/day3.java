package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void beforeclass()
	{
	System.out.println("before executing any methods in the class");
	}
	
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebLogincarLoan(String urlname, String key) 
	{
		//login into web application
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	
	@BeforeMethod
	public void beforeevery ()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afterevery ()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After executing all methods in the class");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLogincarLoan()
	{
		//login to mobile app
		System.out.println("Mobilelogincar");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void MobileSignincarLoan()
	{
		//login to mobile app
		System.out.println("Mobile SIGNIN");
	}
	
	@Test(dataProvider="getData")
	public void MobileSignoutcarLoan(String username, String password)
	{
		//login to mobile app
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods={"WebLogincarLoan","MobileSignoutcarLoan"})
	public void APIcarLoan()
	{
		//Rest API automation
		System.out.println("APIlogincar");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-username&password - good credit history =row
		//2nd comb-username&password - no credit history
		//3rd comb- fraudulent credit history
		Object[][] data= new Object[3][2];
		//first set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are values for that particular combination
		
		//second set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}
	
}
