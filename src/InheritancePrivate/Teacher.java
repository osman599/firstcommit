package InheritancePrivate;

public class Teacher extends Person{
   private String qualification;

   public String getQualification() {
      return qualification;
   }

   public void setQualification(String qualification) {
      this.qualification = qualification;
   }

   void school (){
      //its use for PrivateMain2
      System.out.println("Name is : "+getName());
      System.out.println("Age is : "+getAge());
      System.out.println("Qualification is : "+getQualification());
   }
}
