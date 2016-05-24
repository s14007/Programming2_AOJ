import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long max, min, sum = 0;
        ArrayList<Integer> z = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            z.add(scan.nextInt());
            sum += z.get(i);
        }
        max = Collections.max(z);
        min = Collections.min(z);

        System.out.printf(min + " " + max + " " + sum);
    }
}
