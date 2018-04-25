package compiler.syntax.nonTerminal;
import java.util.*;
import es.uned.lsi.compiler.semantic.symbol.*;
import compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.type.*;



public class Lista_variables_Enteras {

	
	private int valor;
    private ArrayList<String> variables= new ArrayList<String>();
    private TypeIF type;
	
	public Lista_variables_Enteras () {
	}
	
	
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	

	public void addVariable (String name, TypeIF type) {
		variables.add(name);
		this.type = type;
	}
	
	public ArrayList<String> getVariables () {
		return variables;
	}
	
	public TypeIF getType() {
		return this.type;
	}
	
	public void setType(TypeIF tipo) {
		this.type = type;
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
