package PolymorphismOverriding;

public class Gurdian extends Student{
    String Ginformation;

    public void learnIt() {
        String name = " Motin ";
        int age = 60;
        Ginformation = name + age;

        System.out.println( " the guardian says: is better" );
    }
    public void Motin (){

        System.out.println( Ginformation );
    }
}
