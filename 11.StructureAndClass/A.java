import java.util.*;

public class A {
    private static int[][] dice = new int[3][4];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[6];

        for (int i = 0; i < 6; i++) {
            num[i] = scan.nextInt();
            System.out.println(num[i]);
        }

        int top = num[0];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                dice[x][y] = 0;
            }
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                if (dice[x][y] == dice[0][1]) {
                    dice[x][y] = num[0];
                }
                if (dice[x][y] == dice[1][0]) {
                    dice[x][y] = num[3];
                }
                if (dice[x][y] == dice[1][1]) {
                    dice[x][y] = num[1];
                }
                if (dice[x][y] == dice[1][2]) {
                    dice[x][y] = num[2];
                }
                if (dice[x][y] == dice[1][3]) {
                    dice[x][y] = num[4];
                }
                if (dice[x][y] == dice[2][1]) {
                    dice[x][y] = num[5];
                }
            }
        }

        String direction = scan.next();
        char[] chars = direction.toCharArray();
        int aa = 0;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'N':
                    aa = direction(top);
                    break;
                case 'S':
                    aa = direction(top);
                    break;
                case 'W':
                    aa = direction(top);
                    break;
                case 'E':
                    aa = direction(top);
                    break;
            }
        }
        System.out.println(aa);
    }

    public static int direction(int top) {
        if (top == dice[0][1]) {
            return dice[2][1];
        }
        if (top == dice[1][0]) {
            return dice[1][2];
        }
        if (top == dice[1][1]) {
            return dice[1][3];
        }
        if (top == dice[1][2]) {
            return dice[1][0];
        }
        if (top == dice[1][3]) {
            return dice[1][1];
        }
        if (top == dice[2][1]) {
            return dice[0][1];
        }
        return 0;
    }
}
