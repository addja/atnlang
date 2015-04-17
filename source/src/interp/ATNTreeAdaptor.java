package interp;

// Imports from ANTLR
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import parser.*;



/**
 * This is the tree adaptor for the extended class of AST nodes.
 * It re-defines some required methods to cast the AST tree nodes
 * to the new AST nodes.
 */
 
public class ATNTreeAdaptor extends CommonTreeAdaptor {
    public Object create(Token t) {
        return new ATNTree(t);
    }

    public Object dupNode(Object t) {
        if ( t==null ) return null;
        return create(((ATNTree)t).token);
    }
    
    public Object errorNode(TokenStream input, Token start, Token stop,
                             RecognitionException e) {
        return null;
    }
}

