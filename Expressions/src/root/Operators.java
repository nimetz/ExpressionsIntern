package root;

/**
 * Diese Aufzählung stellt die nötigen Operatoren zur Verfügung
 */
public enum Operators
{
	Add, Mul, Sub, Div, // binäre Operatoren
	UMin;				// unäre  

	/**
	 * Diese Methode liefert die Textdarstellung der Operatoren
	 */
	public String toString()
	{
		switch(this)
		{
			case Add: return "+";
			case Mul: return "*";
			case Sub: return "-";
			case Div: return "/";
			case UMin: return "~";
			default: throw new IllegalArgumentException();
		}
	}
}

