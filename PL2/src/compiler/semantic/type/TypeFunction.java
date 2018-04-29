package compiler.semantic.type;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for TypeFunction.
 */

// TODO: Student work
//       Include properties to characterize function declarations

public class TypeFunction
    extends TypeProcedure
{   
    ArrayList<TypeIF> listaTipos = new ArrayList<TypeIF>();
    TypeIF tipoRetorno;
    /**
     * Constructor for TypeFunction.
     * @param scope The declaration scope.
     */
    public TypeFunction (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeFunction.
     * @param scope The declaration scope
     * @param name The name of the function.
     */
    public TypeFunction (ScopeIF scope, String name)
    {
        super (scope, name);
    }
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        // TODO: Student work
        return 1;
    }
    
    public void setListaTipos (ArrayList<TypeIF> listaTipos) {
    	this.listaTipos = listaTipos;
    }
    
    public ArrayList<TypeIF> getListaTipos () {
    	return this.listaTipos;
    }
    
    
    public void setTipoRetorno(TypeIF tipoRetorno) {
    	this.tipoRetorno = tipoRetorno;
    }
    
    public TypeIF getTipoRetorno() {
    	return this.tipoRetorno;
    }
    
    
}
