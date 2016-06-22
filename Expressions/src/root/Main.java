package root;

public class Main {

	public static void main(String[] args) {
		Expression mul = new MulExpression (3,5, Operators.Mul);
		Expression div = new DivExpression(30, 2, Operators.Div);
		Expression unaryMinus = new UnaryMinusExpression(-15, Operators.UMin);
		
		System.out.println(mul.toString());
		System.out.println(div.toString());
		System.out.println(unaryMinus.toString());
		
		System.out.println(mul.equals(div));
		System.out.println(unaryMinus.equals(div));

	}

}
