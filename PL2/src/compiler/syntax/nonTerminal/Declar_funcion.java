package compiler.syntax.nonTerminal;
import java.util.ArrayList;
import es.uned.lsi.compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.*;
import compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.type.*;



public class Declar_funcion {

	Declar_parametros parametros = new Declar_parametros();
	Declaracion declaracion = new Declaracion();
	String id;
	
	
	public Declar_funcion() {
		
	}
	
	
	public void setParametros(Declar_parametros parametros) {
		this.parametros = parametros;
	}
	
	public Declar_parametros getParametros() {
		return this.parametros;
		
	}
	
	public void setDeclaracion(Declaracion declaracion) {
		this.declaracion = declaracion;
	}
	
	public Declaracion getDeclaracion() {
		return this.declaracion;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId () {
		return this.id;
	}
	
	public void compruebaParametros(ScopeManagerIF scopeManager,SemanticErrorManager semanticErrorManager, ArrayList<String> listaLlamados, int linea) {
		ArrayList<String> listaDeclarados = parametros.getListaIds();
		ArrayList<TypeIF> listaTipos = parametros.getListaTipos();
		if (listaLlamados.size() == listaLlamados.size()) {
			for(int i=0;i<listaDeclarados.size();i++) {
				SymbolIF simbolo = scopeManager.searchSymbol(listaLlamados.get(i));

				if (!((simbolo.getType()).getName()).equals((listaTipos.get(i)).getName()))
					semanticErrorManager.semanticFatalError("Error en la llamada a la funcion " + id + ". El parametro " + listaLlamados.get(i) + " no es del tipo " + (listaTipos.get(i)).getName() +  " en la  linea " + linea );

				
			}
			
		}
		
		else
			semanticErrorManager.semanticFatalError("Error en la llamada a la funcion " + id + ". Numero de argumentos invalido en la linea " + linea );

		
	}
}
