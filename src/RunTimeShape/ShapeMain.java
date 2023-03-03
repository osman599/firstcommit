package RunTimeShape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(5,6);
        Triangle t = new Triangle(6,5);

        System.out.println(" Area of Shape : " +s.area());
        System.out.println(" Area of Rectangle : " +r.area());
        System.out.println(" Area of Triangle : " +t.area());
    }
}
