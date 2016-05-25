import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CTest {
    @Test
    public void test() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        C c = new C();
        assertEquals(15, c.area(a, b));
        assertEquals(16, c.circle(a, b));
    }
}
