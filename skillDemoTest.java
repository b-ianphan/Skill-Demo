import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    
    @Test
    public void testEnlarge(){
        assertEquals(30, skillDemo.enlarge(2));
    }

}
