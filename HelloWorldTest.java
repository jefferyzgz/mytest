import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
  
  @Test
  public void helloTest() {
    String helloWorld = "helloWorld";
    assertEquals("helloWorld", helloWorld);
  }
}
