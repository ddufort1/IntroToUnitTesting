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
      
    
  @Test
  public void testisTriangle_1() {
      assertEquals(true, Demo.isTriangle(2, 3, 4));
    }
    
>>>>>>> 07e842a (initial commit)
}
