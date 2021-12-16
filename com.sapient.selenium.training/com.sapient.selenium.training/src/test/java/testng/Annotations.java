package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test(priority=1)
  public void createEntityTest() {
	  System.out.println("Annotations_TEST ONE");
  }
  @Test(priority=2)
  public void updateEntityTest() {
	  System.out.println("Annotations_TEST TWO");
  }
  @Test(priority=3)
  public void deleteEntityTest() {
	  System.out.println("Annotations_TEST THREE");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotations_beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Annotations_afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotations_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Annotations_afterClass");
  }

 /* @BeforeTest
  public void beforeTest() {
	  System.out.println("Annotations_beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Annotations_afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Annotations_beforeSuite");
  }
  

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Annotations_afterSuite");
  }*/

}
