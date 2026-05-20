import java.util.Scanner;

public class Code09_03_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;
        int i;

        for ( i=0 ; i<=3 ; i++) {
            System.out.print("숫자 : ");
            numAry[i] = s.nextInt();
        }

        for ( i=0 ; i<=3 ; i++ ) {
            numAry[i] = hap;
            hap++;
        }
            System.out.println("합계 ==> " + hap);

        s.close();
    }
}


