package PolymorphismOverriding;

public class OverridingMain {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();
        Gurdian g = new Gurdian();

        s.learnIt();
        t.learnIt();
        g.learnIt();

        System.out.println(s.Identification);
        System.out.println(t.bio);
        System.out.println(g.Ginformation);
    }
}
