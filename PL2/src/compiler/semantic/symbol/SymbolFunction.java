package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import java.util.ArrayList;
import es.uned.lsi.compiler.semantic.type.TypeIF;
import compiler.syntax.nonTerminal.*;

/**
 * Class for SymbolFunction.
 */

// TODO: Student work
//       Include properties to characterize function calls

public class SymbolFunction
    extends SymbolProcedure
{
	
	Declar_funcion funcion = new Declar_funcion();
      
    /**
     * Constructor for SymbolFunction.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolFunction (ScopeIF scope, 
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
    } 
    
    
    public void setFuncion(Declar_funcion funcion) {
    	this.funcion = funcion;
    }
    
    public Declar_funcion getFuncion() {
    	return this.funcion;
    }
}
