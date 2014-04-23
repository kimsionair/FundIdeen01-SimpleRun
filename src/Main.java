public class Main {

    public static void main(String[] args) throws Throwable{

        Ellipse egg = new Ellipse(100, 100, 40, 60);
        egg.setColor(Color.CYAN);
        egg.fill();

        Thread.sleep(10);
        egg.grow(10,10);
        Thread.sleep(10);
        egg.grow(10,10);
        Thread.sleep(10);
        egg.grow(10,10);
        Thread.sleep(10);
        egg.grow(10,10);
        Thread.sleep(10);
        egg.grow(10,10);
        Thread.sleep(10);
        egg.grow(10,10);

    }
}
