package School;
import java.util.Scanner;
//Ethan Ravasco
//Section 001
/*Program is a grade calculator that takes in multiple inputs from the user including weight, homework, labs, and 2 exam grades
and calculates the grade out of those inputs.*/



public class Grades {
    public static void main(String[] args) {

        //Start Scanner
        Scanner userInput = new Scanner(System.in);


        //Prompt user for Homework and Exam 1 weight to calculate Exam 2 Weight out of 100
        System.out.print("Homework Weight: ");
        double homeworkWeight = userInput.nextDouble();
        System.out.print("Exam 1 Weight: ");
        double examWeight1 = userInput.nextDouble();


        //Create a while loop if user inputs are invalid reprompt
        while (homeworkWeight + examWeight1 > 100 ) {
            System.out.println("Invalid Weight. Please try again. ");
            System.out.print("Homework Weight: ");
            homeworkWeight = userInput.nextDouble();
            System.out.print("Exam 1 Weight: ");
            examWeight1 = userInput.nextDouble();
        }

        //Store Exam 2 Weight
        double examWeight2 = 100 - examWeight1 - homeworkWeight;
        
        //Create homework method
        double weightedHomework = homeworkScore(homeworkWeight);

        //Create Exam 1 Method
        double weightedExam1 = exam1Score(examWeight1);

        //Create Exam 2 Method
        double weightedExam2 = exam2Score(examWeight2);
        
        //Grade
        double grade = weightedHomework + weightedExam1 + weightedExam2;
        System.out.println(grade);


    }

    public static double homeworkScore(double homeworkWeight) {
        //Create Scanner
        Scanner scanner = new Scanner(System.in);
    
        //Prompt for number of homework Assignments
        System.out.print("Number of assignments: ");
        int numAssignments = scanner.nextInt();
        
        //check for negative input
        if (numAssignments <= 0) {
            return homeworkWeight;
        }
        else {
            
            //store total points

            int totalPoints = numAssignments * 10 + numAssignments * 4;
            
            //Prompt for Average homework Grade
            System.out.print("Average Homework grade? ");
            double averageHomeworkGrade = scanner.nextDouble();

            //Reprompt if average homework grade is less than 0 or greater than 10
            while (averageHomeworkGrade > 10) {
                System.out.println("Invalid Input. Please try again.");
                System.out.print("Average Homework grade? ");
                averageHomeworkGrade = scanner.nextDouble();
            }

            //If negative treat as a 0

            if (averageHomeworkGrade < 0) {
                averageHomeworkGrade = 0;
            }

            //Prompt for number of late days
            System.out.print("Number of late days used? ");
            int lateDays = scanner.nextInt();

            //Reprompt if late days is less than 0
            while (lateDays < 0) {
                System.out.println("Inavlid Input.Please try again.");
                System.out.print("Number of late days used? ");
                lateDays = scanner.nextInt();
            }

            //Prompt for labs attended
            System.out.print("Labs attended? ");
            int totalLabs = scanner.nextInt();

            //Reprompt if number of labs is less than 0 or greater than the number of assignments
            while (totalLabs < 0 || totalLabs > numAssignments) {
                System.out.println("Invalid Input. Please try again.");
                System.out.print("Labs attended? ");
                totalLabs = scanner.nextInt();
            }

            double studentTotal = averageHomeworkGrade * 10 + totalLabs * 4;

            //IF STUDENT USES MORE LATE DAYS THAN HALF THE NUMBER OF ASSIGNMENTS REDUCE GRADE BY 10%
            if (lateDays > numAssignments/2) {
                studentTotal = studentTotal * 0.9;
            } 

            //IF STUDENT USES NO LATE DAYS STUDENT SHOULD GET 5 EXTRA CREDIT POINTS FOR THE HOMEWORKS
            if (lateDays == 0) {
                studentTotal += 5;
            }

            //DONT ALLOW MAXIMUM GRADE OVER TOTAL
            if (studentTotal > totalPoints) {
                studentTotal = totalPoints;
            }

            //Calculate Weight
            double weightedHomeworkScore = homeworkWeight * (studentTotal / totalPoints);
                return weightedHomeworkScore;
        }
    }
    public static double exam1Score(double examWeight1) {
        //Import scanner
        Scanner scanner = new Scanner(System.in);

        //Get exam 1 score
        System.out.print("Exam 1 Score? ");
        double score = scanner.nextDouble();

        //Reprompt if score is less than 0 or greater than 100
        if (score < 0) {
            score = 0;
        }

        //Get exam 1 curve
        System.out.print("Curve? ");
        double curve = scanner.nextDouble();

        //Disallow more than 100
        if (curve + score > 100) {
            score = 100;
            return examWeight1;
        }
        else {

        //Calculate total points and weight
        double totalPoints = score + curve;
        double weightedScore = examWeight1 * (totalPoints / 100);
            return weightedScore;
        }
    }
    public static double exam2Score(double examWeight2) {
        //Import scanner
        Scanner scanner = new Scanner(System.in);

        //Get exam 2 score
        System.out.print("Exam 2 Score? ");
        double score = scanner.nextDouble();

        //Reprompt if score is less than 0
        if (score < 0) {
            score = 0;
        }

        //Get exam 2 curve
        System.out.print("Curve? ");
        double curve = scanner.nextDouble();

        //Disallow more than 100
        if (curve + score > 100) {
            score = 100;
            return examWeight2;
        }
        else {
        //Calculate total points and weight
        double totalPoints = score + curve;
        double weightedScore = examWeight2 * (totalPoints / 100);
            return weightedScore;
        }
    }
}
