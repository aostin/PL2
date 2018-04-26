package compiler.syntax.nonTerminal;
import java.util.ArrayList;

public class Declar_variable {
		ArrayList<Lista_variables_Enteras> listaEnteras = new ArrayList<Lista_variables_Enteras>();
		ArrayList<Lista_variables_matriz> listaMatrices = new ArrayList<Lista_variables_matriz>();
		ArrayList<Bloque_sentencias> bloque = new ArrayList<Bloque_sentencias>();
		
		public Declar_variable () {
			
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
		
		public void setBloque(ArrayList<Bloque_sentencias> bloque) {
			this.bloque=bloque;
		}
		
		public ArrayList<Bloque_sentencias> getBloque(){
			return this.bloque;
		}
		
		
		
}
