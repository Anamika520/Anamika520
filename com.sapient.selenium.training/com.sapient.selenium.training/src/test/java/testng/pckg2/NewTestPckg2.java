package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTestPckg2 {
	@Test(priority=1)
	  public void testOne() {
		  System.out.println("NewTestPckg2_TEST ONE");
	  }
	  @Test(priority=2)
	  public void testTwo() {
		  System.out.println("NewTestPckg2_TEST TWO");
	  }
	  @Test(priority=3)
	  public void testThree() {
		  System.out.println("NewTestPckg2_TEST THREE");
	  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("NewTestPckg2_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("NewTestPckg2_afterClass");
  }

}
