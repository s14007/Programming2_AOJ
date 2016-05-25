public class A {
    public String judgeSize(int a, int b) {
        int ans = Integer.compare(a, b);
        String out = (ans == 1) ? "a > b" : "a < b";
        String judge = (a == b) ? "a == b" : out;
        return judge;
    }
}
