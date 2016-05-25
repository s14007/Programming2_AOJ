public class D {
    public String time(int num) {
        int h = num / 3600, m, s;

        num %= 3600;
        m = num / 60;
        num %= 60;
        s = num;

        return h + ":" + m + ":" + s;
    }
}
