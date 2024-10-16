import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;

    // Method to calculate grade based on marks
    public void calculateGrade() {
        if (subjectMarks >= 90 && subjectMarks <= 100) {
            grade = 10;
        } else if (subjectMarks >= 80) {
            grade = 9;
        } else if (subjectMarks >= 70) {
            grade = 8;
        } else if (subjectMarks >= 60) {
            grade = 7;
        } else if (subjectMarks >= 50) {
            grade = 6;
        } else if (subjectMarks >= 40) {
            grade = 5;
        } else {
            grade = 0;  // Failed the subject
        }
    }
}

class Student {
    String name;
    String usn;
    double SGPA;
    Subject[] subject = new Subject[8]; // Array of 8 subjects
    Scanner s = new Scanner(System.in);

    // Constructor to initialize the subjects
    public Student() {
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject(); // Create subject objects
        }
    }

    // Method to get student details
    public void getStudentDetails() {
        System.out.println("Enter Student Name: ");
        name = s.nextLine();
        System.out.println("Enter Student USN: ");
        usn = s.nextLine();
    }

    // Method to get marks and credits for each subject
    public void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter Marks for Subject " + (i + 1) + ": ");
            subject[i].subjectMarks = s.nextInt();

            // Ensure marks are valid
            if (subject[i].subjectMarks > 100 || subject[i].subjectMarks < 0) {
                System.out.println("Invalid marks! Please enter again.");
                i--;
                continue;
            }

            System.out.println("Enter Credits for Subject " + (i + 1) + ": ");
            subject[i].credits = s.nextInt();

            subject[i].calculateGrade(); // Calculate grade based on marks
        }
    }

    // Method to compute SGPA
    public void computeSGPA() {
        int totalCredits = 0;
        int effectiveScore = 0;

        for (int i = 0; i < 8; i++) {
            effectiveScore += (subject[i].grade * subject[i].credits);
            totalCredits += subject[i].credits;
        }

        SGPA = (double) effectiveScore / totalCredits;
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Student USN: " + usn);
        System.out.println("SGPA: " + SGPA);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.getStudentDetails();
        student.getMarks();
        student.computeSGPA();
        student.displayResult();
    }
}