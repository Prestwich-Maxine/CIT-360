package apcontroller;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		APCController apcControl = new APCController();
		String addition = "add";
		String times = "multiply";
		String division = "divide";
		Integer firstNum;
		Integer secondNum;
		String operation = null;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Practicing Application Controller Pattern through Simple Calculations");
		System.out.println("Enter the first number: ");
		firstNum = Integer.parseInt(in.nextLine());
		System.out.println("Multiply or divide? Select * or /: ");
		System.out.println("Enter the second number: ");
		secondNum = Integer.parseInt(in.nextLine());
		
		System.out.println(firstNum + " " + operation + " " + secondNum + " = ");
	    apcControl.handleOperation(operation, firstNum, secondNum);
	}

}
