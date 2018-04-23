package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolConstant.
 */

// TODO: Student work
//       Include properties to characterize constants

	

public class SymbolMatrix 
	extends SymbolBase

{
	int [][] valores;
	boolean[][] definido;
	int r1,r2;
	
	 public SymbolMatrix (ScopeIF scope, String name, TypeIF type, int r1, int r2)
	 	{
		 	super (scope, name, type);
	
		 	this.valores = new int[r1][r2];
		 	this.definido = new boolean[r1][r2];
		 	this.r1=r1;
		 	this.r2=r2;
		 	inicializarMatriz(r1,r2);
	 	} 

	 private void inicializarMatriz(int r1,int r2) {
		 for (int i=0;i<r1;i++) {
			 for (int j=0;j<r2;j++) {
				 valores[i][j]=0;
				 definido[i][j]=false;
			 }
		 }
			 
	 }
	 
	 
	 public boolean rangoCorrecto(int r1, int r2) {
		 if (r1==0 && r2==0)
			 return true;
		 
		 if (r1<this.r1 && r2<this.r2 && r1>=0 && r2>=0)
			 return true;
		 else
			 return false;
		 
	 }
	 
	 public void setValor(int r1, int r2, int valor) {
		 valores[r1][r2]=valor;
		 definido[r1][r2]=true;
	 }
	 
	 public int getValor(int r1, int r2) {
		 return valores[r1][r2];
	 }
	 
	 public boolean getDefinido(int r1, int r2) {
		 return definido[r1][r2];
	 } 
	 
}
