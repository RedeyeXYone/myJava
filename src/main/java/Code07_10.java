class Rabbit4 {
    String shape;
    int xPos;
    int yPos;

    Rabbit4() {
        shape = "토끼";
    }


    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_10 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();

        Rabbit4 rabbit1 = new Rabbit4();
        Rabbit4 rabbit2 = new Rabbit4();
        Rabbit4 rabbit3 = new Rabbit4();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setPosition(100,100);
        rabbit2.setPosition(-100,100);
        rabbit3.setPosition(0,-100);

        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다", rabbit.shape);
    }
}