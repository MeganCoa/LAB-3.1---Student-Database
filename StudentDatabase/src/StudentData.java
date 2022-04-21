import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class StudentData {

	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);
		String[][] studentInfo = new String[11][3];
		
		int student = 1;
		int name = 0;
		int homeTown = 1;
		int favFood = 2;
		boolean cont = true;
		

		studentInfo[1][0] = "Kenyon Sequoia";
		studentInfo[2][0] = "Lorelai Kizzy";
		studentInfo[3][0] = "Delia Mandi";
		studentInfo[4][0] = "Russell Nacho";
		studentInfo[5][0] = "Trinity Dietrich";
		studentInfo[6][0] = "Kacey Eveleen";
		studentInfo[7][0] = "Jayden Zaria";
		studentInfo[8][0] = "Margo Emma";
		studentInfo[9][0] = "Laraine Blake";
		studentInfo[10][0] = "Melville Rodge";
		
	
		studentInfo[1][1] = "Buderim ";
		studentInfo[2][1] = "Socorro";
		studentInfo[3][1] = "Pickering";
		studentInfo[4][1] = "Norfolk";
		studentInfo[5][1] = "Hialeah ";
		studentInfo[6][1] = "Thousand Oaks";
		studentInfo[7][1] = "Winston-Salem";
		studentInfo[8][1] = "Burton upon Trent";
		studentInfo[9][1] = "Alcoa";
		studentInfo[10][1] = "Sevenoaks";
		
		
		studentInfo[1][2] = "Teriyaki";
		studentInfo[2][2] = "Ice Cream Cake";
		studentInfo[3][2] = "Fried Zucchini Blossoms";
		studentInfo[4][2] = "French Toast";
		studentInfo[5][2] = "Lasagna";
		studentInfo[6][2] = "Submarine Sandwiches";
		studentInfo[7][2] = "Fried Rice";
		studentInfo[8][2] = "Green Bean Casserole With Fried Onions";
		studentInfo[9][2] = "Chicken Nuggets";
		studentInfo[10][2] = "Baked Potato";
		
		
		
		System.out.println("Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1-10): ");
		
		while(cont) {	
				if (student <= 10 && student >= 1) {
					student = scrn.nextInt();
					System.out.println("Student " + student + " is " + studentInfo[student][name]+ ". What would you like to know about " + studentInfo[student][name]+ "? (enter or �hometown� or �favorite food�): ");
					String option = scrn.nextLine();			
					
				//if ((option.equals("hometown")) || (option.equals("favorite food"))|| (option.equals("yes")) || (option.equals("no"))) {
						
						
					if (option.equals("hometown")) {
							System.out.println("Student " + studentInfo[student][name]+ " is from " + studentInfo[student][homeTown]+ ". What would you like to know about " + studentInfo[student][name]+ "? (enter or �hometown� or �favorite food�): ");						
						} else if (option.equals("favorite food")) {
							System.out.println( student + "'s favorite food is " + studentInfo[student][favFood]+ ". What would you like to know about " + studentInfo[student][name]+ "? (enter or �hometown� or �favorite food�): ");
						} else if (option.equals("yes")) {
							System.out.println("Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1-10): ");
							student = scrn.nextInt();					
						} else if (option.equals("no")) {
							cont = false;
							System.out.println("Thanks! "); //if option == no 
						}else {
							System.out.println("That data does not exist.  Please try again. (enter or �hometown� or �favorite food�): ");
						}
					}
									
//				} else {
//				System.out.println("That student does not exist.  Please try again. (enter a number 1-10): "); // if student number out of bounds
//				}
		}
		System.out.println("Thanks! "); //if option == no 
	}
}
