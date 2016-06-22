package root;

/**
 * Diese abstrakte Klasse repräsentiert unäre Ausdrücke
 */
public abstract class UnaryExpression implements Expression {
	
	protected int operand;
	protected Operators operator;

	/**
	 *  Diese Methode soll den vollständigen Ausdruck auf der Kommandozeile ausgeben.
	 *  Beachte, dass diese Methode von allen Unterklassen genutzt werden kann.
	 */
	public void print(){
		//TODO: Implement me.
	}
	
	/**
	 * Diese Methode soll den vollständigen Ausdruck als String zurückliefern.
	 * Beachte, dass diese Methode von allen Unterklassen genutzt werden kann.
	 */
	public String toString(){
		//TODO: Implement me.				// Hinweis: benutzte die toString() Methode des Enum Operators
		return null;	
	}
	
	/**
	 * Diese Methode soll zwei beliebige Ausdrücke bezüglich ihres evaluierten Wertes vergleichen.
	 * Beachte, dass diese Methode von allen Unterklassen genutzt werden kann.
	 */
	public boolean equals(Object other){
		//TODO: Implement me.
		return false;
	}
}
