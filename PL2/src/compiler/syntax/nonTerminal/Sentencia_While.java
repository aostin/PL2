package compiler.syntax.nonTerminal;

public class Sentencia_While extends Sentencia{
	
	Expresion ex;
	Bloque_sentencias s1 = new Bloque_sentencias();
	
	public Sentencia_While () {
		
	}
	
	public void setEx(Expresion ex) {
		this.ex = ex;
	}
	
	public Expresion getEx() {
		return this.ex;
	}
	
	
	public void setS1(Bloque_sentencias s1) {
		this.s1 = s1;
		
	}
	
	public Bloque_sentencias getS1() {
		return this.s1;
	}
	
	public Boolean compruebaReturns(String tipo) {
		Boolean rS1= false;
		if (s1!=null) {
			rS1=s1.tieneReturn(tipo);
			
		}
		
		return rS1;
		
		
	}
	
	
	

}
