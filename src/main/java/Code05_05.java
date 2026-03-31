import java.util.Scanner;

public class Code05_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("숫자 입력 ==> ");
        num = sc.nextInt();

        if(num%2 == 0)
            System.out.println("짝수임");
        else
            System.out.println("홀수임");

        sc.close();
    }
}


