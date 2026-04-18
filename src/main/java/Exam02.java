public class Exam02 {
    public static void main(String[] args) {
        int a;

        for ( a = 1 ; a < 4 ; a++)
        {
            if (a==1) {
                System.out.println("*");
            }
            else if (a==2) {
                System.out.println("**");
            }
            else if (a==3) {
                System.out.println("***");
            }
                System.out.println("****");
        }
        for ( a = 2 ; a > 0 ; a-- )
        {
            if (a==2) {
                System.out.println("***");
            }
            else if (a==1) {
                System.out.println("**");
            }
                System.out.println("*");
        }

    }
}