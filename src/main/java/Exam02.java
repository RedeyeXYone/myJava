public class Exam02 {
    public static void main(String[] args) {
        int a;

        for ( a = 1 ; a < 5 ; a++)
        {
            if (a==1)
                System.out.println("*");
            else if (a==2)
                System.out.println("**");
            else if (a==3)
                System.out.println("***");
            else if (a==4)
                System.out.println("****");
        }
        for ( a = 3 ; a > 0 ; a-- )
        {
            if (a==3)
                System.out.println("***");
            else if (a==2)
                System.out.println("**");
            else if (a==1)
                System.out.println("*");
        }

    }
}
