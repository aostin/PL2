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
	
	public boolean tieneReturn(String tipo) {
		Boolean tieneReturn;
		if (tipo.equals("funcion"))
			tieneReturn = false;
		else
			tieneReturn=true;
		//Comprueba primero si tiene una sentencia simple de retorno
		//Luego comprueba que exista paridad en los retornos de los if
		for (Sentencia sen: listaSentencias) {
			if (sen instanceof Sentencia_simple){
				Sentencia_simple senSimple = (Sentencia_simple)sen;
				if ((senSimple.getTipo()).equals("return"))
				
					//Si existe una sentencia return en el bloque devuelve true ya que siempre pasará por este camino
					return true;
					/*Expresion ex = senSimple.getEx();
					System.out.println(senSimple.getTipo());
					System.out.println(ex.getValor());
					*/
				}
				else {
					if (sen instanceof SentenciaIF) {
						SentenciaIF sIF = (SentenciaIF)sen;
						tieneReturn= sIF.compruebaReturns(tipo);
						
				
				}
			}
			
			if (sen instanceof Sentencia_While) {
				Sentencia_While senWhile = (Sentencia_While)sen;
				tieneReturn= senWhile.compruebaReturns(tipo);
				if (tieneReturn==false)
					return false;
			}
		}
		
			
		return tieneReturn;
	}
	

}
