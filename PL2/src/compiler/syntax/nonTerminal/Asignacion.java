package compiler.syntax.nonTerminal;
import java.util.ArrayList;

public class Asignacion extends Sentencia {
	
	Expresion exp;
	String id;
	int r1,r2=-1;
	
	public Asignacion(String id,Expresion exp) {
		this.id = id;
		this.exp = exp;
		
	}
	
	public Asignacion(String id, Expresion exp, int r1, int r2) {
		this.id=id;
		this.exp=exp;
		this.r1=r1;
		this.r2=r2;
	}
	
	public void setExp(Expresion exp) {
		this.exp=exp;
	}
	
	
	public Expresion getExp() {
		return this.exp;
	}

	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getId() {
		return this.id;
	}
}
