// $ANTLR 3.4 /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g 2015-04-10 17:55:37

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ATNLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ATNLexer() {} 
    public ATNLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ATNLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g"; }

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:6:7: ( '#.base' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:6:9: '#.base'
            {
            match("#.base"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:7:7: ( '#.code' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:7:9: '#.code'
            {
            match("#.code"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:8:7: ( '#.end()' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:8:9: '#.end()'
            {
            match("#.end()"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:9:7: ( '#.forward()' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:9:9: '#.forward()'
            {
            match("#.forward()"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:10:7: ( '#.text' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:10:9: '#.text'
            {
            match("#.text"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:11:7: ( '&' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:11:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:12:7: ( '(' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:13:7: ( ')' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:14:7: ( ',' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:15:7: ( '.length' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:15:9: '.length'
            {
            match(".length"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:16:7: ( ';' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:17:7: ( ']' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:17:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:18:7: ( '{' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:19:7: ( '}' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "BRACKET"
    public final void mBRACKET() throws RecognitionException {
        try {
            int _type = BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:180:9: ( '[' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:180:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BRACKET"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:181:9: ( '=' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:181:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:182:10: ( '!=' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:182:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:183:9: ( '<' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:183:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:184:9: ( '<=' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:184:11: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:185:9: ( '>' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:185:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:186:9: ( '>=' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:186:11: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:187:9: ( '+' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:187:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:188:9: ( '-' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:188:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:189:9: ( '*' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:189:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:190:9: ( '/' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:190:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:191:9: ( '%' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:191:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:192:9: ( 'not' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:192:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:193:9: ( 'and' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:193:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:194:9: ( 'or' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:194:11: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:195:9: ( 'if' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:195:11: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:196:9: ( 'else' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:196:11: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:197:9: ( 'while' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:197:11: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:198:9: ( 'for' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:198:11: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "NODE"
    public final void mNODE() throws RecognitionException {
        try {
            int _type = NODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:199:9: ( 'node' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:199:11: 'node'
            {
            match("node"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODE"

    // $ANTLR start "ARC"
    public final void mARC() throws RecognitionException {
        try {
            int _type = ARC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:200:9: ( 'arc' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:200:11: 'arc'
            {
            match("arc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARC"

    // $ANTLR start "ATN"
    public final void mATN() throws RecognitionException {
        try {
            int _type = ATN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:201:9: ( 'atn' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:201:11: 'atn'
            {
            match("atn"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATN"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:202:9: ( 'def' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:202:11: 'def'
            {
            match("def"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:203:9: ( 'return' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:203:11: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:204:9: ( 'print' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:204:11: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "JUMP"
    public final void mJUMP() throws RecognitionException {
        try {
            int _type = JUMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:205:9: ( 'goto' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:205:11: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JUMP"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:206:9: ( 'true' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:206:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:207:9: ( 'false' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:207:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:208:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:208:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:208:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:209:9: ( ( '0' .. '9' )+ )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:209:13: ( '0' .. '9' )+
            {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:209:13: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:212:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:212:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:212:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:212:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:212:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:213:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:213:16: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:213:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:217:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:217:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:217:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:217:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:217:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:223:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:223:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:226:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:226:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:8: ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | BRACKET | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | NODE | ARC | ATN | DEF | RETURN | PRINT | JUMP | TRUE | FALSE | ID | INT | COMMENT | STRING | WS )
        int alt8=47;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:10: T__53
                {
                mT__53(); 


                }
                break;
            case 2 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:16: T__54
                {
                mT__54(); 


                }
                break;
            case 3 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:22: T__55
                {
                mT__55(); 


                }
                break;
            case 4 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:28: T__56
                {
                mT__56(); 


                }
                break;
            case 5 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:34: T__57
                {
                mT__57(); 


                }
                break;
            case 6 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:40: T__58
                {
                mT__58(); 


                }
                break;
            case 7 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:46: T__59
                {
                mT__59(); 


                }
                break;
            case 8 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:52: T__60
                {
                mT__60(); 


                }
                break;
            case 9 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:58: T__61
                {
                mT__61(); 


                }
                break;
            case 10 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:64: T__62
                {
                mT__62(); 


                }
                break;
            case 11 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:70: T__63
                {
                mT__63(); 


                }
                break;
            case 12 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:76: T__64
                {
                mT__64(); 


                }
                break;
            case 13 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:82: T__65
                {
                mT__65(); 


                }
                break;
            case 14 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:88: T__66
                {
                mT__66(); 


                }
                break;
            case 15 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:94: BRACKET
                {
                mBRACKET(); 


                }
                break;
            case 16 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:102: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 17 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:108: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 18 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:118: LT
                {
                mLT(); 


                }
                break;
            case 19 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:121: LE
                {
                mLE(); 


                }
                break;
            case 20 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:124: GT
                {
                mGT(); 


                }
                break;
            case 21 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:127: GE
                {
                mGE(); 


                }
                break;
            case 22 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:130: PLUS
                {
                mPLUS(); 


                }
                break;
            case 23 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:135: MINUS
                {
                mMINUS(); 


                }
                break;
            case 24 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:141: MUL
                {
                mMUL(); 


                }
                break;
            case 25 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:145: DIV
                {
                mDIV(); 


                }
                break;
            case 26 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:149: MOD
                {
                mMOD(); 


                }
                break;
            case 27 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:153: NOT
                {
                mNOT(); 


                }
                break;
            case 28 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:157: AND
                {
                mAND(); 


                }
                break;
            case 29 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:161: OR
                {
                mOR(); 


                }
                break;
            case 30 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:164: IF
                {
                mIF(); 


                }
                break;
            case 31 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:167: ELSE
                {
                mELSE(); 


                }
                break;
            case 32 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:172: WHILE
                {
                mWHILE(); 


                }
                break;
            case 33 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:178: FOR
                {
                mFOR(); 


                }
                break;
            case 34 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:182: NODE
                {
                mNODE(); 


                }
                break;
            case 35 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:187: ARC
                {
                mARC(); 


                }
                break;
            case 36 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:191: ATN
                {
                mATN(); 


                }
                break;
            case 37 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:195: DEF
                {
                mDEF(); 


                }
                break;
            case 38 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:199: RETURN
                {
                mRETURN(); 


                }
                break;
            case 39 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:206: PRINT
                {
                mPRINT(); 


                }
                break;
            case 40 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:212: JUMP
                {
                mJUMP(); 


                }
                break;
            case 41 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:217: TRUE
                {
                mTRUE(); 


                }
                break;
            case 42 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:222: FALSE
                {
                mFALSE(); 


                }
                break;
            case 43 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:228: ID
                {
                mID(); 


                }
                break;
            case 44 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:231: INT
                {
                mINT(); 


                }
                break;
            case 45 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:235: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 46 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:243: STRING
                {
                mSTRING(); 


                }
                break;
            case 47 :
                // /home2/users/alumnes/1171575/dades/linux/CL/atnlang/source/src/parser/ATN.g:1:250: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\16\uffff\1\47\1\51\3\uffff\1\53\1\uffff\14\41\13\uffff\4\41\1\105"+
        "\1\106\11\41\5\uffff\1\120\1\41\1\122\1\123\1\124\2\uffff\2\41\1"+
        "\127\1\41\1\131\4\41\1\uffff\1\136\3\uffff\1\137\1\41\1\uffff\1"+
        "\41\1\uffff\2\41\1\144\1\145\2\uffff\1\146\1\147\1\41\1\151\4\uffff"+
        "\1\152\2\uffff";
    static final String DFA8_eofS =
        "\153\uffff";
    static final String DFA8_minS =
        "\1\11\1\56\14\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156\1\162"+
        "\1\146\1\154\1\150\1\141\2\145\1\162\1\157\1\162\4\uffff\1\142\6"+
        "\uffff\2\144\1\143\1\156\2\60\1\163\1\151\1\162\1\154\1\146\1\164"+
        "\1\151\1\164\1\165\5\uffff\1\60\1\145\3\60\2\uffff\1\145\1\154\1"+
        "\60\1\163\1\60\1\165\1\156\1\157\1\145\1\uffff\1\60\3\uffff\1\60"+
        "\1\145\1\uffff\1\145\1\uffff\1\162\1\164\2\60\2\uffff\2\60\1\156"+
        "\1\60\4\uffff\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\175\1\56\14\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\164\1\162"+
        "\1\146\1\154\1\150\1\157\2\145\1\162\1\157\1\162\4\uffff\1\164\6"+
        "\uffff\1\164\1\144\1\143\1\156\2\172\1\163\1\151\1\162\1\154\1\146"+
        "\1\164\1\151\1\164\1\165\5\uffff\1\172\1\145\3\172\2\uffff\1\145"+
        "\1\154\1\172\1\163\1\172\1\165\1\156\1\157\1\145\1\uffff\1\172\3"+
        "\uffff\1\172\1\145\1\uffff\1\145\1\uffff\1\162\1\164\2\172\2\uffff"+
        "\2\172\1\156\1\172\4\uffff\1\172\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1"+
        "\21\2\uffff\1\26\1\27\1\30\1\uffff\1\32\14\uffff\1\53\1\54\1\56"+
        "\1\57\1\uffff\1\23\1\22\1\25\1\24\1\55\1\31\17\uffff\1\1\1\2\1\3"+
        "\1\4\1\5\5\uffff\1\35\1\36\11\uffff\1\33\1\uffff\1\34\1\43\1\44"+
        "\2\uffff\1\41\1\uffff\1\45\4\uffff\1\42\1\37\4\uffff\1\50\1\51\1"+
        "\40\1\52\1\uffff\1\47\1\46";
    static final String DFA8_specialS =
        "\153\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\15\1\43\1\1\1\uffff\1\24"+
            "\1\2\1\uffff\1\3\1\4\1\22\1\20\1\5\1\21\1\6\1\23\12\42\1\uffff"+
            "\1\7\1\16\1\14\1\17\2\uffff\32\41\1\13\1\uffff\1\10\1\uffff"+
            "\1\41\1\uffff\1\26\2\41\1\34\1\31\1\33\1\37\1\41\1\30\4\41\1"+
            "\25\1\27\1\36\1\41\1\35\1\41\1\40\2\41\1\32\3\41\1\11\1\uffff"+
            "\1\12",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\50",
            "",
            "",
            "",
            "\1\52\4\uffff\1\52",
            "",
            "\1\54",
            "\1\55\3\uffff\1\56\1\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65\15\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "",
            "\1\73\1\74\1\uffff\1\75\1\76\15\uffff\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101\17\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\121",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\125",
            "\1\126",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\130",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\140",
            "",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\150",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | BRACKET | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | NODE | ARC | ATN | DEF | RETURN | PRINT | JUMP | TRUE | FALSE | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}