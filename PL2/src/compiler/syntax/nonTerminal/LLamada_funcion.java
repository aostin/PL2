package compiler.syntax.nonTerminal;
import java.util.ArrayList;
import es.uned.lsi.compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.*;
import compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.type.*;

public class LLamada_funcion extends Sentencia {

	
	ArrayList<String> listaIds = new ArrayList<String>();
	String id;
	
	
	public LLamada_funcion() {
		
		
	}
	
	
	public void setListaIds(ArrayList<String> listaIds) {
		this.listaIds = listaIds;
	}
	
	
	public ArrayList<String> getListaIds() {
		return this.listaIds;
	}
	
	public void addListaIds(String id) {
		listaIds.add(id);
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getId() {
		return id;
	}
	
	
}
