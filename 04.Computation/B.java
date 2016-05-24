import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double cir = (r * 2) * Math.PI, area = r * r * Math.PI;

        //浮動小数点で10新数表示,表示桁数6桁
        System.out.printf("%6f %6f", area, cir);
    }
}
