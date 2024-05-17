class Person{
    private String firstName;
    private String lastName;

   Person(String firstName,String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
   }
    public String getFirstName(){
         return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void displayDetails(){
        System.out.println("Student Name: "+getFirstName()+" "+getLastName());
    }
}
class Student extends Person{
    private String studentID;
    private String course;
    private String teacherName;


    Student(String firstName,String lastName,String studentID,String course,String teacherName){
        super(firstName, lastName);
        this.course=course;
        this.studentID=studentID;
        this.teacherName=teacherName;
        
    }

    public void displayDetails(){
        System.out.println("Student Name: "+super.getFirstName()+" "+super.getLastName());
        System.out.println("Student id: "+studentID);
        System.out.println("Course: "+course);
        System.out.println("Teacher name: "+teacherName);
    }


}
class Teacher extends Person{
    private String subjectName;
    private double salary;

    Teacher(String firstName,String lastName,String subjectName,double salary){
        super(firstName, lastName);
        this.subjectName=subjectName;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Teacher name: "+super.getFirstName()+" "+super.getLastName());
        System.out.println("Subject name: "+subjectName);
        System.out.println("Price "+salary);
    }

}

public class Task3 {
    public static void main(String[] args) {
        Student s1=new Student("Fahad", "Ali", "023-23-0243", "Calculus", "M. Suleman");
        Student s2=new Student("Ali", "Raza", "023-23-0246", "Applied Physics", "Ms Maqsood");

        Teacher t1=new Teacher("Muhammad", "Suleman", "Calculus",150000);
        Teacher t2=new Teacher("Maqsood", "Khatoon", "Applied Physics", 100000);

        s1.displayDetails();
        s2.displayDetails();
        t1.displayDetails();
        t2.displayDetails();
        
    }
}
