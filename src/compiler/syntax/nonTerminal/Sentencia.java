package compiler.syntax.nonTerminal;

public class Sentencia {

	Expresion ex;
	
	
	public Sentencia (Expresion ex) {
		this.ex = ex;
	}
	
	
	public void setEx(Expresion ex) {
		this.ex=ex;
	}

	public Expresion getEx() {
		return this.ex;
	}
}
