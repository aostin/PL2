package compiler.syntax.nonTerminal;

public class Sentencia_simple extends Sentencia {

	Expresion ex;
	String tipo;
	
	public Sentencia_simple () {
		
	}
	
	public void setEx(Expresion ex) {
		this.ex = ex;
	}
	
	public Expresion getEx() {
		return this.ex;
	}
	
	public void setTipo (String tipo) {
		this.tipo=tipo;
	}

	
	public String getTipo () {
		return this.tipo;
	}
}
