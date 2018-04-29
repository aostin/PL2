package compiler.semantic.type;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;


public class TypeVoid  extends TypeBase
{

    
    /**
     * Constructor for TypeSimple.
     * @param scope The declaration scope.
     */
    public TypeVoid (ScopeIF scope, String name)
    {	super (scope,name);
    	
        
    }
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
    	return 1;
    }
   
    
}
