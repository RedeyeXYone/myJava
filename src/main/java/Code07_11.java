import java.awt.*;

class Rabbit5 {
    String shape;
    int xPos;
    int yPos;

    Rabbit5() {
        shape = "토끼";
    }
    Rabbit5(String value) {
        shape = value;
    }


    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_11 {
    public static void main(String[] args) {
        Rabbit5 rabbit1 = new Rabbit5("원");
        Rabbit5 rabbit2 = new Rabbit5("삼각형");
        Rabbit5 rabbit3 = new Rabbit5("토끼");


        rabbit1.setPosition(100,100);
        rabbit2.setPosition(-100,100);
        rabbit3.setPosition(0,-100);

        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다", rabbit1.shape);
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다", rabbit2.shape);
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다", rabbit3.shape);
    }
}