package testng.pckg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test
	  public void testOne() {
		  System.out.println("NewTest2_TEST ONE");
	  }
	  @Test
	  public void testTwo() {
		  System.out.println("NewTest2_TEST TWO");
	  }
	  @Test
	  public void testThree() {
		  System.out.println("NewTest2_TEST THREE");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("NewTest2_beforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("NewTest2_afterClass");
	  }
}
