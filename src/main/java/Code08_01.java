class Rabbit9 {
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbit9() {
        count++;
    }
}

public class Code08_01 {
    public static void main(String[] args) {
        System.out.println("객체 생성 전 총 토끼 수 ==> " + Rabbit9.count);

        Rabbit9 rabbit1 = new Rabbit9();
        System.out.println("토끼 객체1 생성 후 총 토끼 수 ==> " + Rabbit9.count);

        Rabbit9 rabbit2 = new Rabbit9();
        System.out.println("토끼 객체2 생성 후 총 토끼 수 ==> " + Rabbit9.count);
    }
}
