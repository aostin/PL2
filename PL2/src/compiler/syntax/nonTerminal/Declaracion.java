package compiler.syntax.nonTerminal;
import java.util.ArrayList;
import es.uned.lsi.compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.*;
import compiler.semantic.symbol.*;



public class Declaracion {
		ArrayList<Lista_variables_Enteras> listaEnteras = new ArrayList<Lista_variables_Enteras>();
		ArrayList<Lista_variables_matriz> listaMatrices = new ArrayList<Lista_variables_matriz>();
		Bloque_sentencias sentencias = new Bloque_sentencias();
		ArrayList<Declar_tipo> listaTipos = new ArrayList<Declar_tipo>();
		
		public Declaracion () {
			
		}
		
		public void setListaEnteras(ArrayList<Lista_variables_Enteras> listaEnteras) {
			this.listaEnteras = listaEnteras;
		}
		
		public ArrayList<Lista_variables_Enteras> getListaEnteras() {
			return this.listaEnteras;
		}
		
		public void setListaMatrices(ArrayList<Lista_variables_matriz> listaMatrices) {
			this.listaMatrices = listaMatrices;
		}
		
		public ArrayList<Lista_variables_matriz> getListaMatrices() {
			return this.listaMatrices;
		}
		
		public void addListaMatrices(Lista_variables_matriz listaMat) {
			listaMatrices.add(listaMat);
		}
		
		public void addListaEnteras(Lista_variables_Enteras lista) {
			listaEnteras.add(lista);
		}
		
		public void setSentencias(Bloque_sentencias sentencias) {
			this.sentencias = sentencias;
		}
		
		public Bloque_sentencias getSentencias(){
			return this.sentencias;
		}
		
		
		
		public ArrayList<Declar_tipo> getListaTipos () {
			return this.listaTipos;
		}
		
		public void setListaTipos(ArrayList<Declar_tipo> listaTipos) {
			this.listaTipos = listaTipos;
		}
		
		public void addListaTipos(Declar_tipo tipo) {
			
			listaTipos.add(tipo);
			
		}
		
		public SymbolTableIF introducirTabla(ScopeIF sc) {
			SymbolTableIF ts = sc.getSymbolTable();
		
			for (Lista_variables_Enteras lista: listaEnteras ){
				ArrayList<String> variables = lista.getVariables();
				for (String var: variables) {
					SymbolVariable sVar = new SymbolVariable(sc,var,lista.getType(),lista.getValor());
					ts.addSymbol(sVar);
				}
			
			}
			
			for (Lista_variables_matriz listaMat: listaMatrices) {
				ArrayList<String> matrices = listaMat.getMatrices();
				for (String var:matrices){
					SymbolMatrix sMatrix = new SymbolMatrix(sc,var,listaMat.getType(),listaMat.getR1(),listaMat.getR2());
					ts.addSymbol(sMatrix);


				}
			}
			return ts;
	}
		
		public int getSizeListaEnteras() {
			return listaEnteras.size();
		}
		
		public int getSizeListaMatrices() {
			return listaMatrices.size();
		}
		
		public int getSizeListaTipos() {
			return listaTipos.size();
		}
		
	
		
		
		
}
