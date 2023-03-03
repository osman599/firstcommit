package RunTimeShape;

public class ShapeMain4 {
    public static void main(String[] args) {

        Shape[] s = new Shape[3];

        s[0] = new Shape();
        s[1] = new Rectangle(5, 6);
        s[2] = new Triangle(6, 5);

        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());

        }
    }
}
