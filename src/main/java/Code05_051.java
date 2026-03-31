import java.util.Scanner;

public class Code05_051 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("숫자 입력: ");

        int num = s.nextInt();


        if(0 == num%2) {
            System.out.println("짝수임 ㅇㅇ");

        }else {
            System.out.println("홀수임 ㅇㅇ");
        }
        s.close();
    }
}
