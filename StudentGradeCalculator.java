import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeCalculator {
    private ArrayList<Student> students;

    public StudentGradeCalculator()
    {
        students= new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void displayClassInfo()
    {
        double totalAverage =0;
        int count=0;
        for(Student student:students)
        {
            System.out.println("Student:" + student.getName());
            student.displayGrades();
            System.out.println("Average Grade:" + student.getAverageGrade());
            System.out.println("Status:" + (student.status()? "Passed" : "Failed"));
            System.out.println();
            totalAverage += student.getAverageGrade();
            count++;
        }

        if(count>0)
        {
            double classAverage = totalAverage/count; 
            System.out.println("Class Avearge Grade:" + classAverage);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StudentGradeCalculator sgc = new StudentGradeCalculator();
       // System.out.println("Enter total Students:");
        //int totalStudents = sc.nextInt();
       // while(totalStudents!=0)
       while(true)
        {
            System.out.println("Enter student name:");
            String name = sc.nextLine();

            System.out.println("Enter student ID:");
            String studentID = sc.nextLine();

            System.out.println("Enter number of grades:");
            int numGrades = sc.nextInt();
            sc.nextLine();

            int[] grades = new int[numGrades];
            for(int i=0; i<numGrades;i++)
            {
                System.out.println("Enter grade" + (i+1) + ":");
                grades[i]=sc.nextInt();
                sc.nextLine();
            } 

            Student student = new Student(name,studentID,grades);
            sgc.addStudent(student);
        
         sgc.displayClassInfo();
         //totalStudents--;
        }

    }
    
}
