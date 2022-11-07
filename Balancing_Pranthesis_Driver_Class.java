package GL_LabAssignment_3.com;

public class Balancing_Pranthesis_Driver_Class {
	public static void main(String[] args) {
		String expr = "([{}])";

		// Function call
		if (Balancing_Paranthesis.CheckBalancedBrackets(expr))
			System.out.println("The entered String has Balanced Brackets ");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
	}
}
