abstract class Rabbit15 {
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}
class HouesRabbit4 extends Rabbit15 {
   void sleep() {
       System.out.println("집토끼가 우리에서 처 자고 있습니다.");
   }
}
class MountainRabbit4 extends Rabbit15 {
    void sleep() {
        System.out.println("산토끼가 굴속에서 처 자고 있습니다.");
    }
}
public class Code08_08 {
    public static void main(String[] args) {
        Rabbit15 hRabbit = new HouesRabbit4();
        Rabbit15 mRabbit = new MountainRabbit4();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
