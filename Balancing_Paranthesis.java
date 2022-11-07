package GL_LabAssignment_3.com;

import java.util.ArrayDeque;
import java.util.Deque;

public class Balancing_Paranthesis {
	// function to check if brackets are balanced
	static boolean CheckBalancedBrackets(String expr) {
		// Using ArrayDeque
		Deque<Character> stack = new ArrayDeque<Character>();

		// Traversing the Expression
		for (int i = 0; i < expr.length(); i++) {
			char k = expr.charAt(i);

			if (k == '(' ) {
				// Push the element in the stack
				stack.push(k);
				continue;
			}
			else if(k=='[')
			{
				stack.push(k);
		        continue;
			}
			else if(k=='{')
			{
				stack.push(k);
				continue;
			}
			
		       

			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;
			char exprcheck;
			switch (k) {
			case ')':
				exprcheck = stack.pop();
				if (exprcheck == '{' || exprcheck == '[')
					return false;
				break;

			case '}':
				exprcheck = stack.pop();
				if (exprcheck == '(' || exprcheck == '[')
					return false;
				break;

			case ']':
				exprcheck = stack.pop();
				if (exprcheck == '(' || exprcheck == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}

}
