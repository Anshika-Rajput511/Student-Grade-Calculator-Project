public class Student {
    private String name;
    private String studentID;
    private int[] grades;

    public Student(String name, String studentID, int[] grades)
    {
        this.name = name;
        this.studentID=studentID;
        this.grades=grades;
    }

    public double calculateAverageGrade()
    {
        if(grades.length ==0 )
        return 0.0;
        int total =0;
        for(int grade: grades)
        {
            total+=grade;
        }
        return (double) total/grades.length;
    }

    public void displayGrades()
    {
        System.out.println("Grades of Student" + name + "(" + studentID + "):");
        for(int grade: grades)
        {
            System.out.println(grade);
        }
    }

    public boolean status()
    {
         double average = calculateAverageGrade();
         return average >=60;
    }

    public String getName()
    {
        return name;
    }

    public double getAverageGrade()
    {
        return calculateAverageGrade();
    }
}
