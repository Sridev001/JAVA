import marks.Students;

public class Studentspercentage  
{
public static void main(String[] args) 
{
String name = "Sridev";
int rollNumber = 192210681;
int mark1 = 98;
int mark2 = 93;
int mark3 = 91;

Students student = new Students(name, rollNumber, mark1, mark2, mark3);
student.display();

student.calculateTotalMarksPercentage();
}
}