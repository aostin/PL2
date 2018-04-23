package compiler.syntax.nonTerminal;
import java.util.ArrayList;

public class ExpresionCompuesta extends Expresion {
	
	Expresion exp1, exp2;

	public ExpresionCompuesta(int valor, String tipo, Expresion exp1, Expresion exp2) {
		super(valor,tipo);
		this.exp1=exp1;
		this.exp2=exp2;
		
	}
	
	public void setExp1(Expresion exp1) {
		this.exp1=exp1;
	}
	
	public void setExp2(Expresion exp1) {
		this.exp2=exp2;
	}
	
	public Expresion getExp1() {
		return this.exp1;
	}
	
	public Expresion getExp2() {
		return this.exp2;
	}
}
