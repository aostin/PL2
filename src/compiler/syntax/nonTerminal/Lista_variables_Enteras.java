package compiler.syntax.nonTerminal;
import java.util.*;
import es.uned.lsi.compiler.semantic.symbol.*;
import compiler.semantic.symbol.*;



public class Lista_variables_Enteras {

	
	private int valor;
    private ArrayList<String> variables= new ArrayList<String>()	;
	
	public Lista_variables_Enteras () {
	}
	
	
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	

	public void addVariable (String name) {
		variables.add(name);
	}
	
	public ArrayList<String> getVariables () {
		return variables;
	}
	
	public SymbolTableIF actualizaValores(SymbolTableIF ts) {
		
		for (String varAntigua: variables) {
			SymbolVariable var = (SymbolVariable)(ts.getSymbol(varAntigua));
			var.setValor(valor);
			ts.addSymbol(var);
			
		}
		
		return ts;
		
	}
	
	
}
