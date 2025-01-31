import java.util.Scanner;
public class stud {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name;
       int age;
       float cgpa;
       char grade;
       name=sc.next();
       age=sc.nextInt();
       cgpa=sc.nextFloat();
         grade=sc.next().charAt(0);
         System.out.println("Name: "+name);
         System.out.println("Age: "+age);
         System.out.println("CGPA: "+cgpa);
         System.out.println("Grade: "+grade); 
    
}
}

