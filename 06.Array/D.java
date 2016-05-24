import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int[][] a = new int[n][m];
        int[] b = new int[m];

        //Aの生成
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        //bの生成
        for (int i = 0; i < m; i++) {
            b[i] = scan.nextInt();
        }

        //配列cを作成し、 Aとbを式で計算し入れる
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i] += a[i][j] * b[j];
            }
        }

        for (int ans : c) {
            System.out.println(ans);
        }
    }
}
