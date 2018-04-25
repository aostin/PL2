package compiler.syntax.nonTerminal;

public class Sentencia_printc extends Sentencia {

	String cadena;
	
	public Sentencia_printc(String cadena) {
		this.cadena = cadena;
	}
	
	public Sentencia_printc() {
		
	}
	
	public void setCadena(String cadena) {
		this.cadena=cadena;
	}
	
	public String getCadena(){
		return this.cadena = cadena;
	}
}
