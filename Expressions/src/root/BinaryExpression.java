package root;

/**
 * Diese abstrakte Klasse repräsentiert binäre Ausdrücke
 */
public abstract class BinaryExpression implements Expression {
	
	protected int lhs, rhs;				// lhs = linker Operand, rhs = rechter Operand
	protected Operators operator;

	/**
	 *  Diese Methode soll den vollständigen Ausdruck auf der Kommandozeile ausgeben.
	 *  Beachte, dass diese Methode von allen Unterklassen genutzt werden kann.
	 */
	public void print(){
		System.out.println(Integer.toString(lhs)+ operator.toString()+ Integer.toString(rhs));
	}
	
	/**
	 * Diese Methode soll den vollständigen Ausdruck als String zurückliefern.
	 * Beachte, dass diese Methode von allen Unterklassen genutzt werden kann.
	 */
	public String toString(){
						// Hinweise: benutzte die toString() Methode des Enum Operators
		return Integer.toString(lhs)+ operator.toString()+ Integer.toString(rhs);	
	}
	
	/**
	 * Diese Methode soll zwei beliebige Ausdrücke bezüglich ihres evaluierten Wertes vergleichen.
	 * Beachte, dass diese Methode von allen Unterklassen genutzt werden kann.
	 */
	public abstract boolean equals(Object other);

}