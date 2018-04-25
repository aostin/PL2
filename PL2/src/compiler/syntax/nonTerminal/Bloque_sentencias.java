package compiler.syntax.nonTerminal;
import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.*;
import compiler.semantic.symbol.*;



public class Bloque_sentencias extends Sentencia {

	
	Declar_variable dec_Variable = new Declar_variable();
	ArrayList<Sentencia> listaSentencias;
	//Declaraciones de tipo
	
	public Bloque_sentencias() {
		
	}
	
	public void setDec_Variable(Declar_variable dec_Variable) {
		this.dec_Variable = dec_Variable;
	}
	
	public Declar_variable getDec_Variable() {
		return this.dec_Variable;
		
	}
	
	public void addSentencia(Sentencia sentencia) {
		listaSentencias.add(sentencia);
	}
	
	public ArrayList<Sentencia> getListaSentencias() {
		return listaSentencias;
	}
	
	public SymbolTableIF introducirTabla(ScopeIF sc) {
		SymbolTableIF ts = sc.getSymbolTable();
		ArrayList<Lista_variables_Enteras> listaEnteras = dec_Variable.getListaEnteras();
		
		for (Lista_variables_Enteras lista: listaEnteras ){
			ArrayList<String> variables = lista.getVariables();
			for (String var: variables) {
				SymbolVariable sVar = new SymbolVariable(sc,var,lista.getType(),lista.getValor());
				ts.addSymbol(sVar);
			}
			
		}
		return ts;
	}
}
