import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int H = scan.nextInt(), W = scan.nextInt();

            if (H == 0 && W == 0) {
                break;
            }

            for (int h = 0; h < H; h++) {
                //縦の判定
                if (h % 2 == 0) {
                    for (int w = 0; w < W; w++) {
                        //横の判定
                        System.out.print(w % 2 == 0 ? "#" : ".");
                        /*if (w % 2 == 0) {
                          System.out.print("#");
                          }else {
                          System.out.print(".");
                          }*/
                    }
                } else {
                    for (int w = 0; w < W; w++) {
                        System.out.print(w % 2 == 0 ? "." : "#");
                        /*if (i % 2 == 0) {
                          System.out.print(".");
                          } else {
                          System.out.print("#");
                          }*/
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
