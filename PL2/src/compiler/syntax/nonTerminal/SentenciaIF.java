package compiler.syntax.nonTerminal;
import java.util.ArrayList;

public class SentenciaIF extends Sentencia {

	ArrayList<Sentencia> s1= new ArrayList<Sentencia>();
	ArrayList<Sentencia> s2= new ArrayList<Sentencia>();
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
	public void addS1 (Sentencia s) {
		s1.add(s);
	}
	
	public void addS2 (Sentencia s) {
		s2.add(s);
	}
	
	public ArrayList<Sentencia> getS1() {
		return this.s1;
	}
	
	public ArrayList<Sentencia> getS2() {
		return this.s2;
	}
}
