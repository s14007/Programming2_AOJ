import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BTest {
    @Test
    public void testCalculation() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double pow = Math.pow(num, 3);
        int answer = (int)pow;

        B b = new B();
        assertEquals(answer, b.cube(num));
    }
}
