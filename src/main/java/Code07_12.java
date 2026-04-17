class Rabbit6 {
    private String shape;
    private int xPos;
    private int yPos;




    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit6 rabbit = new Rabbit6();

        rabbit.setPosition(100, 200);
    }
}