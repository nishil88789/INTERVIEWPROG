package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass {

   @BeforeClass
   public static void setupBeforeClass() throws Exception{
	System.out.println("Running Before Class");
  }
   @Before
   public void setupBefore() throws Exception {
	   System.out.println("Running Before");
   }
   @AfterClass
   public static void setupAfterClass() throws Exception {
	   System.out.println("Running After Class");
   }
   @After
   public void setupAfter() throws Exception {
	   System.out.println("Runnig After");
   }
   
   @Test
   public void testAdd() {
	   System.out.println(Calculation.add(1, 2));
   }
}
