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

public class gradecalculations{ //all info for this method came from the syslabus


	public static double CalE( double F, double M, double T){
	return (0.4 * F + 0.2 * M + 0.1 * T) / 70;
}
	public static double CalG( double F, double M, double T, double A){

	double E = CalE( double F, double M, double T);

	if (E < 60) {
	// if E is already a precentage below 60, it can be returned d direcrtly 
	return E;

	} else if (E >= 60 && E <= 80){

	double W = ((E - 60) / 20) * 0.3;
	return (1 - W)* E + W * A;
	} else {

	return 0.4 * F + 0.2 * M + 0.1 * T + 0.3 * A;
    }
}


   public static String convertingtoLetterGrade(double NumGrade){
      if (LetterGrade >= 90){
	return "A";
      } else if (LetterGrade >= 80){
	return "B";
      } else if (LetterGrade >= 70{
	return "C";
      } else if (LetterGrade >= 60{
	return "D";
      } else {
	return "F";
    }
}


  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter your assignment score: "):
	double A = scanner.nextDouble(); // w3Schools

	System.out.println("Please enter your test score: ");
	double T = scanner.nextDouble();

	System.out.println("Please enter your midterm grade: ");
	double M = scanner.nextDouble();

	System.out.println("Please enter your final exam: ");
	double F = scanner.nextDouble();

	//Calculate grade
	double E = CalE(F, M, T);
	double FinalGrade = calG( F, M, T, A);

	string letterGrade = convertingtoLetterGrade(FinalGrade); // takes the final grade and cacalculate the final score. 

