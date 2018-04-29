package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import es.uned.lsi.compiler.semantic.type.*;

public class Lista_variables_matriz {

	 private ArrayList<String> matrices= new ArrayList<String>()	;
	 int r1,r2;
	 private TypeIF type;
	 public Lista_variables_matriz () {
		 
	 }
	 
	 
	 public Lista_variables_matriz (int r1, int r2, TypeIF type) {
		this.r1=r1;
		this.r2=r2;
		this.type = type;
	 }
	 
	 public void addMatriz(String name) {
		 matrices.add(name);
	 }
	 
	 public ArrayList getMatrices() {
		 return this.matrices;
	 }

	 
	 public void setType(TypeIF type) {
		 this.type = type;
	 }
	 
	 public TypeIF getType() {
		 return this.type;
	 }
	 
	 public int getR1() {
		 return this.r1;
	 }
	 
	 public int getR2() {
		 return this.r2;
	 }
}
