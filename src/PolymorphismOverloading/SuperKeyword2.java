package PolymorphismOverloading;

class Teacher{
    int salary = 10000;
}
class Student extends Teacher{
    String name = "Osman";

    void School (){
        System.out.println("Student Name is: " +name);
        System.out.println("Teacher Salary is: " +super.salary);
    }
}

class superTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.School();
    }
}