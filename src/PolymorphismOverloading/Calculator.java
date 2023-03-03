package PolymorphismOverloading;

public class Calculator {

        public String add (){
            return " nothing ";
        }
        // method 1
        public int add(int a, int b) {
            return a + b;
        }

        // method 2
        public double add(double a, double b) {

            return a + b;
        }

        // method 3
        public int add(int a, int b, int c) {

            return a + b + c;
        }
    }

