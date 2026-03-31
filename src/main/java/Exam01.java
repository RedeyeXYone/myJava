import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str = sc.nextLine();


        str = str.replaceAll(" ", "");


        str = str.toLowerCase();


        System.out.println(str);
    }
}