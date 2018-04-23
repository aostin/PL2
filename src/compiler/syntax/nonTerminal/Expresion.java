package compiler.syntax.nonTerminal;

public class Expresion {

	int valor;
	String tipo;
	
	public Expresion (int valor, String tipo) {
		this.valor=valor;
		this.tipo = tipo;
		
		
	}
	
	public Expresion() {
		
	}
	
	public void setValor(int valor) {
		this.valor=valor;
	}
	
	public int getValor () {
		return this.valor;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	public String getTipo () {
		return this.tipo;
	}
}
