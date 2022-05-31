import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddN() {
//		fail("Not yet implemented");
		int a = 6;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,  b);
		
		int expected = 8;
		assertEquals (expected, actual);
		
	}
	@Test
		public void testAddB() {
//		fail("Not yet implemented");
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,  b);
		
		int expected = 9999;
		assertEquals (expected, actual);
		
		boolean boundaryActual = cal.boundary(a,b);
		boolean boundExpected = false;
		assertEquals (boundExpected, boundaryActual);
	}
	@Test
	public void testAddE() {
//		fail("Not yet implemented");
		
		int a = 99999;
		int b = 99999;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,  b);
	
		String expected = "Error message!";           //can remove
		assertNotEquals (expected, actual);
	
  		boolean boundaryActual = cal.boundary(a,b);
  		boolean boundaryExpected = false;
  		assertEquals (boundaryExpected, boundaryActual);
		}
		
	@Test
     public void testSubN() {
    	 int a = 6;
    	 int b = 2;
    	 
    	 Calculator cal = new Calculator();
    	 int actual = cal.subtract(a, b);
    	 
    	 int expected = 4;
    	 assertEquals (expected, actual);
    	 
     }
	@Test
     public void testSubB() {
    	 int a = 9999;
    	 int b = 0;
    	 
    	 Calculator cal = new Calculator();
    	 int actual = cal.subtract(a, b);
    	 
    	 int expected = 9999;
    	 assertEquals (expected, actual);

 		boolean boundaryActual = cal.boundary(a,b);
 		boolean boundaryExpected = false;
 		assertEquals (boundaryExpected, boundaryActual);
 	}
	@Test
     public void testSubE() {
    	 int a = 99999;
    	 int b = 99999;
    	 
    	 Calculator cal = new Calculator();
    	 int actual = cal.subtract(a, b);
    	 
         String expected = "Error message!";         //can remove
    	 assertNotEquals (expected, actual);
    	 	
   		boolean boundaryActual = cal.boundary(a,b);
   		boolean boundaryExpected = false;
   		assertEquals (boundaryExpected, boundaryActual);
     }


	@Test
     public void testmultiplyN() {
    	 int a =6;
    	 int b =2;
    	 
    	 Calculator cal = new Calculator();
    	 int actual = cal.multiple(a, b);
    	 
    	 int expected = 12;
    	 assertEquals (expected, actual);
 	}
	@Test
     public void testmultiplyB() {
    	 int a = 1;
    	 int b = 99;
    	 
    	 Calculator cal = new Calculator();
    	 int actual = cal.multiple(a, b);
    	 
    	 int expected = 99;
    	 assertEquals (expected, actual);

  		boolean boundaryActual = cal.boundary(a,b);
  		boolean boundaryExpected = false;
  		assertEquals (boundaryExpected, boundaryActual);
  	}
	@Test
     public void testmultiplyE() {
    	 int a = 99999;
    	 int b = 99999;
    	 
    	 Calculator cal = new Calculator();
    	 int actual = cal.multiple(a, b);
    	 
   	    String expected = "Error message!";     //can remove
    	assertNotEquals (expected, actual);
    	
  		boolean boundaryActual = cal.boundary(a,b);
  		boolean boundaryExpected = false;
  		assertEquals (boundaryExpected, boundaryActual);
 	}
     
	@Test
     public void testdivideN() {
    	 int a = 6;
    	 int b = 2;
    	 
    	 Calculator cal = new Calculator();
    	 int actual = cal.devide(a, b);
    	 
    	 int expected = 3;
    	 assertEquals (expected, actual);
 	}
	@Test
     public void testdivideB() {
    	 int a = 99;
    	 int b = 99;
    	 
    	 Calculator cal = new Calculator();
    	 int actual = cal.devide(a, b);
    	 
    	 int expected = 1;
    	 assertEquals (expected, actual);
    
    	boolean boundaryActual = cal.boundary(a,b);
   		boolean boundaryExpected = false;
   		assertEquals (boundaryExpected, boundaryActual);
   	}
	@Test
     public void testdivideE() {
    	 int a = 99999;
    	 int b = 99999;
    	 
    	 Calculator cal = new Calculator();
    	 int actual = cal.devide(a, b);
    	 
    	 String expected = "Error message!";                 //can remove
    	 assertNotEquals (expected, actual);
    	 
    	 	
   		boolean boundaryActual = cal.boundary(a,b);
   		boolean boundaryExpected = false;
   		assertEquals (boundaryExpected, boundaryActual);
    		
 	}
}

