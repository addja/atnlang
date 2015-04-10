// $ANTLR 3.4 /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g 2015-04-10 17:55:36

package parser;
import interp.ATNTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


/**
 * ATN interpreter grammar
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class ATNParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARC", "ARGLIST", "ARRAYLENGTH", "ASSIGN", "ATN", "BOOLEAN", "BRACKET", "COMMENT", "DEF", "DIV", "ELSE", "EQUAL", "ESC_SEQ", "FALSE", "FOR", "FUNCALL", "GE", "GT", "HASHBASE", "HASHCODE", "HASHEND", "HASHFORWARD", "HASHTEXT", "ID", "IF", "INT", "JUMP", "LE", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NODE", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PRINT", "PROGRAM", "PVALUE", "RETURN", "STRING", "TRUE", "WHILE", "WS", "'#.base'", "'#.code'", "'#.end()'", "'#.forward()'", "'#.text'", "'&'", "'('", "')'", "','", "'.length'", "';'", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int AND=4;
    public static final int ARC=5;
    public static final int ARGLIST=6;
    public static final int ARRAYLENGTH=7;
    public static final int ASSIGN=8;
    public static final int ATN=9;
    public static final int BOOLEAN=10;
    public static final int BRACKET=11;
    public static final int COMMENT=12;
    public static final int DEF=13;
    public static final int DIV=14;
    public static final int ELSE=15;
    public static final int EQUAL=16;
    public static final int ESC_SEQ=17;
    public static final int FALSE=18;
    public static final int FOR=19;
    public static final int FUNCALL=20;
    public static final int GE=21;
    public static final int GT=22;
    public static final int HASHBASE=23;
    public static final int HASHCODE=24;
    public static final int HASHEND=25;
    public static final int HASHFORWARD=26;
    public static final int HASHTEXT=27;
    public static final int ID=28;
    public static final int IF=29;
    public static final int INT=30;
    public static final int JUMP=31;
    public static final int LE=32;
    public static final int LIST_INSTR=33;
    public static final int LT=34;
    public static final int MINUS=35;
    public static final int MOD=36;
    public static final int MUL=37;
    public static final int NODE=38;
    public static final int NOT=39;
    public static final int NOT_EQUAL=40;
    public static final int OR=41;
    public static final int PARAMS=42;
    public static final int PLUS=43;
    public static final int PREF=44;
    public static final int PRINT=45;
    public static final int PROGRAM=46;
    public static final int PVALUE=47;
    public static final int RETURN=48;
    public static final int STRING=49;
    public static final int TRUE=50;
    public static final int WHILE=51;
    public static final int WS=52;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ATNParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ATNParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ATNParser.tokenNames; }
    public String getGrammarFileName() { return "/home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:40:1: prog : ( utilities )+ EOF -> ^( PROGRAM ( utilities )+ ) ;
    public final ATNParser.prog_return prog() throws RecognitionException {
        ATNParser.prog_return retval = new ATNParser.prog_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token EOF2=null;
        ATNParser.utilities_return utilities1 =null;


        ATNTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_utilities=new RewriteRuleSubtreeStream(adaptor,"rule utilities");
        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:40:9: ( ( utilities )+ EOF -> ^( PROGRAM ( utilities )+ ) )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:40:11: ( utilities )+ EOF
            {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:40:11: ( utilities )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ATN||LA1_0==DEF||LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:40:11: utilities
            	    {
            	    pushFollow(FOLLOW_utilities_in_prog223);
            	    utilities1=utilities();

            	    state._fsp--;

            	    stream_utilities.add(utilities1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog226);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: utilities
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ATNTree)adaptor.nil();
            // 40:26: -> ^( PROGRAM ( utilities )+ )
            {
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:40:29: ^( PROGRAM ( utilities )+ )
                {
                ATNTree root_1 = (ATNTree)adaptor.nil();
                root_1 = (ATNTree)adaptor.becomeRoot(
                (ATNTree)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                if ( !(stream_utilities.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_utilities.hasNext() ) {
                    adaptor.addChild(root_1, stream_utilities.nextTree());

                }
                stream_utilities.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class utilities_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "utilities"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:44:1: utilities : ( DEF ^ ID params '{' ! block_instructions '}' !| ATN ^ ID '{' ! node_list '}' !| assign ';' !| funcall ';' !);
    public final ATNParser.utilities_return utilities() throws RecognitionException {
        ATNParser.utilities_return retval = new ATNParser.utilities_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token DEF3=null;
        Token ID4=null;
        Token char_literal6=null;
        Token char_literal8=null;
        Token ATN9=null;
        Token ID10=null;
        Token char_literal11=null;
        Token char_literal13=null;
        Token char_literal15=null;
        Token char_literal17=null;
        ATNParser.params_return params5 =null;

        ATNParser.block_instructions_return block_instructions7 =null;

        ATNParser.node_list_return node_list12 =null;

        ATNParser.assign_return assign14 =null;

        ATNParser.funcall_return funcall16 =null;


        ATNTree DEF3_tree=null;
        ATNTree ID4_tree=null;
        ATNTree char_literal6_tree=null;
        ATNTree char_literal8_tree=null;
        ATNTree ATN9_tree=null;
        ATNTree ID10_tree=null;
        ATNTree char_literal11_tree=null;
        ATNTree char_literal13_tree=null;
        ATNTree char_literal15_tree=null;
        ATNTree char_literal17_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:44:13: ( DEF ^ ID params '{' ! block_instructions '}' !| ATN ^ ID '{' ! node_list '}' !| assign ';' !| funcall ';' !)
            int alt2=4;
            switch ( input.LA(1) ) {
            case DEF:
                {
                alt2=1;
                }
                break;
            case ATN:
                {
                alt2=2;
                }
                break;
            case ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==BRACKET||LA2_3==EQUAL||LA2_3==62) ) {
                    alt2=3;
                }
                else if ( (LA2_3==59) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:44:15: DEF ^ ID params '{' ! block_instructions '}' !
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    DEF3=(Token)match(input,DEF,FOLLOW_DEF_in_utilities263); 
                    DEF3_tree = 
                    (ATNTree)adaptor.create(DEF3)
                    ;
                    root_0 = (ATNTree)adaptor.becomeRoot(DEF3_tree, root_0);


                    ID4=(Token)match(input,ID,FOLLOW_ID_in_utilities266); 
                    ID4_tree = 
                    (ATNTree)adaptor.create(ID4)
                    ;
                    adaptor.addChild(root_0, ID4_tree);


                    pushFollow(FOLLOW_params_in_utilities268);
                    params5=params();

                    state._fsp--;

                    adaptor.addChild(root_0, params5.getTree());

                    char_literal6=(Token)match(input,65,FOLLOW_65_in_utilities270); 

                    pushFollow(FOLLOW_block_instructions_in_utilities273);
                    block_instructions7=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions7.getTree());

                    char_literal8=(Token)match(input,66,FOLLOW_66_in_utilities275); 

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:45:15: ATN ^ ID '{' ! node_list '}' !
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    ATN9=(Token)match(input,ATN,FOLLOW_ATN_in_utilities292); 
                    ATN9_tree = 
                    (ATNTree)adaptor.create(ATN9)
                    ;
                    root_0 = (ATNTree)adaptor.becomeRoot(ATN9_tree, root_0);


                    ID10=(Token)match(input,ID,FOLLOW_ID_in_utilities295); 
                    ID10_tree = 
                    (ATNTree)adaptor.create(ID10)
                    ;
                    adaptor.addChild(root_0, ID10_tree);


                    char_literal11=(Token)match(input,65,FOLLOW_65_in_utilities297); 

                    pushFollow(FOLLOW_node_list_in_utilities300);
                    node_list12=node_list();

                    state._fsp--;

                    adaptor.addChild(root_0, node_list12.getTree());

                    char_literal13=(Token)match(input,66,FOLLOW_66_in_utilities302); 

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:46:15: assign ';' !
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_utilities319);
                    assign14=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign14.getTree());

                    char_literal15=(Token)match(input,63,FOLLOW_63_in_utilities321); 

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:47:6: funcall ';' !
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_utilities329);
                    funcall16=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall16.getTree());

                    char_literal17=(Token)match(input,63,FOLLOW_63_in_utilities331); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "utilities"


    public static class node_list_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node_list"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:50:1: node_list : node ( node )+ ;
    public final ATNParser.node_list_return node_list() throws RecognitionException {
        ATNParser.node_list_return retval = new ATNParser.node_list_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        ATNParser.node_return node18 =null;

        ATNParser.node_return node19 =null;



        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:50:13: ( node ( node )+ )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:50:15: node ( node )+
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_node_in_node_list355);
            node18=node();

            state._fsp--;

            adaptor.addChild(root_0, node18.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:50:20: ( node )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NODE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:50:21: node
            	    {
            	    pushFollow(FOLLOW_node_in_node_list358);
            	    node19=node();

            	    state._fsp--;

            	    adaptor.addChild(root_0, node19.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "node_list"


    public static class node_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:53:1: node : NODE ^ ID '{' ! arc_list '}' !;
    public final ATNParser.node_return node() throws RecognitionException {
        ATNParser.node_return retval = new ATNParser.node_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token NODE20=null;
        Token ID21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        ATNParser.arc_list_return arc_list23 =null;


        ATNTree NODE20_tree=null;
        ATNTree ID21_tree=null;
        ATNTree char_literal22_tree=null;
        ATNTree char_literal24_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:53:13: ( NODE ^ ID '{' ! arc_list '}' !)
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:53:15: NODE ^ ID '{' ! arc_list '}' !
            {
            root_0 = (ATNTree)adaptor.nil();


            NODE20=(Token)match(input,NODE,FOLLOW_NODE_in_node400); 
            NODE20_tree = 
            (ATNTree)adaptor.create(NODE20)
            ;
            root_0 = (ATNTree)adaptor.becomeRoot(NODE20_tree, root_0);


            ID21=(Token)match(input,ID,FOLLOW_ID_in_node403); 
            ID21_tree = 
            (ATNTree)adaptor.create(ID21)
            ;
            adaptor.addChild(root_0, ID21_tree);


            char_literal22=(Token)match(input,65,FOLLOW_65_in_node405); 

            pushFollow(FOLLOW_arc_list_in_node408);
            arc_list23=arc_list();

            state._fsp--;

            adaptor.addChild(root_0, arc_list23.getTree());

            char_literal24=(Token)match(input,66,FOLLOW_66_in_node410); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "node"


    public static class arc_list_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arc_list"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:56:1: arc_list : arc ( arc )+ ;
    public final ATNParser.arc_list_return arc_list() throws RecognitionException {
        ATNParser.arc_list_return retval = new ATNParser.arc_list_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        ATNParser.arc_return arc25 =null;

        ATNParser.arc_return arc26 =null;



        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:56:13: ( arc ( arc )+ )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:56:15: arc ( arc )+
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_arc_in_arc_list435);
            arc25=arc();

            state._fsp--;

            adaptor.addChild(root_0, arc25.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:56:19: ( arc )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ARC) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:56:20: arc
            	    {
            	    pushFollow(FOLLOW_arc_in_arc_list438);
            	    arc26=arc();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arc26.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arc_list"


    public static class arc_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arc"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:59:1: arc : ARC ^ '(' expr ')' ! instructions ;
    public final ATNParser.arc_return arc() throws RecognitionException {
        ATNParser.arc_return retval = new ATNParser.arc_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token ARC27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        ATNParser.expr_return expr29 =null;

        ATNParser.instructions_return instructions31 =null;


        ATNTree ARC27_tree=null;
        ATNTree char_literal28_tree=null;
        ATNTree char_literal30_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:59:12: ( ARC ^ '(' expr ')' ! instructions )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:59:14: ARC ^ '(' expr ')' ! instructions
            {
            root_0 = (ATNTree)adaptor.nil();


            ARC27=(Token)match(input,ARC,FOLLOW_ARC_in_arc469); 
            ARC27_tree = 
            (ATNTree)adaptor.create(ARC27)
            ;
            root_0 = (ATNTree)adaptor.becomeRoot(ARC27_tree, root_0);


            char_literal28=(Token)match(input,59,FOLLOW_59_in_arc472); 
            char_literal28_tree = 
            (ATNTree)adaptor.create(char_literal28)
            ;
            adaptor.addChild(root_0, char_literal28_tree);


            pushFollow(FOLLOW_expr_in_arc474);
            expr29=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr29.getTree());

            char_literal30=(Token)match(input,60,FOLLOW_60_in_arc476); 

            pushFollow(FOLLOW_instructions_in_arc479);
            instructions31=instructions();

            state._fsp--;

            adaptor.addChild(root_0, instructions31.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arc"


    public static class params_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:63:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final ATNParser.params_return params() throws RecognitionException {
        ATNParser.params_return retval = new ATNParser.params_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token char_literal32=null;
        Token char_literal34=null;
        ATNParser.paramlist_return paramlist33 =null;


        ATNTree char_literal32_tree=null;
        ATNTree char_literal34_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:63:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:63:11: '(' ( paramlist )? ')'
            {
            char_literal32=(Token)match(input,59,FOLLOW_59_in_params508);  
            stream_59.add(char_literal32);


            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:63:15: ( paramlist )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||LA5_0==58) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:63:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params510);
                    paramlist33=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist33.getTree());

                    }
                    break;

            }


            char_literal34=(Token)match(input,60,FOLLOW_60_in_params513);  
            stream_60.add(char_literal34);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ATNTree)adaptor.nil();
            // 63:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:63:33: ^( PARAMS ( paramlist )? )
                {
                ATNTree root_1 = (ATNTree)adaptor.nil();
                root_1 = (ATNTree)adaptor.becomeRoot(
                (ATNTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:63:42: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:67:1: paramlist : param ( ',' ! param )* ;
    public final ATNParser.paramlist_return paramlist() throws RecognitionException {
        ATNParser.paramlist_return retval = new ATNParser.paramlist_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token char_literal36=null;
        ATNParser.param_return param35 =null;

        ATNParser.param_return param37 =null;


        ATNTree char_literal36_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:67:10: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:67:12: param ( ',' ! param )*
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist539);
            param35=param();

            state._fsp--;

            adaptor.addChild(root_0, param35.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:67:18: ( ',' ! param )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==61) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:67:19: ',' ! param
            	    {
            	    char_literal36=(Token)match(input,61,FOLLOW_61_in_paramlist542); 

            	    pushFollow(FOLLOW_param_in_paramlist545);
            	    param37=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param37.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:72:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final ATNParser.param_return param() throws RecognitionException {
        ATNParser.param_return retval = new ATNParser.param_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token id=null;
        Token char_literal38=null;

        ATNTree id_tree=null;
        ATNTree char_literal38_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:72:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==58) ) {
                alt7=1;
            }
            else if ( (LA7_0==ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:72:13: '&' id= ID
                    {
                    char_literal38=(Token)match(input,58,FOLLOW_58_in_param570);  
                    stream_58.add(char_literal38);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param574);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 72:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:72:26: ^( PREF[$id,$id.text] )
                        {
                        ATNTree root_1 = (ATNTree)adaptor.nil();
                        root_1 = (ATNTree)adaptor.becomeRoot(
                        (ATNTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:73:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param597);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 73:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:73:22: ^( PVALUE[$id,$id.text] )
                        {
                        ATNTree root_1 = (ATNTree)adaptor.nil();
                        root_1 = (ATNTree)adaptor.becomeRoot(
                        (ATNTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class instructions_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instructions"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:76:1: instructions : ( inst_comma -> ^( LIST_INSTR inst_comma ) | '{' ! block_instructions '}' !);
    public final ATNParser.instructions_return instructions() throws RecognitionException {
        ATNParser.instructions_return retval = new ATNParser.instructions_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token char_literal40=null;
        Token char_literal42=null;
        ATNParser.inst_comma_return inst_comma39 =null;

        ATNParser.block_instructions_return block_instructions41 =null;


        ATNTree char_literal40_tree=null;
        ATNTree char_literal42_tree=null;
        RewriteRuleSubtreeStream stream_inst_comma=new RewriteRuleSubtreeStream(adaptor,"rule inst_comma");
        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:77:9: ( inst_comma -> ^( LIST_INSTR inst_comma ) | '{' ! block_instructions '}' !)
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FOR||(LA8_0 >= ID && LA8_0 <= IF)||LA8_0==JUMP||LA8_0==PRINT||LA8_0==RETURN||LA8_0==WHILE||LA8_0==63) ) {
                alt8=1;
            }
            else if ( (LA8_0==65) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:77:12: inst_comma
                    {
                    pushFollow(FOLLOW_inst_comma_in_instructions630);
                    inst_comma39=inst_comma();

                    state._fsp--;

                    stream_inst_comma.add(inst_comma39.getTree());

                    // AST REWRITE
                    // elements: inst_comma
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 77:23: -> ^( LIST_INSTR inst_comma )
                    {
                        // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:77:26: ^( LIST_INSTR inst_comma )
                        {
                        ATNTree root_1 = (ATNTree)adaptor.nil();
                        root_1 = (ATNTree)adaptor.becomeRoot(
                        (ATNTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                        , root_1);

                        adaptor.addChild(root_1, stream_inst_comma.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:78:12: '{' ! block_instructions '}' !
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    char_literal40=(Token)match(input,65,FOLLOW_65_in_instructions651); 

                    pushFollow(FOLLOW_block_instructions_in_instructions654);
                    block_instructions41=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions41.getTree());

                    char_literal42=(Token)match(input,66,FOLLOW_66_in_instructions656); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instructions"


    public static class block_instructions_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:82:1: block_instructions : inst_comma ( inst_comma )* -> ^( LIST_INSTR ( inst_comma )+ ) ;
    public final ATNParser.block_instructions_return block_instructions() throws RecognitionException {
        ATNParser.block_instructions_return retval = new ATNParser.block_instructions_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        ATNParser.inst_comma_return inst_comma43 =null;

        ATNParser.inst_comma_return inst_comma44 =null;


        RewriteRuleSubtreeStream stream_inst_comma=new RewriteRuleSubtreeStream(adaptor,"rule inst_comma");
        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:83:9: ( inst_comma ( inst_comma )* -> ^( LIST_INSTR ( inst_comma )+ ) )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:83:12: inst_comma ( inst_comma )*
            {
            pushFollow(FOLLOW_inst_comma_in_block_instructions684);
            inst_comma43=inst_comma();

            state._fsp--;

            stream_inst_comma.add(inst_comma43.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:83:23: ( inst_comma )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==FOR||(LA9_0 >= ID && LA9_0 <= IF)||LA9_0==JUMP||LA9_0==PRINT||LA9_0==RETURN||LA9_0==WHILE||LA9_0==63) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:83:24: inst_comma
            	    {
            	    pushFollow(FOLLOW_inst_comma_in_block_instructions687);
            	    inst_comma44=inst_comma();

            	    state._fsp--;

            	    stream_inst_comma.add(inst_comma44.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // AST REWRITE
            // elements: inst_comma
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ATNTree)adaptor.nil();
            // 84:13: -> ^( LIST_INSTR ( inst_comma )+ )
            {
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:84:16: ^( LIST_INSTR ( inst_comma )+ )
                {
                ATNTree root_1 = (ATNTree)adaptor.nil();
                root_1 = (ATNTree)adaptor.becomeRoot(
                (ATNTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_inst_comma.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_inst_comma.hasNext() ) {
                    adaptor.addChild(root_1, stream_inst_comma.nextTree());

                }
                stream_inst_comma.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class inst_comma_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inst_comma"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:87:1: inst_comma : instruction ';' !;
    public final ATNParser.inst_comma_return inst_comma() throws RecognitionException {
        ATNParser.inst_comma_return retval = new ATNParser.inst_comma_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token char_literal46=null;
        ATNParser.instruction_return instruction45 =null;


        ATNTree char_literal46_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:88:9: ( instruction ';' !)
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:88:11: instruction ';' !
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_instruction_in_inst_comma736);
            instruction45=instruction();

            state._fsp--;

            adaptor.addChild(root_0, instruction45.getTree());

            char_literal46=(Token)match(input,63,FOLLOW_63_in_inst_comma738); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inst_comma"


    public static class instruction_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:92:1: instruction : ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | jump | print |);
    public final ATNParser.instruction_return instruction() throws RecognitionException {
        ATNParser.instruction_return retval = new ATNParser.instruction_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        ATNParser.assign_return assign47 =null;

        ATNParser.ite_stmt_return ite_stmt48 =null;

        ATNParser.while_stmt_return while_stmt49 =null;

        ATNParser.for_stmt_return for_stmt50 =null;

        ATNParser.funcall_return funcall51 =null;

        ATNParser.return_stmt_return return_stmt52 =null;

        ATNParser.jump_return jump53 =null;

        ATNParser.print_return print54 =null;



        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:93:9: ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | jump | print |)
            int alt10=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==BRACKET||LA10_1==EQUAL||LA10_1==62) ) {
                    alt10=1;
                }
                else if ( (LA10_1==59) ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt10=2;
                }
                break;
            case WHILE:
                {
                alt10=3;
                }
                break;
            case FOR:
                {
                alt10=4;
                }
                break;
            case RETURN:
                {
                alt10=6;
                }
                break;
            case JUMP:
                {
                alt10=7;
                }
                break;
            case PRINT:
                {
                alt10=8;
                }
                break;
            case 63:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:93:13: assign
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction767);
                    assign47=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign47.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:94:13: ite_stmt
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction791);
                    ite_stmt48=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt48.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:95:13: while_stmt
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction813);
                    while_stmt49=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt49.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:96:13: for_stmt
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction833);
                    for_stmt50=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt50.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:97:13: funcall
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction855);
                    funcall51=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall51.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:98:13: return_stmt
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction878);
                    return_stmt52=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt52.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:99:13: jump
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_jump_in_instruction897);
                    jump53=jump();

                    state._fsp--;

                    adaptor.addChild(root_0, jump53.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:100:13: print
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_print_in_instruction923);
                    print54=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print54.getTree());

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:102:9: 
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:105:1: assign : subatom eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] subatom expr ) ;
    public final ATNParser.assign_return assign() throws RecognitionException {
        ATNParser.assign_return retval = new ATNParser.assign_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token eq=null;
        ATNParser.subatom_return subatom55 =null;

        ATNParser.expr_return expr56 =null;


        ATNTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_subatom=new RewriteRuleSubtreeStream(adaptor,"rule subatom");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:105:9: ( subatom eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] subatom expr ) )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:105:13: subatom eq= EQUAL expr
            {
            pushFollow(FOLLOW_subatom_in_assign986);
            subatom55=subatom();

            state._fsp--;

            stream_subatom.add(subatom55.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign990);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign992);
            expr56=expr();

            state._fsp--;

            stream_expr.add(expr56.getTree());

            // AST REWRITE
            // elements: expr, subatom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ATNTree)adaptor.nil();
            // 105:35: -> ^( ASSIGN[$eq,\":=\"] subatom expr )
            {
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:105:38: ^( ASSIGN[$eq,\":=\"] subatom expr )
                {
                ATNTree root_1 = (ATNTree)adaptor.nil();
                root_1 = (ATNTree)adaptor.becomeRoot(
                (ATNTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, stream_subatom.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:109:1: ite_stmt : IF ^ '(' ! expr ')' ! instructions ( ELSE ! instructions )? ;
    public final ATNParser.ite_stmt_return ite_stmt() throws RecognitionException {
        ATNParser.ite_stmt_return retval = new ATNParser.ite_stmt_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token IF57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token ELSE62=null;
        ATNParser.expr_return expr59 =null;

        ATNParser.instructions_return instructions61 =null;

        ATNParser.instructions_return instructions63 =null;


        ATNTree IF57_tree=null;
        ATNTree char_literal58_tree=null;
        ATNTree char_literal60_tree=null;
        ATNTree ELSE62_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:109:13: ( IF ^ '(' ! expr ')' ! instructions ( ELSE ! instructions )? )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:109:17: IF ^ '(' ! expr ')' ! instructions ( ELSE ! instructions )?
            {
            root_0 = (ATNTree)adaptor.nil();


            IF57=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt1034); 
            IF57_tree = 
            (ATNTree)adaptor.create(IF57)
            ;
            root_0 = (ATNTree)adaptor.becomeRoot(IF57_tree, root_0);


            char_literal58=(Token)match(input,59,FOLLOW_59_in_ite_stmt1037); 

            pushFollow(FOLLOW_expr_in_ite_stmt1040);
            expr59=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr59.getTree());

            char_literal60=(Token)match(input,60,FOLLOW_60_in_ite_stmt1042); 

            pushFollow(FOLLOW_instructions_in_ite_stmt1045);
            instructions61=instructions();

            state._fsp--;

            adaptor.addChild(root_0, instructions61.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:110:17: ( ELSE ! instructions )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:110:18: ELSE ! instructions
                    {
                    ELSE62=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt1064); 

                    pushFollow(FOLLOW_instructions_in_ite_stmt1067);
                    instructions63=instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, instructions63.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:114:1: while_stmt : WHILE ^ '(' ! expr ')' ! instructions ;
    public final ATNParser.while_stmt_return while_stmt() throws RecognitionException {
        ATNParser.while_stmt_return retval = new ATNParser.while_stmt_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token WHILE64=null;
        Token char_literal65=null;
        Token char_literal67=null;
        ATNParser.expr_return expr66 =null;

        ATNParser.instructions_return instructions68 =null;


        ATNTree WHILE64_tree=null;
        ATNTree char_literal65_tree=null;
        ATNTree char_literal67_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:114:13: ( WHILE ^ '(' ! expr ')' ! instructions )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:114:17: WHILE ^ '(' ! expr ')' ! instructions
            {
            root_0 = (ATNTree)adaptor.nil();


            WHILE64=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1095); 
            WHILE64_tree = 
            (ATNTree)adaptor.create(WHILE64)
            ;
            root_0 = (ATNTree)adaptor.becomeRoot(WHILE64_tree, root_0);


            char_literal65=(Token)match(input,59,FOLLOW_59_in_while_stmt1098); 

            pushFollow(FOLLOW_expr_in_while_stmt1101);
            expr66=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr66.getTree());

            char_literal67=(Token)match(input,60,FOLLOW_60_in_while_stmt1103); 

            pushFollow(FOLLOW_instructions_in_while_stmt1106);
            instructions68=instructions();

            state._fsp--;

            adaptor.addChild(root_0, instructions68.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class for_stmt_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:118:1: for_stmt : FOR ^ '(' ! assign ';' ! expr ';' ! assign ')' ! instructions ;
    public final ATNParser.for_stmt_return for_stmt() throws RecognitionException {
        ATNParser.for_stmt_return retval = new ATNParser.for_stmt_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token FOR69=null;
        Token char_literal70=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal76=null;
        ATNParser.assign_return assign71 =null;

        ATNParser.expr_return expr73 =null;

        ATNParser.assign_return assign75 =null;

        ATNParser.instructions_return instructions77 =null;


        ATNTree FOR69_tree=null;
        ATNTree char_literal70_tree=null;
        ATNTree char_literal72_tree=null;
        ATNTree char_literal74_tree=null;
        ATNTree char_literal76_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:118:13: ( FOR ^ '(' ! assign ';' ! expr ';' ! assign ')' ! instructions )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:118:17: FOR ^ '(' ! assign ';' ! expr ';' ! assign ')' ! instructions
            {
            root_0 = (ATNTree)adaptor.nil();


            FOR69=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1145); 
            FOR69_tree = 
            (ATNTree)adaptor.create(FOR69)
            ;
            root_0 = (ATNTree)adaptor.becomeRoot(FOR69_tree, root_0);


            char_literal70=(Token)match(input,59,FOLLOW_59_in_for_stmt1148); 

            pushFollow(FOLLOW_assign_in_for_stmt1151);
            assign71=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign71.getTree());

            char_literal72=(Token)match(input,63,FOLLOW_63_in_for_stmt1153); 

            pushFollow(FOLLOW_expr_in_for_stmt1156);
            expr73=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr73.getTree());

            char_literal74=(Token)match(input,63,FOLLOW_63_in_for_stmt1158); 

            pushFollow(FOLLOW_assign_in_for_stmt1161);
            assign75=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign75.getTree());

            char_literal76=(Token)match(input,60,FOLLOW_60_in_for_stmt1163); 

            pushFollow(FOLLOW_instructions_in_for_stmt1166);
            instructions77=instructions();

            state._fsp--;

            adaptor.addChild(root_0, instructions77.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:122:1: return_stmt : RETURN ^ ( expr )? ;
    public final ATNParser.return_stmt_return return_stmt() throws RecognitionException {
        ATNParser.return_stmt_return retval = new ATNParser.return_stmt_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token RETURN78=null;
        ATNParser.expr_return expr79 =null;


        ATNTree RETURN78_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:122:13: ( RETURN ^ ( expr )? )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:122:17: RETURN ^ ( expr )?
            {
            root_0 = (ATNTree)adaptor.nil();


            RETURN78=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1190); 
            RETURN78_tree = 
            (ATNTree)adaptor.create(RETURN78)
            ;
            root_0 = (ATNTree)adaptor.becomeRoot(RETURN78_tree, root_0);


            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:122:25: ( expr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==FALSE||LA12_0==ID||LA12_0==INT||LA12_0==MINUS||LA12_0==NOT||LA12_0==PLUS||LA12_0==TRUE||(LA12_0 >= 53 && LA12_0 <= 57)||LA12_0==59) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:122:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt1193);
                    expr79=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr79.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class print_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:126:1: print : PRINT ^ ( expr | STRING ) ;
    public final ATNParser.print_return print() throws RecognitionException {
        ATNParser.print_return retval = new ATNParser.print_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token PRINT80=null;
        Token STRING82=null;
        ATNParser.expr_return expr81 =null;


        ATNTree PRINT80_tree=null;
        ATNTree STRING82_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:126:9: ( PRINT ^ ( expr | STRING ) )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:126:13: PRINT ^ ( expr | STRING )
            {
            root_0 = (ATNTree)adaptor.nil();


            PRINT80=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1236); 
            PRINT80_tree = 
            (ATNTree)adaptor.create(PRINT80)
            ;
            root_0 = (ATNTree)adaptor.becomeRoot(PRINT80_tree, root_0);


            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:126:20: ( expr | STRING )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FALSE||LA13_0==ID||LA13_0==INT||LA13_0==MINUS||LA13_0==NOT||LA13_0==PLUS||LA13_0==TRUE||(LA13_0 >= 53 && LA13_0 <= 57)||LA13_0==59) ) {
                alt13=1;
            }
            else if ( (LA13_0==STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:126:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_print1240);
                    expr81=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr81.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:126:28: STRING
                    {
                    STRING82=(Token)match(input,STRING,FOLLOW_STRING_in_print1244); 
                    STRING82_tree = 
                    (ATNTree)adaptor.create(STRING82)
                    ;
                    adaptor.addChild(root_0, STRING82_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print"


    public static class jump_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:130:1: jump : JUMP ^ ID ;
    public final ATNParser.jump_return jump() throws RecognitionException {
        ATNParser.jump_return retval = new ATNParser.jump_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token JUMP83=null;
        Token ID84=null;

        ATNTree JUMP83_tree=null;
        ATNTree ID84_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:130:9: ( JUMP ^ ID )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:130:13: JUMP ^ ID
            {
            root_0 = (ATNTree)adaptor.nil();


            JUMP83=(Token)match(input,JUMP,FOLLOW_JUMP_in_jump1269); 
            JUMP83_tree = 
            (ATNTree)adaptor.create(JUMP83)
            ;
            root_0 = (ATNTree)adaptor.becomeRoot(JUMP83_tree, root_0);


            ID84=(Token)match(input,ID,FOLLOW_ID_in_jump1272); 
            ID84_tree = 
            (ATNTree)adaptor.create(ID84)
            ;
            adaptor.addChild(root_0, ID84_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "jump"


    public static class expr_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:134:1: expr : boolterm ( OR ^ boolterm )* ;
    public final ATNParser.expr_return expr() throws RecognitionException {
        ATNParser.expr_return retval = new ATNParser.expr_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token OR86=null;
        ATNParser.boolterm_return boolterm85 =null;

        ATNParser.boolterm_return boolterm87 =null;


        ATNTree OR86_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:134:9: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:134:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1303);
            boolterm85=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm85.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:134:22: ( OR ^ boolterm )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:134:23: OR ^ boolterm
            	    {
            	    OR86=(Token)match(input,OR,FOLLOW_OR_in_expr1306); 
            	    OR86_tree = 
            	    (ATNTree)adaptor.create(OR86)
            	    ;
            	    root_0 = (ATNTree)adaptor.becomeRoot(OR86_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1309);
            	    boolterm87=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm87.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:137:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final ATNParser.boolterm_return boolterm() throws RecognitionException {
        ATNParser.boolterm_return retval = new ATNParser.boolterm_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token AND89=null;
        ATNParser.boolfact_return boolfact88 =null;

        ATNParser.boolfact_return boolfact90 =null;


        ATNTree AND89_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:137:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:137:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1329);
            boolfact88=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact88.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:137:22: ( AND ^ boolfact )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:137:23: AND ^ boolfact
            	    {
            	    AND89=(Token)match(input,AND,FOLLOW_AND_in_boolterm1332); 
            	    AND89_tree = 
            	    (ATNTree)adaptor.create(AND89)
            	    ;
            	    root_0 = (ATNTree)adaptor.becomeRoot(AND89_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1335);
            	    boolfact90=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact90.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final ATNParser.boolfact_return boolfact() throws RecognitionException {
        ATNParser.boolfact_return retval = new ATNParser.boolfact_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token EQUAL92=null;
        Token NOT_EQUAL93=null;
        Token LT94=null;
        Token LE95=null;
        Token GT96=null;
        Token GE97=null;
        ATNParser.num_expr_return num_expr91 =null;

        ATNParser.num_expr_return num_expr98 =null;


        ATNTree EQUAL92_tree=null;
        ATNTree NOT_EQUAL93_tree=null;
        ATNTree LT94_tree=null;
        ATNTree LE95_tree=null;
        ATNTree GT96_tree=null;
        ATNTree GE97_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1355);
            num_expr91=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr91.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EQUAL||(LA17_0 >= GE && LA17_0 <= GT)||LA17_0==LE||LA17_0==LT||LA17_0==NOT_EQUAL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt16=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt16=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt16=2;
                        }
                        break;
                    case LT:
                        {
                        alt16=3;
                        }
                        break;
                    case LE:
                        {
                        alt16=4;
                        }
                        break;
                    case GT:
                        {
                        alt16=5;
                        }
                        break;
                    case GE:
                        {
                        alt16=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }

                    switch (alt16) {
                        case 1 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:24: EQUAL ^
                            {
                            EQUAL92=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1359); 
                            EQUAL92_tree = 
                            (ATNTree)adaptor.create(EQUAL92)
                            ;
                            root_0 = (ATNTree)adaptor.becomeRoot(EQUAL92_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL93=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1364); 
                            NOT_EQUAL93_tree = 
                            (ATNTree)adaptor.create(NOT_EQUAL93)
                            ;
                            root_0 = (ATNTree)adaptor.becomeRoot(NOT_EQUAL93_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:46: LT ^
                            {
                            LT94=(Token)match(input,LT,FOLLOW_LT_in_boolfact1369); 
                            LT94_tree = 
                            (ATNTree)adaptor.create(LT94)
                            ;
                            root_0 = (ATNTree)adaptor.becomeRoot(LT94_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:52: LE ^
                            {
                            LE95=(Token)match(input,LE,FOLLOW_LE_in_boolfact1374); 
                            LE95_tree = 
                            (ATNTree)adaptor.create(LE95)
                            ;
                            root_0 = (ATNTree)adaptor.becomeRoot(LE95_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:58: GT ^
                            {
                            GT96=(Token)match(input,GT,FOLLOW_GT_in_boolfact1379); 
                            GT96_tree = 
                            (ATNTree)adaptor.create(GT96)
                            ;
                            root_0 = (ATNTree)adaptor.becomeRoot(GT96_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:140:64: GE ^
                            {
                            GE97=(Token)match(input,GE,FOLLOW_GE_in_boolfact1384); 
                            GE97_tree = 
                            (ATNTree)adaptor.create(GE97)
                            ;
                            root_0 = (ATNTree)adaptor.becomeRoot(GE97_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1388);
                    num_expr98=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr98.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:143:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final ATNParser.num_expr_return num_expr() throws RecognitionException {
        ATNParser.num_expr_return retval = new ATNParser.num_expr_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token PLUS100=null;
        Token MINUS101=null;
        ATNParser.term_return term99 =null;

        ATNParser.term_return term102 =null;


        ATNTree PLUS100_tree=null;
        ATNTree MINUS101_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:143:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:143:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1408);
            term99=term();

            state._fsp--;

            adaptor.addChild(root_0, term99.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:143:18: ( ( PLUS ^| MINUS ^) term )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==MINUS||LA19_0==PLUS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:143:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:143:20: ( PLUS ^| MINUS ^)
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==PLUS) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==MINUS) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:143:21: PLUS ^
            	            {
            	            PLUS100=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1413); 
            	            PLUS100_tree = 
            	            (ATNTree)adaptor.create(PLUS100)
            	            ;
            	            root_0 = (ATNTree)adaptor.becomeRoot(PLUS100_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:143:29: MINUS ^
            	            {
            	            MINUS101=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1418); 
            	            MINUS101_tree = 
            	            (ATNTree)adaptor.create(MINUS101)
            	            ;
            	            root_0 = (ATNTree)adaptor.becomeRoot(MINUS101_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1422);
            	    term102=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term102.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:146:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final ATNParser.term_return term() throws RecognitionException {
        ATNParser.term_return retval = new ATNParser.term_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token MUL104=null;
        Token DIV105=null;
        Token MOD106=null;
        ATNParser.factor_return factor103 =null;

        ATNParser.factor_return factor107 =null;


        ATNTree MUL104_tree=null;
        ATNTree DIV105_tree=null;
        ATNTree MOD106_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:146:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:146:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1446);
            factor103=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor103.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:146:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==DIV||(LA21_0 >= MOD && LA21_0 <= MUL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:146:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:146:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:146:23: MUL ^
            	            {
            	            MUL104=(Token)match(input,MUL,FOLLOW_MUL_in_term1451); 
            	            MUL104_tree = 
            	            (ATNTree)adaptor.create(MUL104)
            	            ;
            	            root_0 = (ATNTree)adaptor.becomeRoot(MUL104_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:146:30: DIV ^
            	            {
            	            DIV105=(Token)match(input,DIV,FOLLOW_DIV_in_term1456); 
            	            DIV105_tree = 
            	            (ATNTree)adaptor.create(DIV105)
            	            ;
            	            root_0 = (ATNTree)adaptor.becomeRoot(DIV105_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:146:37: MOD ^
            	            {
            	            MOD106=(Token)match(input,MOD,FOLLOW_MOD_in_term1461); 
            	            MOD106_tree = 
            	            (ATNTree)adaptor.create(MOD106)
            	            ;
            	            root_0 = (ATNTree)adaptor.becomeRoot(MOD106_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1465);
            	    factor107=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor107.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:149:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final ATNParser.factor_return factor() throws RecognitionException {
        ATNParser.factor_return retval = new ATNParser.factor_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token NOT108=null;
        Token PLUS109=null;
        Token MINUS110=null;
        ATNParser.atom_return atom111 =null;


        ATNTree NOT108_tree=null;
        ATNTree PLUS109_tree=null;
        ATNTree MINUS110_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:149:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:149:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (ATNTree)adaptor.nil();


            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:149:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt22=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt22=1;
                    }
                    break;
                case PLUS:
                    {
                    alt22=2;
                    }
                    break;
                case MINUS:
                    {
                    alt22=3;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:149:14: NOT ^
                    {
                    NOT108=(Token)match(input,NOT,FOLLOW_NOT_in_factor1488); 
                    NOT108_tree = 
                    (ATNTree)adaptor.create(NOT108)
                    ;
                    root_0 = (ATNTree)adaptor.becomeRoot(NOT108_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:149:21: PLUS ^
                    {
                    PLUS109=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1493); 
                    PLUS109_tree = 
                    (ATNTree)adaptor.create(PLUS109)
                    ;
                    root_0 = (ATNTree)adaptor.becomeRoot(PLUS109_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:149:29: MINUS ^
                    {
                    MINUS110=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1498); 
                    MINUS110_tree = 
                    (ATNTree)adaptor.create(MINUS110)
                    ;
                    root_0 = (ATNTree)adaptor.becomeRoot(MINUS110_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1503);
            atom111=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom111.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:155:1: atom : ( subatom | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| '#.code' -> HASHCODE | '#.base' -> HASHBASE | '#.text' -> HASHBASE | '#.forward()' -> HASHFORWARD | '#.end()' -> HASHEND );
    public final ATNParser.atom_return atom() throws RecognitionException {
        ATNParser.atom_return retval = new ATNParser.atom_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token b=null;
        Token INT113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        Token string_literal118=null;
        Token string_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        Token string_literal122=null;
        ATNParser.subatom_return subatom112 =null;

        ATNParser.funcall_return funcall114 =null;

        ATNParser.expr_return expr116 =null;


        ATNTree b_tree=null;
        ATNTree INT113_tree=null;
        ATNTree char_literal115_tree=null;
        ATNTree char_literal117_tree=null;
        ATNTree string_literal118_tree=null;
        ATNTree string_literal119_tree=null;
        ATNTree string_literal120_tree=null;
        ATNTree string_literal121_tree=null;
        ATNTree string_literal122_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:155:9: ( subatom | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| '#.code' -> HASHCODE | '#.base' -> HASHBASE | '#.text' -> HASHBASE | '#.forward()' -> HASHFORWARD | '#.end()' -> HASHEND )
            int alt24=10;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==AND||LA24_1==BRACKET||LA24_1==DIV||LA24_1==EQUAL||(LA24_1 >= GE && LA24_1 <= GT)||LA24_1==LE||(LA24_1 >= LT && LA24_1 <= MUL)||(LA24_1 >= NOT_EQUAL && LA24_1 <= OR)||LA24_1==PLUS||(LA24_1 >= 60 && LA24_1 <= 64)) ) {
                    alt24=1;
                }
                else if ( (LA24_1==59) ) {
                    alt24=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt24=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt24=3;
                }
                break;
            case 59:
                {
                alt24=5;
                }
                break;
            case 54:
                {
                alt24=6;
                }
                break;
            case 53:
                {
                alt24=7;
                }
                break;
            case 57:
                {
                alt24=8;
                }
                break;
            case 56:
                {
                alt24=9;
                }
                break;
            case 55:
                {
                alt24=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:155:13: subatom
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_subatom_in_atom1528);
                    subatom112=subatom();

                    state._fsp--;

                    adaptor.addChild(root_0, subatom112.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:156:13: INT
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    INT113=(Token)match(input,INT,FOLLOW_INT_in_atom1543); 
                    INT113_tree = 
                    (ATNTree)adaptor.create(INT113)
                    ;
                    adaptor.addChild(root_0, INT113_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:157:13: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:157:13: (b= TRUE |b= FALSE )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==TRUE) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==FALSE) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }
                    switch (alt23) {
                        case 1 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:157:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1560);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:157:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1566);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 157:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:157:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        ATNTree root_1 = (ATNTree)adaptor.nil();
                        root_1 = (ATNTree)adaptor.becomeRoot(
                        (ATNTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:158:13: funcall
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1589);
                    funcall114=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall114.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:159:13: '(' ! expr ')' !
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    char_literal115=(Token)match(input,59,FOLLOW_59_in_atom1603); 

                    pushFollow(FOLLOW_expr_in_atom1606);
                    expr116=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr116.getTree());

                    char_literal117=(Token)match(input,60,FOLLOW_60_in_atom1608); 

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:160:13: '#.code'
                    {
                    string_literal118=(Token)match(input,54,FOLLOW_54_in_atom1623);  
                    stream_54.add(string_literal118);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 160:22: -> HASHCODE
                    {
                        adaptor.addChild(root_0, 
                        (ATNTree)adaptor.create(HASHCODE, "HASHCODE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:161:13: '#.base'
                    {
                    string_literal119=(Token)match(input,53,FOLLOW_53_in_atom1641);  
                    stream_53.add(string_literal119);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 161:22: -> HASHBASE
                    {
                        adaptor.addChild(root_0, 
                        (ATNTree)adaptor.create(HASHBASE, "HASHBASE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:162:13: '#.text'
                    {
                    string_literal120=(Token)match(input,57,FOLLOW_57_in_atom1659);  
                    stream_57.add(string_literal120);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 162:22: -> HASHBASE
                    {
                        adaptor.addChild(root_0, 
                        (ATNTree)adaptor.create(HASHBASE, "HASHBASE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:163:13: '#.forward()'
                    {
                    string_literal121=(Token)match(input,56,FOLLOW_56_in_atom1677);  
                    stream_56.add(string_literal121);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 163:27: -> HASHFORWARD
                    {
                        adaptor.addChild(root_0, 
                        (ATNTree)adaptor.create(HASHFORWARD, "HASHFORWARD")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 10 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:164:13: '#.end()'
                    {
                    string_literal122=(Token)match(input,55,FOLLOW_55_in_atom1695);  
                    stream_55.add(string_literal122);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 164:23: -> HASHEND
                    {
                        adaptor.addChild(root_0, 
                        (ATNTree)adaptor.create(HASHEND, "HASHEND")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class subatom_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subatom"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:167:1: subatom : ( ID ( BRACKET ^ expr ']' !)? | ID '.length' -> ^( ARRAYLENGTH ID ) );
    public final ATNParser.subatom_return subatom() throws RecognitionException {
        ATNParser.subatom_return retval = new ATNParser.subatom_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token ID123=null;
        Token BRACKET124=null;
        Token char_literal126=null;
        Token ID127=null;
        Token string_literal128=null;
        ATNParser.expr_return expr125 =null;


        ATNTree ID123_tree=null;
        ATNTree BRACKET124_tree=null;
        ATNTree char_literal126_tree=null;
        ATNTree ID127_tree=null;
        ATNTree string_literal128_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:167:9: ( ID ( BRACKET ^ expr ']' !)? | ID '.length' -> ^( ARRAYLENGTH ID ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==62) ) {
                    alt26=2;
                }
                else if ( (LA26_1==AND||LA26_1==BRACKET||LA26_1==DIV||LA26_1==EQUAL||(LA26_1 >= GE && LA26_1 <= GT)||LA26_1==LE||(LA26_1 >= LT && LA26_1 <= MUL)||(LA26_1 >= NOT_EQUAL && LA26_1 <= OR)||LA26_1==PLUS||(LA26_1 >= 60 && LA26_1 <= 61)||(LA26_1 >= 63 && LA26_1 <= 64)) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:167:13: ID ( BRACKET ^ expr ']' !)?
                    {
                    root_0 = (ATNTree)adaptor.nil();


                    ID123=(Token)match(input,ID,FOLLOW_ID_in_subatom1718); 
                    ID123_tree = 
                    (ATNTree)adaptor.create(ID123)
                    ;
                    adaptor.addChild(root_0, ID123_tree);


                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:167:16: ( BRACKET ^ expr ']' !)?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==BRACKET) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:167:17: BRACKET ^ expr ']' !
                            {
                            BRACKET124=(Token)match(input,BRACKET,FOLLOW_BRACKET_in_subatom1721); 
                            BRACKET124_tree = 
                            (ATNTree)adaptor.create(BRACKET124)
                            ;
                            root_0 = (ATNTree)adaptor.becomeRoot(BRACKET124_tree, root_0);


                            pushFollow(FOLLOW_expr_in_subatom1724);
                            expr125=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr125.getTree());

                            char_literal126=(Token)match(input,64,FOLLOW_64_in_subatom1726); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:168:6: ID '.length'
                    {
                    ID127=(Token)match(input,ID,FOLLOW_ID_in_subatom1736);  
                    stream_ID.add(ID127);


                    string_literal128=(Token)match(input,62,FOLLOW_62_in_subatom1738);  
                    stream_62.add(string_literal128);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ATNTree)adaptor.nil();
                    // 168:19: -> ^( ARRAYLENGTH ID )
                    {
                        // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:168:22: ^( ARRAYLENGTH ID )
                        {
                        ATNTree root_1 = (ATNTree)adaptor.nil();
                        root_1 = (ATNTree)adaptor.becomeRoot(
                        (ATNTree)adaptor.create(ARRAYLENGTH, "ARRAYLENGTH")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subatom"


    public static class funcall_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:172:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final ATNParser.funcall_return funcall() throws RecognitionException {
        ATNParser.funcall_return retval = new ATNParser.funcall_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token ID129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        ATNParser.expr_list_return expr_list131 =null;


        ATNTree ID129_tree=null;
        ATNTree char_literal130_tree=null;
        ATNTree char_literal132_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:172:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:172:13: ID '(' ( expr_list )? ')'
            {
            ID129=(Token)match(input,ID,FOLLOW_ID_in_funcall1774);  
            stream_ID.add(ID129);


            char_literal130=(Token)match(input,59,FOLLOW_59_in_funcall1776);  
            stream_59.add(char_literal130);


            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:172:20: ( expr_list )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==FALSE||LA27_0==ID||LA27_0==INT||LA27_0==MINUS||LA27_0==NOT||LA27_0==PLUS||LA27_0==TRUE||(LA27_0 >= 53 && LA27_0 <= 57)||LA27_0==59) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:172:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1778);
                    expr_list131=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list131.getTree());

                    }
                    break;

            }


            char_literal132=(Token)match(input,60,FOLLOW_60_in_funcall1781);  
            stream_60.add(char_literal132);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ATNTree)adaptor.nil();
            // 172:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:172:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                ATNTree root_1 = (ATNTree)adaptor.nil();
                root_1 = (ATNTree)adaptor.becomeRoot(
                (ATNTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:172:51: ^( ARGLIST ( expr_list )? )
                {
                ATNTree root_2 = (ATNTree)adaptor.nil();
                root_2 = (ATNTree)adaptor.becomeRoot(
                (ATNTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:172:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        ATNTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:176:1: expr_list : expr ( ',' ! expr )* ;
    public final ATNParser.expr_list_return expr_list() throws RecognitionException {
        ATNParser.expr_list_return retval = new ATNParser.expr_list_return();
        retval.start = input.LT(1);


        ATNTree root_0 = null;

        Token char_literal134=null;
        ATNParser.expr_return expr133 =null;

        ATNParser.expr_return expr135 =null;


        ATNTree char_literal134_tree=null;

        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:176:10: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:176:13: expr ( ',' ! expr )*
            {
            root_0 = (ATNTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1814);
            expr133=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr133.getTree());

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:176:18: ( ',' ! expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==61) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:176:19: ',' ! expr
            	    {
            	    char_literal134=(Token)match(input,61,FOLLOW_61_in_expr_list1817); 

            	    pushFollow(FOLLOW_expr_in_expr_list1820);
            	    expr135=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr135.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ATNTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ATNTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_utilities_in_prog223 = new BitSet(new long[]{0x0000000010002200L});
    public static final BitSet FOLLOW_EOF_in_prog226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_utilities263 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_utilities266 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_params_in_utilities268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_utilities270 = new BitSet(new long[]{0x80092000B0080000L});
    public static final BitSet FOLLOW_block_instructions_in_utilities273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_utilities275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATN_in_utilities292 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_utilities295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_utilities297 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_node_list_in_utilities300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_utilities302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_utilities319 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_utilities321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_utilities329 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_utilities331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_list355 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_node_in_node_list358 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_NODE_in_node400 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_node403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_node405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_arc_list_in_node408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_node410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arc_in_arc_list435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_arc_in_arc_list438 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ARC_in_arc469 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_arc472 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_expr_in_arc474 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_arc476 = new BitSet(new long[]{0x80092000B0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_in_arc479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_params508 = new BitSet(new long[]{0x1400000010000000L});
    public static final BitSet FOLLOW_paramlist_in_params510 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_params513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist539 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_paramlist542 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_param_in_paramlist545 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_58_in_param570 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_param574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inst_comma_in_instructions630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_instructions651 = new BitSet(new long[]{0x80092000B0080000L});
    public static final BitSet FOLLOW_block_instructions_in_instructions654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_instructions656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inst_comma_in_block_instructions684 = new BitSet(new long[]{0x80092000B0080002L});
    public static final BitSet FOLLOW_inst_comma_in_block_instructions687 = new BitSet(new long[]{0x80092000B0080002L});
    public static final BitSet FOLLOW_instruction_in_inst_comma736 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_inst_comma738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_in_instruction897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subatom_in_assign986 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUAL_in_assign990 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_expr_in_assign992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt1034 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ite_stmt1037 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt1040 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ite_stmt1042 = new BitSet(new long[]{0x80092000B0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_in_ite_stmt1045 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt1064 = new BitSet(new long[]{0x80092000B0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_in_ite_stmt1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1095 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_while_stmt1098 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_expr_in_while_stmt1101 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_while_stmt1103 = new BitSet(new long[]{0x80092000B0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_in_while_stmt1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1145 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_for_stmt1148 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_assign_in_for_stmt1151 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_for_stmt1153 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1156 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_for_stmt1158 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_assign_in_for_stmt1161 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_stmt1163 = new BitSet(new long[]{0x80092000B0080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_in_for_stmt1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1190 = new BitSet(new long[]{0x0BE4088850040002L});
    public static final BitSet FOLLOW_expr_in_return_stmt1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print1236 = new BitSet(new long[]{0x0BE6088850040000L});
    public static final BitSet FOLLOW_expr_in_print1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_print1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_jump1269 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_jump1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1303 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_OR_in_expr1306 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_boolterm_in_expr1309 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1329 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1332 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1335 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1355 = new BitSet(new long[]{0x0000010500610002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1359 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1364 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_LT_in_boolfact1369 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_LE_in_boolfact1374 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_GT_in_boolfact1379 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_GE_in_boolfact1384 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1408 = new BitSet(new long[]{0x0000080800000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1413 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1418 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_term_in_num_expr1422 = new BitSet(new long[]{0x0000080800000002L});
    public static final BitSet FOLLOW_factor_in_term1446 = new BitSet(new long[]{0x0000003000004002L});
    public static final BitSet FOLLOW_MUL_in_term1451 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_DIV_in_term1456 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_MOD_in_term1461 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_factor_in_term1465 = new BitSet(new long[]{0x0000003000004002L});
    public static final BitSet FOLLOW_NOT_in_factor1488 = new BitSet(new long[]{0x0BE4000050040000L});
    public static final BitSet FOLLOW_PLUS_in_factor1493 = new BitSet(new long[]{0x0BE4000050040000L});
    public static final BitSet FOLLOW_MINUS_in_factor1498 = new BitSet(new long[]{0x0BE4000050040000L});
    public static final BitSet FOLLOW_atom_in_factor1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subatom_in_atom1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_atom1603 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_expr_in_atom1606 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_atom1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_atom1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atom1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_atom1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_atom1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atom1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_subatom1718 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_BRACKET_in_subatom1721 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_expr_in_subatom1724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_subatom1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_subatom1736 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_subatom1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1774 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_funcall1776 = new BitSet(new long[]{0x1BE4088850040000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1778 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_funcall1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1814 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_expr_list1817 = new BitSet(new long[]{0x0BE4088850040000L});
    public static final BitSet FOLLOW_expr_in_expr_list1820 = new BitSet(new long[]{0x2000000000000002L});

}