package compiler.syntax.nonTerminal;
import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.*;
import compiler.semantic.symbol.*;



public class Bloque_sentencias extends Sentencia {

	
	ArrayList<Sentencia> listaSentencias = new ArrayList<Sentencia>();
	//Declaraciones de tipo
	
	public Bloque_sentencias() {
		
	}
	
	
	public void addSentencia(Sentencia sentencia) {
		listaSentencias.add(sentencia);
	}
	
	public ArrayList<Sentencia> getListaSentencias() {
		return listaSentencias;
	}
	
/*	public SymbolTableIF introducirTabla(ScopeIF sc) {
		SymbolTableIF ts = sc.getSymbolTable();
		
		for (Lista_variables_Enteras lista: listaEnteras ){
			ArrayList<String> variables = lista.getVariables();
			for (String var: variables) {
				SymbolVariable sVar = new SymbolVariable(sc,var,lista.getType(),lista.getValor());
				ts.addSymbol(sVar);
			}
			
		}
		return ts;
	}*/
}
