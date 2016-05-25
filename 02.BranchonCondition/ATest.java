import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ATest {
    @Test
    public void testJudge() {
        Scanner scan = new Scanner(System.in);
        assertEquals("a < b", new A().judgeSize(scan.nextInt(), scan.nextInt()));
    }
}
