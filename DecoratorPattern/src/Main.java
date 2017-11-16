public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.print("\nCircle with normal boarder");
        circle.draw();
        System.out.print("\nCircle with red boarder");
        redCircle.draw();
        System.out.print("\nRectangle with rectangle boarder");
        redRectangle.draw();


    }
}
