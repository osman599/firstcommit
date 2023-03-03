package RunTimeShape;

public class ShapeMain3 {
    public static void main(String[] args) {

        Shape [] s= new Shape[3];

        s [0] = new Shape();
        s [1] = new Rectangle(5,6);
        s [2] = new Triangle(6,5);

        System.out.println(" Area of Shape : " +s[0].area());
        System.out.println(" Area of Rectangle : " +s[1].area());
        System.out.println(" Area of Triangle : " +s[2].area());
    }
}
