public class Exercise13_9 {

    public static void main(String[] args) {

        CircleC c1 = new CircleC(10);
        CircleC c2 = new CircleC(10);
        MyRectangle2D r1 = new MyRectangle2D(0, 0, 5, 5);

        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("c1 equals r1? " + c1.equals(r1));
    }
}


