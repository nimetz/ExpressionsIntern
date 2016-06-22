package root;

/**
 * Die Schnittstelle Expression schreibt Ausdrücken eine print() und eine eval() Methode vor. 
 */
public interface Expression {
	
	/**
	 * Diese Methode soll den vollständigen Ausdruck auf der Kommandozeile
	 * ausgeben.
	 */
	public void print();
	
	/**
	 * Diese Methode soll den Ausdruck auswerten und den Wert als int zurückgeben.
	 * @return Wert des ausgewerteten Ausdrucks
	 */
	public int eval();
	
}
