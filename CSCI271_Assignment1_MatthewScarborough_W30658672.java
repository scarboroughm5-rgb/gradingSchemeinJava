/* Assignment 1 for csci 271-001 Spring 2026

Auther: Matthew Scarboroughm
OS:  Window 11 Home edition 
Compiler: javac 25.0.1
Date: January  22, 2025

Purpose
The purpose of this program is to calculate the final numerical grade based on the grading scheme that was published in the course syllbus. 

I declare and confirm the following:

-I have not discussed this program code with anyone other than my instructor or teaching assistant assigned to these course. 
-I have not used prgramming code obtained from someone else, or any unautherised sources, including the internet, either modified or unmodified. 
-If any source code or documentation used in my program was obtained from other sources, like a text book, or course notes, i have clearly indicated that with a  proper citation in the comments of my program. 
-I have not designed this program in such a way to defeat or interfere with the normal operations of the supplied grading code. 

Matthew Scarborough
W30658672
*/

import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

public class CSCI271_Assignment1_MatthewScarborough_W30658672{

    public static double CalAverage(double[] scores){
        double sum = 0; //  sum of scores for averages
        for(double score : scores){ //  for  loops until everying in the array has been added.
            sum += score; // adds to sum
        }
        return sum / scores.length; // returns the total sum divided by the length of the array scores
    }

    public static double calculateE(double F, double M, double T){
        return ((0.4 * F + 0.2 * M + 0.1 * T) / 0.7); // returns the calculation from equation E from the sylabus
    }
    
    public static double calculateG(double F, double M, double T, double A){
        double E = calculateE(F, M, T); // brings E into this function so that final equation for G can be done properly
        
        if (E < 60){ // checks to see if E is less than 60 
            return E; // returns E
        } else if (E >= 60 && E < 80){ // checks if  E is greater 60 and less than or equal to 80
            double W = (((E - 60)/20) * 0.3); // The weight equations from sylabus
            return (1- W) * E + W * A; //  returns the grade based on the weight of exams and assignments
        } else { // >= 80 
            return 0.7 * E + 0.3 * A; // returns the weight of exams by 70%  plus 30% weight of assignments. 
        }
    }

    public static String lettergrade(double grade){
        if (grade >= 90){
            return "A";
        } else if (grade >= 80){
            return "B";
        } else if (grade >= 70){
            return "C";
        } else if (grade >= 60){
            return "D";
        } else {
            return "F";
        }
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 7 assignement scores from 0 to 100: ");
        double [] assignmentScores = new double[7];
        for (int i = 0; i < 7; i++){
            System.out.print ("assignment " + (i + 1) + ": ");
            assignmentScores[i] = scanner.nextDouble();
        }

        double A = CalAverage(assignmentScores);
        System.out.println("Average assignment score: " + A);

        System.out.println("Enter test score out of 100: ");
        double [] testScores = new double[7];
        for (int i = 0; i < 7; i++){
            System.out.print ("test " + (i + 1) + ": ");
            testScores[i] = scanner.nextDouble();
        }

        double T = CalAverage(testScores);
        System.out.println("Average test score: " + T);

        System.out.println("Enter midterm exams score out of 100: ");
        double M = scanner.nextDouble();

        System.out.println("Enter final exam score out of 100: ");
        double F = scanner.nextDouble();

        double G = calculateG(F, M, T, A);
        System.out.printf("Final numerical grade: %.2f%n", G); 
        System.out.println("Final letter grade: " + lettergrade(G));
        
    }
}

