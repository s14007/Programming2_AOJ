import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DTest {
    @Test
    public void testTime() {
        Scanner scan = new Scanner(System.in);
        assertEquals("13:2:59", new D().time(scan.nextInt()));
    }
}
