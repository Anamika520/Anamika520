package testng.pckg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	@Test(priority=1)
	  public void testOne() {
		  System.out.println("NewTest_TEST ONE");
	  }
	  @Test(priority=2)
	  public void testTwo() {
		  System.out.println("NewTest_TEST TWO");
	  }
	  @Test(priority=3)
	  public void testThree() {
		  System.out.println("NewTest_TEST THREE");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("NewTest_beforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("NewTest_afterClass");
	  }
}
