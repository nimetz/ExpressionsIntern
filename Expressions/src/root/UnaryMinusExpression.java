package root;

public class UnaryMinusExpression extends UnaryExpression{
	
	public UnaryMinusExpression(int operand, Operators operator){
		this.operand = operand;
		this.operator = operator;
	}
	@Override
	public int eval() {
		return -operand;
		
	}

	@Override
	public boolean equals(Object other) {
		if (this.eval() == ((Expression)other).eval())return true;
		return false;
	}
}
