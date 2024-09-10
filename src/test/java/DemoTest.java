/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
<<<<<<< HEAD
public class DemoTest {

=======
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;



public class DemoTest {

  @Before
  public void setUp() {
    // Reset the input and output streams before each test
    System.setIn(null);
    System.setOut(null);
  }


  // Main tests
  @Test
  public void testmain_1() throws IOException  {
    String input = "5\n12\n13\n";
    
    
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    
    // Invoke main
    String[] args = {};
    Demo.main(args);

    
    // Expected results
    String consoleOutput = "Enter side 1: \n";
    consoleOutput += "Enter side 2: \n";
    consoleOutput += "Enter side 3: \n";
    consoleOutput += "This is a triangle.\n";

    
    // Validation
    assertEquals(consoleOutput, out.toString());
    
  }
      
  
  // Is a Triangle tests  
  @Test
  public void testIsTriangle_1() {
      assertEquals(true, Demo.isTriangle(2, 3, 4));
    }
    
<<<<<<< HEAD
>>>>>>> 07e842a (initial commit)
=======
    
      @Test
  public void testIsTriangle_2() {
      assertEquals(true, Demo.isTriangle(5, 12, 13));
    }
    
    
  @Test
  public void testIsTriangle_3() {
      assertEquals(true, Demo.isTriangle(5, 13, 12));
    }
    
    
  @Test
  public void testIsTriangle_4() {
      assertEquals(true, Demo.isTriangle(12, 5, 13));
    }  
    
  @Test
  public void testIsTriangle_5() {
      assertEquals(true, Demo.isTriangle(5, 5, 5));
    }  
  
    
  @Test
  public void testIsTriangle_6() {
      assertEquals(true, Demo.isTriangle(2147483647, 2147483647, 2147483647));
    }  
    
    
    
  // Not a Triangle tests
  @Test
  public void testIsNotTriangle_1() {
      assertEquals(false, Demo.isTriangle(1, 1, 2));
    }  
    
  @Test
  public void testIsNotTriangle_2() {
      assertEquals(false, Demo.isTriangle(1, 2, 4));
    }
    

  @Test
  public void testIsNotTriangle_3() {
      assertEquals(false, Demo.isTriangle(5, 7, 13));
    }

  @Test
  public void testIsNotTriangle_4() {
      assertEquals(false, Demo.isTriangle(5, 13, 7));
    }


  @Test
  public void testIsNotTriangle_5() {
      assertEquals(false, Demo.isTriangle(13, 5, 7));
    }


  @Test
  public void testIsNotTriangle_6() {
      assertEquals(false, Demo.isTriangle(13, 7, 5));
    }


  @Test
  public void testIsNotTriangle_7() {
      assertEquals(false, Demo.isTriangle(13, 7, 5));
    }


  @Test
  public void testIsNotTriangle_8() {
      assertEquals(false, Demo.isTriangle(5, 9, 3));
    }
    

  @Test
  public void testIsNotTriangle_9() {
      assertEquals(false, Demo.isTriangle(5, 5, 10));
    }


  @Test
  public void testIsNotTriangle_10() {
      assertEquals(false, Demo.isTriangle(10, 5, 5));
    }


  @Test
  public void testIsNotTriangle_11() {
      assertEquals(false, Demo.isTriangle(5, 10, 5));
    }

  @Test
  public void testIsNotTriangle_12() {
      assertEquals(false, Demo.isTriangle(0.5, 1, 0.5));
    }  


  // Error condition tests  
  @Test
  public void testIsError_1() {
      assertEquals(false, Demo.isTriangle(0, 0, 0));
    }
    
  
  @Test
  public void testIsError_2() {
    assertEquals(false, Demo.isTriangle(-1,-1,-1));
    }
    
  
  @Test
  public void testIsError_3() {
      assertEquals(false, Demo.isTriangle(5, 9, -3));
    }

    
    
>>>>>>> a91c5d1 (completed tests)
}
