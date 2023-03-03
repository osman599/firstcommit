package RunTimeShape;

public class ShapeMain2 {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Rectangle(5,6);
        Shape s3 = new Triangle(6,5);

        System.out.println(" Area of Shape : " +s1.area());
        System.out.println(" Area of Rectangle : " +s2.area());
        System.out.println(" Area of Triangle : " +s3.area());
    }
}
