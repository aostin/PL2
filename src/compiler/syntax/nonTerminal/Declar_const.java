package compiler.syntax.nonTerminal;

public class Declar_const {

	private int valor;
	private String name;
	
	public Declar_const (){
		
		}
	public Declar_const (int valor, String name){
		this.valor = valor;
		this.name = name;
		
		
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public String getName() {
		return this.name;
	}
	
}
