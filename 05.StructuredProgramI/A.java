import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int H = scan.nextInt(), W = scan.nextInt();
            if (H == 0 && W == 0) break;

            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
