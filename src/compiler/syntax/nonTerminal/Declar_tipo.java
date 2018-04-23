package compiler.syntax.nonTerminal;

public class Declar_tipo {

	private String name;
	private int r1;
	private int r2;
	
	public Declar_tipo (){
		
		}
	public Declar_tipo (String name, int r1, int r2){
		this.name = name;
		
		this.r1= r1;
		this.r2 = r2;
		
		
	}
	
	public void setR1(int r1) {
		this.r1 = r1;
	}
	
	public void setR2(int r2) {
		this.r2 = r2;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getR1() {
		return this.r1;
	}

	public int getR2() {
		return this.r2;
	}
	
	public String getName() {
		return this.name;
	}
	
}
