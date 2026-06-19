public class Overload {
    void print(int n) {
        System.out.println(n);
    }

    void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        o.print(1);
        o.print("요네");
    }
}
