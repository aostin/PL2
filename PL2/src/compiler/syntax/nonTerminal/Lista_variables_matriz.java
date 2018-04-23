package compiler.syntax.nonTerminal;

import java.util.ArrayList;


public class Lista_variables_matriz {

	 private ArrayList<String> matrices= new ArrayList<String>()	;
	 int r1,r2;
	 String typeName;
	 public Lista_variables_matriz () {
		 
	 }
	 
	 
	 public Lista_variables_matriz (int r1, int r2, String typeName) {
		this.r1=r1;
		this.r2=r2;
		this.typeName = typeName;
	 }
	 
	 public void addMatriz(String name) {
		 matrices.add(name);
	 }
	 
	 public ArrayList getMatrices() {
		 return this.matrices;
	 }
	 public String getTypeName() {
		 return this.typeName;
	 }
}
