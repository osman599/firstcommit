package PolymorphismOverloading;

public class CalculatorMain {

        public static void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println( "No addition of this method: " + calc.add());
            System.out.println("Addition of two integers: " + calc.add(10, 20));
            System.out.println("Addition of two doubles: " + calc.add(10.5, 20.5));
            System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
        }
    }

