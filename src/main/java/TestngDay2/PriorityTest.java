package TestngDay2;

import org.testng.annotations.Test;

public class PriorityTest {

	/**  always non priority test execute first
	 *   we can give negative priority 
	 *   we can give char 'a' in priority but it is take ascii value
	 * 
	 */
	
	@Test(priority = 'a')
	public void atest() {
		System.out.println("a----test");
	}
	@Test(priority = 1)
	public void btest() {
		System.out.println("b----test");
	}
	@Test(priority = 2)
	public void ctest() {
		System.out.println("c----test");
	}
	
	@Test
	public void dtest() {
		System.out.println("d----test");
	}
	
	@Test
	public void etest() {
		System.out.println("e----test");
	}
	
	
}
