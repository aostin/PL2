package compiler.syntax.nonTerminal;
import java.util.ArrayList;

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
}
