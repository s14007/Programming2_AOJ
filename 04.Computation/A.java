import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();

        System.out.printf("%d %d %f", a / b, a % b, (double)a / b);
    }
}
