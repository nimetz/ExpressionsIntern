package root;

public class DivExpression extends BinaryExpression{

	public DivExpression(int lhs, int rhs, Operators operator){
		this.lhs = lhs;
		this.rhs = rhs;
		this.operator = operator;
	}
	@Override
	public int eval() {
		return lhs/rhs;
		
	}

	@Override
	public boolean equals(Object other) {
		if (this.eval() == ((Expression)other).eval())return true;
		return false;
	}

}
