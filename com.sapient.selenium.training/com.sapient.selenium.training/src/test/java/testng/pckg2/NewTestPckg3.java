package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTestPckg3 {
	@Test
	  public void testOne() {
		  System.out.println("NewTestPckg3_TEST ONE");
	  }
	  @Test
	  public void testTwo() {
		  System.out.println("NewTestPckg3_TEST TWO");
	  }
	  @Test
	  public void testThree() {
		  System.out.println("NewTestPckg3_TEST THREE");
	  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("NewTestPckg3_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("NewTestPckg3_afterClass");
  }

}
