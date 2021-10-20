package pattern.immutable.Model;

 public final class Student {

     private final String name;
     private final int age;

     public Student(String n, int a) {
         this.name = n;
         this.age = a;
     }

     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     public Student setAttributes(String n, int a)
     {
         return new Student(n,a);
     }

     public int ageIncrement()
     {
         return (this.age+1);
     }

     public Student ageIncMethod()
     {
         return new Student(this.name,(this.age+1));
     }
}
