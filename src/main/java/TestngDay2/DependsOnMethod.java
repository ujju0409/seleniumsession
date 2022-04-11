package TestngDay2;

import org.testng.annotations.Test;

public class DependsOnMethod {

	
	@Test
	public void loginTest() {
		System.out.println("login    test");
		//int i =9/0;
	}
	
	
	@Test(dependsOnMethods = "loginTest")
	public void titleTest() {
		System.out.println("title    test");
		int i=9/0;
	}
	
	
	@Test(dependsOnMethods = {"loginTest","titleTest"})
	public void serchTest() {
		System.out.println("serch    test");
	}
	
	
	
}
