package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeArray.
 */

// TODO: Student work
//       Include properties to characterize array type

public class TypeArray
    extends TypeBase
{   
	
	int r1,r2;
	/**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     */
    public TypeArray (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     * @param name The name of the type.
     */
    public TypeArray (ScopeIF scope, String name, int r1,  int r2)
    {	
        super (scope, name);
        this.r1 = r1;
        this.r2 = r2;
    }
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        // TODO: Student work
        return r1*r2;
    }
    
    public int getR1() {
    	return this.r1;
    }
    
    public int getR2() {
    	return this.r2;
    }    
    public static boolean rangoCorrecto(int r1, int r2) {
    	if (TypeSimple.rangoPositivo(r1) && TypeSimple.rangoPositivo(r2))
    		return true;
    	else
    		return false;
    }
    

 
    
}
