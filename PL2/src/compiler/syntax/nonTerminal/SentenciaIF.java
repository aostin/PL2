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
	
	public Boolean compruebaReturns(String tipo) {
		Boolean rS1= false;
		Boolean rS2=false;
		if (s1!=null) {
			rS1=s1.tieneReturn(tipo);
			
		}
		
		if(tieneElse==true){
			System.out.println("sadffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
			rS2=s2.tieneReturn(tipo);
			System.out.println(rS2);
			return (rS1 && rS2);
		}
		else
			return rS1;
		
		
		
		
		
	}
	
	
}
