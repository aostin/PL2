package compiler.syntax.nonTerminal;

public class SentenciaIF extends Sentencia {

	Bloque_sentencias s1= new Bloque_sentencias();
	Bloque_sentencias s2= new Bloque_sentencias();
	Expresion ex;
	boolean tieneElse=false;
	
	public SentenciaIF(Expresion ex, boolean tieneElse) {
		this.ex = ex;
		this.tieneElse = tieneElse;
		
	}
	
	public void setExpresion(Expresion ex) {
		this.ex=ex;
	}
	
	public Expresion getExpresion() {
		return this.ex;
	}
	public void setS1 (Bloque_sentencias bloque) {
		this.s1=bloque;
	}
	
	public void setS2 (Bloque_sentencias bloque) {
		this.s2=bloque;
	}
	
	public Bloque_sentencias getS1() {
		return this.s1;
	}
	
	public Bloque_sentencias getS2() {
		return this.s2;
	}
}
