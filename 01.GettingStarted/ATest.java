import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ATest {
    @Test
    public void messageTest() {
        A a = new A();
        String result = a.message("Hello, World");
        assertEquals("Hello, World", result);
    }
}
