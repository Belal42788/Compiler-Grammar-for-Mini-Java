// $ANTLR 3.4 C:\\ANTLR\\The Final Project\\MiniJava.g 2024-05-14 09:34:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int ArrayAssignment=4;
    public static final int Assignment=5;
    public static final int Boolean=6;
    public static final int ClassDeclaration=7;
    public static final int DOUBLE=8;
    public static final int DoubleNum=9;
    public static final int Factor=10;
    public static final int Flase=11;
    public static final int GeneralArithExpr=12;
    public static final int Goal=13;
    public static final int ID=14;
    public static final int INT=15;
    public static final int Identifier=16;
    public static final int If=17;
    public static final int Int=18;
    public static final int IntArray=19;
    public static final int IntNum=20;
    public static final int ML_COMMENT=21;
    public static final int MainClass=22;
    public static final int MethodDeclaration=23;
    public static final int NNew=24;
    public static final int New=25;
    public static final int Not=26;
    public static final int Pracet=27;
    public static final int Print=28;
    public static final int ProgramEntry=29;
    public static final int SL_COMMENT=30;
    public static final int Start=31;
    public static final int Stmt=32;
    public static final int Term=33;
    public static final int This=34;
    public static final int True=35;
    public static final int VarDeclaration=36;
    public static final int WS=37;
    public static final int While=38;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MiniJavaLexer() {} 
    public MiniJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\ANTLR\\The Final Project\\MiniJava.g"; }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:2:7: ( '!' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:3:7: ( '&&' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:3:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:4:7: ( '(' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:4:9: '('
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:5:7: ( ')' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:5:9: ')'
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:6:7: ( '*' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:6:9: '*'
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:7:7: ( '+' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:7:9: '+'
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:8:7: ( ',' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:8:9: ','
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:9:7: ( '-' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:9:9: '-'
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:10:7: ( '.' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:10:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:11:7: ( ';' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:11:9: ';'
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:12:7: ( '<' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:12:9: '<'
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:13:7: ( '=' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:13:9: '='
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:14:7: ( 'String' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:14:9: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:15:7: ( 'System.out.println' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:15:9: 'System.out.println'
            {
            match("System.out.println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:16:7: ( '[' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:16:9: '['
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:17:7: ( ']' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:17:9: ']'
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:18:7: ( 'boolean' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:18:9: 'boolean'
            {
            match("boolean"); 



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
            // C:\\ANTLR\\The Final Project\\MiniJava.g:19:7: ( 'class' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:19:9: 'class'
            {
            match("class"); 



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
            // C:\\ANTLR\\The Final Project\\MiniJava.g:20:7: ( 'else' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:20:9: 'else'
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:21:7: ( 'extends' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:21:9: 'extends'
            {
            match("extends"); 



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
            // C:\\ANTLR\\The Final Project\\MiniJava.g:22:7: ( 'false' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:22:9: 'false'
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:23:7: ( 'if' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:23:9: 'if'
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:24:7: ( 'int' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:24:9: 'int'
            {
            match("int"); 



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
            // C:\\ANTLR\\The Final Project\\MiniJava.g:25:7: ( 'main' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:25:9: 'main'
            {
            match("main"); 



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
            // C:\\ANTLR\\The Final Project\\MiniJava.g:26:7: ( 'new' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:26:9: 'new'
            {
            match("new"); 



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
            // C:\\ANTLR\\The Final Project\\MiniJava.g:27:7: ( 'public' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:27:9: 'public'
            {
            match("public"); 



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
            // C:\\ANTLR\\The Final Project\\MiniJava.g:28:7: ( 'return' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:28:9: 'return'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:29:7: ( 'static' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:29:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:30:7: ( 'this' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:30:9: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:31:7: ( 'true' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:31:9: 'true'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:32:7: ( 'void' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:32:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:33:7: ( 'while' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:33:9: 'while'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:34:7: ( '{' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:34:9: '{'
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:35:7: ( '}' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:35:9: '}'
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
    // $ANTLR end "T__72"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:155:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:155:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\ANTLR\\The Final Project\\MiniJava.g:155:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:
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
    // $ANTLR end "Identifier"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:156:5: ( ( '0' .. '9' )+ )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:156:8: ( '0' .. '9' )+
            {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:156:8: ( '0' .. '9' )+
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
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:
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

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:157:8: ( INT '.' INT )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:157:10: INT '.' INT
            {
            mINT(); 


            match('.'); 

            mINT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:158:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:158:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:164:12: ( '/*' ( options {greedy=false; } : . )* ( '*/' )+ )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:164:14: '/*' ( options {greedy=false; } : . )* ( '*/' )+
            {
            match("/*"); 



            // C:\\ANTLR\\The Final Project\\MiniJava.g:164:19: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:164:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:164:51: ( '*/' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:164:51: '*/'
            	    {
            	    match("*/"); 



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


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\ANTLR\\The Final Project\\MiniJava.g:165:12: ( '//' ( . )* ( '\\n' )+ )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:165:14: '//' ( . )* ( '\\n' )+
            {
            match("//"); 



            // C:\\ANTLR\\The Final Project\\MiniJava.g:165:19: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\n') ) {
                    alt5=2;
                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:165:20: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:165:23: ( '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:165:23: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\ANTLR\\The Final Project\\MiniJava.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | Identifier | INT | DOUBLE | WS | ML_COMMENT | SL_COMMENT )
        int alt7=40;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:10: T__39
                {
                mT__39(); 


                }
                break;
            case 2 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:16: T__40
                {
                mT__40(); 


                }
                break;
            case 3 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:22: T__41
                {
                mT__41(); 


                }
                break;
            case 4 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:28: T__42
                {
                mT__42(); 


                }
                break;
            case 5 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:34: T__43
                {
                mT__43(); 


                }
                break;
            case 6 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:40: T__44
                {
                mT__44(); 


                }
                break;
            case 7 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:46: T__45
                {
                mT__45(); 


                }
                break;
            case 8 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:52: T__46
                {
                mT__46(); 


                }
                break;
            case 9 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:58: T__47
                {
                mT__47(); 


                }
                break;
            case 10 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:64: T__48
                {
                mT__48(); 


                }
                break;
            case 11 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:70: T__49
                {
                mT__49(); 


                }
                break;
            case 12 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:76: T__50
                {
                mT__50(); 


                }
                break;
            case 13 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:82: T__51
                {
                mT__51(); 


                }
                break;
            case 14 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:88: T__52
                {
                mT__52(); 


                }
                break;
            case 15 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:94: T__53
                {
                mT__53(); 


                }
                break;
            case 16 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:100: T__54
                {
                mT__54(); 


                }
                break;
            case 17 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:106: T__55
                {
                mT__55(); 


                }
                break;
            case 18 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:112: T__56
                {
                mT__56(); 


                }
                break;
            case 19 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:118: T__57
                {
                mT__57(); 


                }
                break;
            case 20 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:124: T__58
                {
                mT__58(); 


                }
                break;
            case 21 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:130: T__59
                {
                mT__59(); 


                }
                break;
            case 22 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:136: T__60
                {
                mT__60(); 


                }
                break;
            case 23 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:142: T__61
                {
                mT__61(); 


                }
                break;
            case 24 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:148: T__62
                {
                mT__62(); 


                }
                break;
            case 25 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:154: T__63
                {
                mT__63(); 


                }
                break;
            case 26 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:160: T__64
                {
                mT__64(); 


                }
                break;
            case 27 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:166: T__65
                {
                mT__65(); 


                }
                break;
            case 28 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:172: T__66
                {
                mT__66(); 


                }
                break;
            case 29 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:178: T__67
                {
                mT__67(); 


                }
                break;
            case 30 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:184: T__68
                {
                mT__68(); 


                }
                break;
            case 31 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:190: T__69
                {
                mT__69(); 


                }
                break;
            case 32 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:196: T__70
                {
                mT__70(); 


                }
                break;
            case 33 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:202: T__71
                {
                mT__71(); 


                }
                break;
            case 34 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:208: T__72
                {
                mT__72(); 


                }
                break;
            case 35 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:214: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 36 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:225: INT
                {
                mINT(); 


                }
                break;
            case 37 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:229: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 38 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:236: WS
                {
                mWS(); 


                }
                break;
            case 39 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:239: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 40 :
                // C:\\ANTLR\\The Final Project\\MiniJava.g:1:250: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\15\uffff\1\37\2\uffff\15\37\3\uffff\1\65\2\uffff\7\37\1\100\12"+
        "\37\4\uffff\7\37\1\uffff\1\122\1\37\1\124\13\37\1\140\2\37\1\uffff"+
        "\1\143\1\uffff\3\37\1\147\1\150\1\151\4\37\1\156\1\uffff\1\37\1"+
        "\160\1\uffff\3\37\3\uffff\1\164\1\165\2\37\1\uffff\1\37\1\uffff"+
        "\1\171\1\172\1\173\3\uffff\1\174\1\175\5\uffff";
    static final String DFA7_eofS =
        "\176\uffff";
    static final String DFA7_minS =
        "\1\11\14\uffff\1\164\2\uffff\1\157\2\154\1\141\1\146\1\141\1\145"+
        "\1\165\1\145\1\164\1\150\1\157\1\150\3\uffff\1\56\1\uffff\1\52\1"+
        "\162\1\163\1\157\1\141\1\163\1\164\1\154\1\60\1\164\1\151\1\167"+
        "\1\142\1\164\1\141\1\151\1\165\2\151\4\uffff\1\151\1\164\1\154\1"+
        "\163\2\145\1\163\1\uffff\1\60\1\156\1\60\1\154\1\165\1\164\1\163"+
        "\1\145\1\144\1\154\1\156\2\145\1\163\1\60\1\156\1\145\1\uffff\1"+
        "\60\1\uffff\1\151\1\162\1\151\3\60\1\145\1\147\1\155\1\141\1\60"+
        "\1\uffff\1\144\1\60\1\uffff\1\143\1\156\1\143\3\uffff\2\60\1\56"+
        "\1\156\1\uffff\1\163\1\uffff\3\60\3\uffff\2\60\5\uffff";
    static final String DFA7_maxS =
        "\1\175\14\uffff\1\171\2\uffff\1\157\1\154\1\170\1\141\1\156\1\141"+
        "\1\145\1\165\1\145\1\164\1\162\1\157\1\150\3\uffff\1\71\1\uffff"+
        "\1\57\1\162\1\163\1\157\1\141\1\163\1\164\1\154\1\172\1\164\1\151"+
        "\1\167\1\142\1\164\1\141\1\151\1\165\2\151\4\uffff\1\151\1\164\1"+
        "\154\1\163\2\145\1\163\1\uffff\1\172\1\156\1\172\1\154\1\165\1\164"+
        "\1\163\1\145\1\144\1\154\1\156\2\145\1\163\1\172\1\156\1\145\1\uffff"+
        "\1\172\1\uffff\1\151\1\162\1\151\3\172\1\145\1\147\1\155\1\141\1"+
        "\172\1\uffff\1\144\1\172\1\uffff\1\143\1\156\1\143\3\uffff\2\172"+
        "\1\56\1\156\1\uffff\1\163\1\uffff\3\172\3\uffff\2\172\5\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\uffff\1\17\1\20\15\uffff\1\41\1\42\1\43\1\uffff\1\46\23\uffff\1"+
        "\44\1\45\1\47\1\50\7\uffff\1\26\21\uffff\1\27\1\uffff\1\31\13\uffff"+
        "\1\23\2\uffff\1\30\3\uffff\1\35\1\36\1\37\4\uffff\1\22\1\uffff\1"+
        "\25\3\uffff\1\40\1\15\1\16\2\uffff\1\32\1\33\1\34\1\21\1\24";
    static final String DFA7_specialS =
        "\176\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\1\1\4\uffff\1\2\1\uffff\1\3"+
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\42\12\40\1\uffff\1\12\1\13\1\14"+
            "\3\uffff\22\37\1\15\7\37\1\16\1\uffff\1\17\1\uffff\1\37\1\uffff"+
            "\1\37\1\20\1\21\1\37\1\22\1\23\2\37\1\24\3\37\1\25\1\26\1\37"+
            "\1\27\1\37\1\30\1\31\1\32\1\37\1\33\1\34\3\37\1\35\1\uffff\1"+
            "\36",
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
            "\1\43\4\uffff\1\44",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47\13\uffff\1\50",
            "\1\51",
            "\1\52\7\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61\11\uffff\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "\1\66\1\uffff\12\40",
            "",
            "\1\67\4\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\123",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\141",
            "\1\142",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\157",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | Identifier | INT | DOUBLE | WS | ML_COMMENT | SL_COMMENT );";
        }
    }
 

}