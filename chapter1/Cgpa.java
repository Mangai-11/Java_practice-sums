package chapter1;

// Write a program to calculate the CGPA of a student given the marks obtained in three subjects. Assume each subject is out of 100 marks.
public class Cgpa {
    public static void main(String[] args) {
        int subject1 = 85;
        int subject2 = 90;
        int subject3 = 78;
       

        int totalMarks = subject1 + subject2 + subject3 ;
        double cgpa = (totalMarks / 3.0) / 10.0;

        System.out.println("CGPA is: " + cgpa);
    }
    
}
