package compiler.syntax.nonTerminal;
import java.util.ArrayList;
import es.uned.lsi.compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.*;
import compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.type.*;


public class Declar_parametros {
	
	ArrayList<TypeIF> listaTipos = new ArrayList<TypeIF>();
	ArrayList<String> listaIds = new ArrayList<String>();
	

	public Declar_parametros() {
		
	}
	public void setListaTipos(ArrayList<TypeIF> listaTipos) {
		this.listaTipos = listaTipos;
	}
	
	public ArrayList<TypeIF> getListaTipos() {
		return this.listaTipos;
	}
	
	public void addTipo(TypeIF tipo) {
		listaTipos.add(tipo);
	}
	
	public void setListaIds(ArrayList<String> listasIds) {
		this.listaIds = listaIds;
		
	}
	
	public ArrayList<String> getListaIds() {
		return this.listaIds;
	}
	
	public void addId(String id) {
		listaIds.add(id);
	}
	
	public SymbolTableIF introducirParametros(ScopeIF sc, SemanticErrorManager semanticErrorManager, String nombreFuncion) {
		SymbolTableIF ts = sc.getSymbolTable();

		int i=0;
	
		for (String id: listaIds ){
				if (ts.containsSymbol(id))
					semanticErrorManager.semanticFatalError("Error. La variable " + id + " ya ha sido antes definida como parametro en la funcion " + nombreFuncion);

				else{
					
				SymbolParameter sPar = new SymbolParameter(sc,id,listaTipos.get(0) );
				ts.addSymbol(sPar);
				}
			}
		return ts;
	}

}
