public class Test01_01 {
    public static void main(String[] args) {

        int a, b, c;

        for(a=1; a<=4; a++) {

            for (b=0; b<4-a ; b++) {
                System.out.print(" ");
            }
            for (c=0 ; c<2*a-1 ; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

