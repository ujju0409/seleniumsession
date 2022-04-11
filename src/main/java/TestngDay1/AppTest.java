package TestngDay1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * 
BS
BT
BC

  BM
  titleTest
  AM
  
  
  BM
  urlTest
  AM
  
AC
AT
AS
 *
 */


public class AppTest {
	@BeforeSuite
	public void connectToDB()
	{
		System.out.println("BS");
	}	
	
	@BeforeTest
	public void creatuser() {
		System.out.println("BT");
	}
	
	@BeforeClass
	 public void lunchBrowser() {
		 System.out.println("BC");
	 }
	
	@BeforeMethod
	public void Setup() {
		System.out.println("BM");
		
	}
	
	@Test
	public void  titleTest() {
		System.out.println("titleTest");
	}
	
	@Test
	public void urlTest() {
		System.out.println("urlTest");
	}

	@AfterMethod
	public void logout()
	{
		System.out.println("AM");
	}	
	
    @AfterClass
    public void  closeBrowser()
    {
    	System.out.println("AC");
    }   
    	
   @AfterTest
   public void deletUser() {
	   System.out.println("AT");
	   
   }
   @AfterSuite
   public void tearDown() {
	   System.out.println("AS");
   }
   
	
	
	
}
