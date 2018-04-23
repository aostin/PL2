package compiler.syntax.nonTerminal;

public class ExpresionId extends Expresion {

	
	String id;
	
	public ExpresionId (int valor, String id){
		
		super(valor,"tipoId");
		this.id=id;
		
	}
	
	public ExpresionId(String id) {
		this.id = id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getId() {
		return this.id;
	}
}
