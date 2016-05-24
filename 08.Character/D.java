import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine(), strings = string + string, keywords = scan.nextLine();

        System.out.println(strings.matches(".*" + keywords + ".*")? "Yes" : "No");
    }
}
