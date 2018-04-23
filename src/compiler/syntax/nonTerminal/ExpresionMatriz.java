package compiler.syntax.nonTerminal;

public class ExpresionMatriz extends ExpresionId {
	int r1,r2;
	public ExpresionMatriz(int valor, String id, int r1,int  r2) {
		super(valor,id);
		this.tipo="tipoMatriz";
		this.r1 = r1;
		this.r2 = r2;
		
	}
	
	public void setR1(int r1) {
		this.r1=r1;
	}
	
	public void setR2(int r2) {
		this.r2=r2;
	}
	
	public int getR1 () {
		return this.r1;
	}
	
	public int getR2() {
		return this.r2;
	}

}
