package lesson9stackqueue;

// Stack Application Demo - to check the expression syntax

class Expression {
	private String expression;

	Expression(String str) // constructor
	{
		expression = str;
	}

	public boolean isExpressionValid() {
		int n = expression.length(); // get max size (chars) of expression
		ArrayStack stk = new ArrayStack(n); // create stack
		char ch, chx; // ch: char scanned and chx: char popped
		boolean valid = false;
		for (int i = 0; i < n; i++) // get a char until �n� chars are scanned
		{
			ch = expression.charAt(i); // get char
			if (ch == '[' || ch == '{' || ch == '(')
				stk.push(ch);
				if (ch == ']' || ch == '}' || ch == ')') {
				if (stk.isEmpty())
					valid = false;
				else {
					chx = (Character) stk.pop(); // pop a char from stack
					if (chx == '[' && ch == ']')
						valid = true;
					else if (chx == '{' && ch == '}')
						valid = true;
					else if (chx == '(' && ch == ')')
						valid = true;
					else
						valid = false;
				
			}
		}
		}
		if (!stk.isEmpty()) // stack not empty
			valid = false;
		return valid;
	}
}

public class ExpressionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String expr1 = "(a*b(a-b)]";
		Expression ob1 = new Expression(expr1);
		
		System.out.println("expression: " + expr1);
		if (ob1.isExpressionValid())
			System.out.println("expression1 is valid");
		else
			System.out.println("expression1 is not valid");
		String expr2 = "[A+25*(Y*(B+C-X-K/D)*(E+13))]+M";
		Expression ob2 = new Expression(expr2);
		System.out.println(expr2 + " : " + ob2.isExpressionValid());

	}

}
