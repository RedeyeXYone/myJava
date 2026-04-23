public class Test01_03 {
    public static void main(String[] args) {
        int a;
        int hap=0;

        for (a=100 ; a<=300 ; a++) {
            if (a % 5 == 0 && a % 7 == 0) {

                hap += a;
            }
        }
        System.out.printf("%d", hap);
    }
}
