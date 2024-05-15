// $ANTLR 3.4 C:\\ANTLR\\The Final Project\\MiniJava.g 2024-05-14 09:34:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ArrayAssignment", "Assignment", "Boolean", "ClassDeclaration", "DOUBLE", "DoubleNum", "Factor", "Flase", "GeneralArithExpr", "Goal", "ID", "INT", "Identifier", "If", "Int", "IntArray", "IntNum", "ML_COMMENT", "MainClass", "MethodDeclaration", "NNew", "New", "Not", "Pracet", "Print", "ProgramEntry", "SL_COMMENT", "Start", "Stmt", "Term", "This", "True", "VarDeclaration", "WS", "While", "'!'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "';'", "'<'", "'='", "'String'", "'System.out.println'", "'['", "']'", "'boolean'", "'class'", "'else'", "'extends'", "'false'", "'if'", "'int'", "'main'", "'new'", "'public'", "'return'", "'static'", "'this'", "'true'", "'void'", "'while'", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MiniJavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\ANTLR\\The Final Project\\MiniJava.g"; }


    String s="";


    public static class programEntry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programEntry"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:40:1: programEntry : ( goal ) -> ^( Start goal ) ;
    public final MiniJavaParser.programEntry_return programEntry() throws RecognitionException {
        MiniJavaParser.programEntry_return retval = new MiniJavaParser.programEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.goal_return goal1 =null;


        RewriteRuleSubtreeStream stream_goal=new RewriteRuleSubtreeStream(adaptor,"rule goal");
        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:40:13: ( ( goal ) -> ^( Start goal ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:40:15: ( goal )
            {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:40:15: ( goal )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:40:16: goal
            {
            pushFollow(FOLLOW_goal_in_programEntry115);
            goal1=goal();

            state._fsp--;

            stream_goal.add(goal1.getTree());

            }


            // AST REWRITE
            // elements: goal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 40:22: -> ^( Start goal )
            {
                // C:\\ANTLR\\The Final Project\\MiniJava.g:40:24: ^( Start goal )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                adaptor.addChild(root_1, stream_goal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "programEntry"


    public static class goal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "goal"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:50:1: goal : ( ( classDeclaration )* mainClass ( classDeclaration )* ) -> ^( Goal ( classDeclaration )* mainClass ( classDeclaration )* ) ;
    public final MiniJavaParser.goal_return goal() throws RecognitionException {
        MiniJavaParser.goal_return retval = new MiniJavaParser.goal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.classDeclaration_return classDeclaration2 =null;

        MiniJavaParser.mainClass_return mainClass3 =null;

        MiniJavaParser.classDeclaration_return classDeclaration4 =null;


        RewriteRuleSubtreeStream stream_mainClass=new RewriteRuleSubtreeStream(adaptor,"rule mainClass");
        RewriteRuleSubtreeStream stream_classDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule classDeclaration");
        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:50:13: ( ( ( classDeclaration )* mainClass ( classDeclaration )* ) -> ^( Goal ( classDeclaration )* mainClass ( classDeclaration )* ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:50:17: ( ( classDeclaration )* mainClass ( classDeclaration )* )
            {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:50:17: ( ( classDeclaration )* mainClass ( classDeclaration )* )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:50:18: ( classDeclaration )* mainClass ( classDeclaration )*
            {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:50:18: ( classDeclaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==56) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==Identifier) ) {
                        int LA1_2 = input.LA(3);

                        if ( (LA1_2==71) ) {
                            int LA1_3 = input.LA(4);

                            if ( (LA1_3==64) ) {
                                int LA1_5 = input.LA(5);

                                if ( (LA1_5==Identifier||LA1_5==55||LA1_5==61) ) {
                                    alt1=1;
                                }


                            }
                            else if ( (LA1_3==Identifier||LA1_3==55||LA1_3==61||LA1_3==72) ) {
                                alt1=1;
                            }


                        }
                        else if ( (LA1_2==58) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:50:18: classDeclaration
            	    {
            	    pushFollow(FOLLOW_classDeclaration_in_goal168);
            	    classDeclaration2=classDeclaration();

            	    state._fsp--;

            	    stream_classDeclaration.add(classDeclaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_mainClass_in_goal171);
            mainClass3=mainClass();

            state._fsp--;

            stream_mainClass.add(mainClass3.getTree());

            // C:\\ANTLR\\The Final Project\\MiniJava.g:50:47: ( classDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==56) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:50:47: classDeclaration
            	    {
            	    pushFollow(FOLLOW_classDeclaration_in_goal174);
            	    classDeclaration4=classDeclaration();

            	    state._fsp--;

            	    stream_classDeclaration.add(classDeclaration4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: mainClass, classDeclaration, classDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:66: -> ^( Goal ( classDeclaration )* mainClass ( classDeclaration )* )
            {
                // C:\\ANTLR\\The Final Project\\MiniJava.g:50:68: ^( Goal ( classDeclaration )* mainClass ( classDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Goal, "Goal")
                , root_1);

                // C:\\ANTLR\\The Final Project\\MiniJava.g:50:75: ( classDeclaration )*
                while ( stream_classDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDeclaration.nextTree());

                }
                stream_classDeclaration.reset();

                adaptor.addChild(root_1, stream_mainClass.nextTree());

                // C:\\ANTLR\\The Final Project\\MiniJava.g:50:104: ( classDeclaration )*
                while ( stream_classDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDeclaration.nextTree());

                }
                stream_classDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "goal"


    public static class mainClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mainClass"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:56:1: mainClass : ( 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' ) -> ^( MainClass 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' ) ;
    public final MiniJavaParser.mainClass_return mainClass() throws RecognitionException {
        MiniJavaParser.mainClass_return retval = new MiniJavaParser.mainClass_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal5=null;
        Token Identifier6=null;
        Token char_literal7=null;
        Token string_literal8=null;
        Token string_literal9=null;
        Token string_literal10=null;
        Token string_literal11=null;
        Token char_literal12=null;
        Token string_literal13=null;
        Token char_literal14=null;
        Token char_literal15=null;
        Token Identifier16=null;
        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Token char_literal21=null;
        MiniJavaParser.statement_return statement19 =null;


        Object string_literal5_tree=null;
        Object Identifier6_tree=null;
        Object char_literal7_tree=null;
        Object string_literal8_tree=null;
        Object string_literal9_tree=null;
        Object string_literal10_tree=null;
        Object string_literal11_tree=null;
        Object char_literal12_tree=null;
        Object string_literal13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal15_tree=null;
        Object Identifier16_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:56:13: ( ( 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' ) -> ^( MainClass 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:57:3: ( 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' )
            {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:57:3: ( 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:57:4: 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}'
            {
            string_literal5=(Token)match(input,56,FOLLOW_56_in_mainClass222);  
            stream_56.add(string_literal5);


            Identifier6=(Token)match(input,Identifier,FOLLOW_Identifier_in_mainClass224);  
            stream_Identifier.add(Identifier6);


            char_literal7=(Token)match(input,71,FOLLOW_71_in_mainClass226);  
            stream_71.add(char_literal7);


            string_literal8=(Token)match(input,64,FOLLOW_64_in_mainClass228);  
            stream_64.add(string_literal8);


            string_literal9=(Token)match(input,66,FOLLOW_66_in_mainClass230);  
            stream_66.add(string_literal9);


            string_literal10=(Token)match(input,69,FOLLOW_69_in_mainClass232);  
            stream_69.add(string_literal10);


            string_literal11=(Token)match(input,62,FOLLOW_62_in_mainClass234);  
            stream_62.add(string_literal11);


            char_literal12=(Token)match(input,41,FOLLOW_41_in_mainClass236);  
            stream_41.add(char_literal12);


            string_literal13=(Token)match(input,51,FOLLOW_51_in_mainClass238);  
            stream_51.add(string_literal13);


            char_literal14=(Token)match(input,53,FOLLOW_53_in_mainClass240);  
            stream_53.add(char_literal14);


            char_literal15=(Token)match(input,54,FOLLOW_54_in_mainClass242);  
            stream_54.add(char_literal15);


            Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_mainClass244);  
            stream_Identifier.add(Identifier16);


            char_literal17=(Token)match(input,42,FOLLOW_42_in_mainClass246);  
            stream_42.add(char_literal17);


            char_literal18=(Token)match(input,71,FOLLOW_71_in_mainClass248);  
            stream_71.add(char_literal18);


            pushFollow(FOLLOW_statement_in_mainClass250);
            statement19=statement();

            state._fsp--;

            stream_statement.add(statement19.getTree());

            char_literal20=(Token)match(input,72,FOLLOW_72_in_mainClass252);  
            stream_72.add(char_literal20);


            char_literal21=(Token)match(input,72,FOLLOW_72_in_mainClass254);  
            stream_72.add(char_literal21);


            }


            // AST REWRITE
            // elements: Identifier, 64, 66, 56, 71, 51, 53, 69, 54, statement, Identifier, 72, 71, 72, 42, 41, 62
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:3: -> ^( MainClass 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' )
            {
                // C:\\ANTLR\\The Final Project\\MiniJava.g:58:5: ^( MainClass 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MainClass, "MainClass")
                , root_1);

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_71.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_64.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_66.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_62.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_41.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_51.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_53.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_54.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_42.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_71.nextNode()
                );

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_1, 
                stream_72.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_72.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mainClass"


    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDeclaration"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:65:1: classDeclaration : ( 'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}' ) -> ^( ClassDeclaration 'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}' ) ;
    public final MiniJavaParser.classDeclaration_return classDeclaration() throws RecognitionException {
        MiniJavaParser.classDeclaration_return retval = new MiniJavaParser.classDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal22=null;
        Token Identifier23=null;
        Token string_literal24=null;
        Token Identifier25=null;
        Token char_literal26=null;
        Token char_literal29=null;
        MiniJavaParser.varDeclaration_return varDeclaration27 =null;

        MiniJavaParser.methodDeclaration_return methodDeclaration28 =null;


        Object string_literal22_tree=null;
        Object Identifier23_tree=null;
        Object string_literal24_tree=null;
        Object Identifier25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal29_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_methodDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule methodDeclaration");
        RewriteRuleSubtreeStream stream_varDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule varDeclaration");
        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:65:21: ( ( 'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}' ) -> ^( ClassDeclaration 'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}' ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:66:4: ( 'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}' )
            {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:66:4: ( 'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:66:5: 'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}'
            {
            string_literal22=(Token)match(input,56,FOLLOW_56_in_classDeclaration333);  
            stream_56.add(string_literal22);


            Identifier23=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration335);  
            stream_Identifier.add(Identifier23);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:66:24: ( 'extends' Identifier )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==58) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:66:26: 'extends' Identifier
                    {
                    string_literal24=(Token)match(input,58,FOLLOW_58_in_classDeclaration339);  
                    stream_58.add(string_literal24);


                    Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration341);  
                    stream_Identifier.add(Identifier25);


                    }
                    break;

            }


            char_literal26=(Token)match(input,71,FOLLOW_71_in_classDeclaration346);  
            stream_71.add(char_literal26);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:66:54: ( varDeclaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Identifier||LA4_0==55||LA4_0==61) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:66:56: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_classDeclaration350);
            	    varDeclaration27=varDeclaration();

            	    state._fsp--;

            	    stream_varDeclaration.add(varDeclaration27.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:66:74: ( methodDeclaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==64) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:66:76: methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_classDeclaration357);
            	    methodDeclaration28=methodDeclaration();

            	    state._fsp--;

            	    stream_methodDeclaration.add(methodDeclaration28.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            char_literal29=(Token)match(input,72,FOLLOW_72_in_classDeclaration362);  
            stream_72.add(char_literal29);


            }


            // AST REWRITE
            // elements: Identifier, 56, 72, varDeclaration, methodDeclaration, Identifier, 58, 71
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:4: -> ^( ClassDeclaration 'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}' )
            {
                // C:\\ANTLR\\The Final Project\\MiniJava.g:67:6: ^( ClassDeclaration 'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* ( methodDeclaration )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ClassDeclaration, "ClassDeclaration")
                , root_1);

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                // C:\\ANTLR\\The Final Project\\MiniJava.g:67:44: ( 'extends' Identifier )?
                if ( stream_Identifier.hasNext()||stream_58.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_58.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_Identifier.nextNode()
                    );

                }
                stream_Identifier.reset();
                stream_58.reset();

                adaptor.addChild(root_1, 
                stream_71.nextNode()
                );

                // C:\\ANTLR\\The Final Project\\MiniJava.g:67:74: ( varDeclaration )*
                while ( stream_varDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclaration.nextTree());

                }
                stream_varDeclaration.reset();

                // C:\\ANTLR\\The Final Project\\MiniJava.g:67:94: ( methodDeclaration )*
                while ( stream_methodDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodDeclaration.nextTree());

                }
                stream_methodDeclaration.reset();

                adaptor.addChild(root_1, 
                stream_72.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"


    public static class varDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclaration"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:73:1: varDeclaration : ( type Identifier ( varassign )? ';' ) -> ^( VarDeclaration type Identifier ( varassign )? ';' ) ;
    public final MiniJavaParser.varDeclaration_return varDeclaration() throws RecognitionException {
        MiniJavaParser.varDeclaration_return retval = new MiniJavaParser.varDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier31=null;
        Token char_literal33=null;
        MiniJavaParser.type_return type30 =null;

        MiniJavaParser.varassign_return varassign32 =null;


        Object Identifier31_tree=null;
        Object char_literal33_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_varassign=new RewriteRuleSubtreeStream(adaptor,"rule varassign");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:73:17: ( ( type Identifier ( varassign )? ';' ) -> ^( VarDeclaration type Identifier ( varassign )? ';' ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:73:21: ( type Identifier ( varassign )? ';' )
            {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:73:21: ( type Identifier ( varassign )? ';' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:73:22: type Identifier ( varassign )? ';'
            {
            pushFollow(FOLLOW_type_in_varDeclaration433);
            type30=type();

            state._fsp--;

            stream_type.add(type30.getTree());

            Identifier31=(Token)match(input,Identifier,FOLLOW_Identifier_in_varDeclaration435);  
            stream_Identifier.add(Identifier31);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:73:38: ( varassign )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50||LA6_0==53) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:73:38: varassign
                    {
                    pushFollow(FOLLOW_varassign_in_varDeclaration437);
                    varassign32=varassign();

                    state._fsp--;

                    stream_varassign.add(varassign32.getTree());

                    }
                    break;

            }


            char_literal33=(Token)match(input,48,FOLLOW_48_in_varDeclaration441);  
            stream_48.add(char_literal33);


            }


            // AST REWRITE
            // elements: 48, type, varassign, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:4: -> ^( VarDeclaration type Identifier ( varassign )? ';' )
            {
                // C:\\ANTLR\\The Final Project\\MiniJava.g:74:6: ^( VarDeclaration type Identifier ( varassign )? ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VarDeclaration, "VarDeclaration")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                // C:\\ANTLR\\The Final Project\\MiniJava.g:74:39: ( varassign )?
                if ( stream_varassign.hasNext() ) {
                    adaptor.addChild(root_1, stream_varassign.nextTree());

                }
                stream_varassign.reset();

                adaptor.addChild(root_1, 
                stream_48.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"


    public static class varassign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varassign"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:79:1: varassign : ( ( '=' expression ) -> ^( Assignment Identifier '=' expression ) | ( '[' expression ']' '=' expression ) -> ^( ArrayAssignment Identifier '[' expression ']' '=' expression ) );
    public final MiniJavaParser.varassign_return varassign() throws RecognitionException {
        MiniJavaParser.varassign_return retval = new MiniJavaParser.varassign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token char_literal39=null;
        MiniJavaParser.expression_return expression35 =null;

        MiniJavaParser.expression_return expression37 =null;

        MiniJavaParser.expression_return expression40 =null;


        Object char_literal34_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:79:11: ( ( '=' expression ) -> ^( Assignment Identifier '=' expression ) | ( '[' expression ']' '=' expression ) -> ^( ArrayAssignment Identifier '[' expression ']' '=' expression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==50) ) {
                alt7=1;
            }
            else if ( (LA7_0==53) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:79:16: ( '=' expression )
                    {
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:79:16: ( '=' expression )
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:79:18: '=' expression
                    {
                    char_literal34=(Token)match(input,50,FOLLOW_50_in_varassign493);  
                    stream_50.add(char_literal34);


                    pushFollow(FOLLOW_expression_in_varassign495);
                    expression35=expression();

                    state._fsp--;

                    stream_expression.add(expression35.getTree());

                    }


                    // AST REWRITE
                    // elements: expression, 50
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:35: -> ^( Assignment Identifier '=' expression )
                    {
                        // C:\\ANTLR\\The Final Project\\MiniJava.g:79:37: ^( Assignment Identifier '=' expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Assignment, "Assignment")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(Identifier, "Identifier")
                        );

                        adaptor.addChild(root_1, 
                        stream_50.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:80:15: ( '[' expression ']' '=' expression )
                    {
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:80:15: ( '[' expression ']' '=' expression )
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:80:16: '[' expression ']' '=' expression
                    {
                    char_literal36=(Token)match(input,53,FOLLOW_53_in_varassign526);  
                    stream_53.add(char_literal36);


                    pushFollow(FOLLOW_expression_in_varassign528);
                    expression37=expression();

                    state._fsp--;

                    stream_expression.add(expression37.getTree());

                    char_literal38=(Token)match(input,54,FOLLOW_54_in_varassign530);  
                    stream_54.add(char_literal38);


                    char_literal39=(Token)match(input,50,FOLLOW_50_in_varassign532);  
                    stream_50.add(char_literal39);


                    pushFollow(FOLLOW_expression_in_varassign534);
                    expression40=expression();

                    state._fsp--;

                    stream_expression.add(expression40.getTree());

                    }


                    // AST REWRITE
                    // elements: expression, 50, 53, expression, 54
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:52: -> ^( ArrayAssignment Identifier '[' expression ']' '=' expression )
                    {
                        // C:\\ANTLR\\The Final Project\\MiniJava.g:80:54: ^( ArrayAssignment Identifier '[' expression ']' '=' expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ArrayAssignment, "ArrayAssignment")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(Identifier, "Identifier")
                        );

                        adaptor.addChild(root_1, 
                        stream_53.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_54.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_50.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varassign"


    public static class methodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDeclaration"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:85:1: methodDeclaration : ( 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' ) -> ^( MethodDeclaration 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' ) ;
    public final MiniJavaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        MiniJavaParser.methodDeclaration_return retval = new MiniJavaParser.methodDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal41=null;
        Token Identifier43=null;
        Token char_literal44=null;
        Token Identifier46=null;
        Token char_literal47=null;
        Token Identifier49=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Token string_literal54=null;
        Token char_literal56=null;
        Token char_literal57=null;
        MiniJavaParser.type_return type42 =null;

        MiniJavaParser.type_return type45 =null;

        MiniJavaParser.type_return type48 =null;

        MiniJavaParser.varDeclaration_return varDeclaration52 =null;

        MiniJavaParser.statement_return statement53 =null;

        MiniJavaParser.expression_return expression55 =null;


        Object string_literal41_tree=null;
        Object Identifier43_tree=null;
        Object char_literal44_tree=null;
        Object Identifier46_tree=null;
        Object char_literal47_tree=null;
        Object Identifier49_tree=null;
        Object char_literal50_tree=null;
        Object char_literal51_tree=null;
        Object string_literal54_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_varDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule varDeclaration");
        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:85:21: ( ( 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' ) -> ^( MethodDeclaration 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:85:25: ( 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' )
            {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:85:25: ( 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:85:26: 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}'
            {
            string_literal41=(Token)match(input,64,FOLLOW_64_in_methodDeclaration584);  
            stream_64.add(string_literal41);


            pushFollow(FOLLOW_type_in_methodDeclaration586);
            type42=type();

            state._fsp--;

            stream_type.add(type42.getTree());

            Identifier43=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration588);  
            stream_Identifier.add(Identifier43);


            char_literal44=(Token)match(input,41,FOLLOW_41_in_methodDeclaration590);  
            stream_41.add(char_literal44);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:85:55: ( type Identifier ( ',' type Identifier )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Identifier||LA9_0==55||LA9_0==61) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:85:57: type Identifier ( ',' type Identifier )*
                    {
                    pushFollow(FOLLOW_type_in_methodDeclaration594);
                    type45=type();

                    state._fsp--;

                    stream_type.add(type45.getTree());

                    Identifier46=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration596);  
                    stream_Identifier.add(Identifier46);


                    // C:\\ANTLR\\The Final Project\\MiniJava.g:85:73: ( ',' type Identifier )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==45) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\ANTLR\\The Final Project\\MiniJava.g:85:75: ',' type Identifier
                    	    {
                    	    char_literal47=(Token)match(input,45,FOLLOW_45_in_methodDeclaration600);  
                    	    stream_45.add(char_literal47);


                    	    pushFollow(FOLLOW_type_in_methodDeclaration602);
                    	    type48=type();

                    	    state._fsp--;

                    	    stream_type.add(type48.getTree());

                    	    Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration604);  
                    	    stream_Identifier.add(Identifier49);


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal50=(Token)match(input,42,FOLLOW_42_in_methodDeclaration612);  
            stream_42.add(char_literal50);


            char_literal51=(Token)match(input,71,FOLLOW_71_in_methodDeclaration614);  
            stream_71.add(char_literal51);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:85:109: ( varDeclaration )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Identifier) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==Identifier) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==55||LA10_0==61) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:85:111: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_methodDeclaration618);
            	    varDeclaration52=varDeclaration();

            	    state._fsp--;

            	    stream_varDeclaration.add(varDeclaration52.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:85:129: ( statement )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Identifier||LA11_0==52||LA11_0==60||(LA11_0 >= 70 && LA11_0 <= 71)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:85:131: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_methodDeclaration625);
            	    statement53=statement();

            	    state._fsp--;

            	    stream_statement.add(statement53.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            string_literal54=(Token)match(input,65,FOLLOW_65_in_methodDeclaration630);  
            stream_65.add(string_literal54);


            pushFollow(FOLLOW_expression_in_methodDeclaration632);
            expression55=expression();

            state._fsp--;

            stream_expression.add(expression55.getTree());

            char_literal56=(Token)match(input,48,FOLLOW_48_in_methodDeclaration634);  
            stream_48.add(char_literal56);


            char_literal57=(Token)match(input,72,FOLLOW_72_in_methodDeclaration636);  
            stream_72.add(char_literal57);


            }


            // AST REWRITE
            // elements: 64, Identifier, type, 41, 42, type, Identifier, varDeclaration, 65, 71, type, 72, statement, expression, Identifier, 48, 45
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:4: -> ^( MethodDeclaration 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' )
            {
                // C:\\ANTLR\\The Final Project\\MiniJava.g:86:6: ^( MethodDeclaration 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MethodDeclaration, "MethodDeclaration")
                , root_1);

                adaptor.addChild(root_1, 
                stream_64.nextNode()
                );

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_41.nextNode()
                );

                // C:\\ANTLR\\The Final Project\\MiniJava.g:86:55: ( type Identifier ( ',' type Identifier )* )?
                if ( stream_Identifier.hasNext()||stream_Identifier.hasNext()||stream_type.hasNext()||stream_type.hasNext()||stream_45.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_1, 
                    stream_Identifier.nextNode()
                    );

                    // C:\\ANTLR\\The Final Project\\MiniJava.g:86:73: ( ',' type Identifier )*
                    while ( stream_Identifier.hasNext()||stream_type.hasNext()||stream_45.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_45.nextNode()
                        );

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, 
                        stream_Identifier.nextNode()
                        );

                    }
                    stream_Identifier.reset();
                    stream_type.reset();
                    stream_45.reset();

                }
                stream_Identifier.reset();
                stream_Identifier.reset();
                stream_type.reset();
                stream_type.reset();
                stream_45.reset();

                adaptor.addChild(root_1, 
                stream_42.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_71.nextNode()
                );

                // C:\\ANTLR\\The Final Project\\MiniJava.g:86:109: ( varDeclaration )*
                while ( stream_varDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclaration.nextTree());

                }
                stream_varDeclaration.reset();

                // C:\\ANTLR\\The Final Project\\MiniJava.g:86:129: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, 
                stream_65.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                stream_48.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_72.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:93:1: type : ( 'int' '[' ']' | 'boolean' | 'int' | Identifier ) ;
    public final MiniJavaParser.type_return type() throws RecognitionException {
        MiniJavaParser.type_return retval = new MiniJavaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token string_literal61=null;
        Token string_literal62=null;
        Token Identifier63=null;

        Object string_literal58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal60_tree=null;
        Object string_literal61_tree=null;
        Object string_literal62_tree=null;
        Object Identifier63_tree=null;

        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:93:13: ( ( 'int' '[' ']' | 'boolean' | 'int' | Identifier ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:93:17: ( 'int' '[' ']' | 'boolean' | 'int' | Identifier )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\ANTLR\\The Final Project\\MiniJava.g:93:17: ( 'int' '[' ']' | 'boolean' | 'int' | Identifier )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==53) ) {
                    alt12=1;
                }
                else if ( (LA12_1==Identifier) ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
                }
                break;
            case 55:
                {
                alt12=2;
                }
                break;
            case Identifier:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:93:18: 'int' '[' ']'
                    {
                    string_literal58=(Token)match(input,61,FOLLOW_61_in_type737); 
                    string_literal58_tree = 
                    (Object)adaptor.create(string_literal58)
                    ;
                    adaptor.addChild(root_0, string_literal58_tree);


                    char_literal59=(Token)match(input,53,FOLLOW_53_in_type739); 
                    char_literal59_tree = 
                    (Object)adaptor.create(char_literal59)
                    ;
                    adaptor.addChild(root_0, char_literal59_tree);


                    char_literal60=(Token)match(input,54,FOLLOW_54_in_type741); 
                    char_literal60_tree = 
                    (Object)adaptor.create(char_literal60)
                    ;
                    adaptor.addChild(root_0, char_literal60_tree);


                    }
                    break;
                case 2 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:94:17: 'boolean'
                    {
                    string_literal61=(Token)match(input,55,FOLLOW_55_in_type759); 
                    string_literal61_tree = 
                    (Object)adaptor.create(string_literal61)
                    ;
                    adaptor.addChild(root_0, string_literal61_tree);


                    }
                    break;
                case 3 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:95:17: 'int'
                    {
                    string_literal62=(Token)match(input,61,FOLLOW_61_in_type777); 
                    string_literal62_tree = 
                    (Object)adaptor.create(string_literal62)
                    ;
                    adaptor.addChild(root_0, string_literal62_tree);


                    }
                    break;
                case 4 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:96:17: Identifier
                    {
                    Identifier63=(Token)match(input,Identifier,FOLLOW_Identifier_in_type795); 
                    Identifier63_tree = 
                    (Object)adaptor.create(Identifier63)
                    ;
                    adaptor.addChild(root_0, Identifier63_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:103:1: statement : ( ( '{' ( statement )* '}' ) -> ^( Stmt '{' ( statement )* '}' ) | ( 'if' '(' expression ')' statement ( 'else' statement )? ) -> ^( If 'if' '(' expression ')' statement ( 'else' statement )? ) | ( 'while' '(' expression ')' statement ) -> ^( While 'while' '(' expression ')' statement ) | ( 'System.out.println' '(' expression ')' ';' ) -> ^( Print 'System.out.println' '(' expression ')' ';' ) | ( Identifier '=' expression ';' ) -> ^( Assignment Identifier '=' expression ';' ) | ( Identifier '[' expression ']' '=' expression ';' ) -> ^( ArrayAssignment Identifier '[' expression ']' '=' expression ';' ) );
    public final MiniJavaParser.statement_return statement() throws RecognitionException {
        MiniJavaParser.statement_return retval = new MiniJavaParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal64=null;
        Token char_literal66=null;
        Token string_literal67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        Token string_literal72=null;
        Token string_literal74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token string_literal79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        Token char_literal83=null;
        Token Identifier84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token Identifier88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        MiniJavaParser.statement_return statement65 =null;

        MiniJavaParser.expression_return expression69 =null;

        MiniJavaParser.statement_return statement71 =null;

        MiniJavaParser.statement_return statement73 =null;

        MiniJavaParser.expression_return expression76 =null;

        MiniJavaParser.statement_return statement78 =null;

        MiniJavaParser.expression_return expression81 =null;

        MiniJavaParser.expression_return expression86 =null;

        MiniJavaParser.expression_return expression90 =null;

        MiniJavaParser.expression_return expression93 =null;


        Object char_literal64_tree=null;
        Object char_literal66_tree=null;
        Object string_literal67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;
        Object string_literal72_tree=null;
        Object string_literal74_tree=null;
        Object char_literal75_tree=null;
        Object char_literal77_tree=null;
        Object string_literal79_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        Object Identifier84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;
        Object Identifier88_tree=null;
        Object char_literal89_tree=null;
        Object char_literal91_tree=null;
        Object char_literal92_tree=null;
        Object char_literal94_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:103:13: ( ( '{' ( statement )* '}' ) -> ^( Stmt '{' ( statement )* '}' ) | ( 'if' '(' expression ')' statement ( 'else' statement )? ) -> ^( If 'if' '(' expression ')' statement ( 'else' statement )? ) | ( 'while' '(' expression ')' statement ) -> ^( While 'while' '(' expression ')' statement ) | ( 'System.out.println' '(' expression ')' ';' ) -> ^( Print 'System.out.println' '(' expression ')' ';' ) | ( Identifier '=' expression ';' ) -> ^( Assignment Identifier '=' expression ';' ) | ( Identifier '[' expression ']' '=' expression ';' ) -> ^( ArrayAssignment Identifier '[' expression ']' '=' expression ';' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt15=1;
                }
                break;
            case 60:
                {
                alt15=2;
                }
                break;
            case 70:
                {
                alt15=3;
                }
                break;
            case 52:
                {
                alt15=4;
                }
                break;
            case Identifier:
                {
                int LA15_5 = input.LA(2);

                if ( (LA15_5==50) ) {
                    alt15=5;
                }
                else if ( (LA15_5==53) ) {
                    alt15=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:103:17: ( '{' ( statement )* '}' )
                    {
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:103:17: ( '{' ( statement )* '}' )
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:103:18: '{' ( statement )* '}'
                    {
                    char_literal64=(Token)match(input,71,FOLLOW_71_in_statement838);  
                    stream_71.add(char_literal64);


                    // C:\\ANTLR\\The Final Project\\MiniJava.g:103:22: ( statement )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Identifier||LA13_0==52||LA13_0==60||(LA13_0 >= 70 && LA13_0 <= 71)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\ANTLR\\The Final Project\\MiniJava.g:103:24: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement842);
                    	    statement65=statement();

                    	    state._fsp--;

                    	    stream_statement.add(statement65.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    char_literal66=(Token)match(input,72,FOLLOW_72_in_statement847);  
                    stream_72.add(char_literal66);


                    }


                    // AST REWRITE
                    // elements: statement, 72, 71
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:42: -> ^( Stmt '{' ( statement )* '}' )
                    {
                        // C:\\ANTLR\\The Final Project\\MiniJava.g:103:44: ^( Stmt '{' ( statement )* '}' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Stmt, "Stmt")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_71.nextNode()
                        );

                        // C:\\ANTLR\\The Final Project\\MiniJava.g:103:55: ( statement )*
                        while ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_1, 
                        stream_72.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:104:17: ( 'if' '(' expression ')' statement ( 'else' statement )? )
                    {
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:104:17: ( 'if' '(' expression ')' statement ( 'else' statement )? )
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:104:18: 'if' '(' expression ')' statement ( 'else' statement )?
                    {
                    string_literal67=(Token)match(input,60,FOLLOW_60_in_statement883);  
                    stream_60.add(string_literal67);


                    char_literal68=(Token)match(input,41,FOLLOW_41_in_statement885);  
                    stream_41.add(char_literal68);


                    pushFollow(FOLLOW_expression_in_statement887);
                    expression69=expression();

                    state._fsp--;

                    stream_expression.add(expression69.getTree());

                    char_literal70=(Token)match(input,42,FOLLOW_42_in_statement889);  
                    stream_42.add(char_literal70);


                    pushFollow(FOLLOW_statement_in_statement891);
                    statement71=statement();

                    state._fsp--;

                    stream_statement.add(statement71.getTree());

                    // C:\\ANTLR\\The Final Project\\MiniJava.g:104:53: ( 'else' statement )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==57) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\ANTLR\\The Final Project\\MiniJava.g:104:54: 'else' statement
                            {
                            string_literal72=(Token)match(input,57,FOLLOW_57_in_statement895);  
                            stream_57.add(string_literal72);


                            pushFollow(FOLLOW_statement_in_statement897);
                            statement73=statement();

                            state._fsp--;

                            stream_statement.add(statement73.getTree());

                            }
                            break;

                    }


                    }


                    // AST REWRITE
                    // elements: statement, statement, 41, 42, 57, expression, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:74: -> ^( If 'if' '(' expression ')' statement ( 'else' statement )? )
                    {
                        // C:\\ANTLR\\The Final Project\\MiniJava.g:104:76: ^( If 'if' '(' expression ')' statement ( 'else' statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(If, "If")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_60.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_41.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_42.nextNode()
                        );

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        // C:\\ANTLR\\The Final Project\\MiniJava.g:104:115: ( 'else' statement )?
                        if ( stream_statement.hasNext()||stream_57.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_57.nextNode()
                            );

                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();
                        stream_57.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:105:17: ( 'while' '(' expression ')' statement )
                    {
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:105:17: ( 'while' '(' expression ')' statement )
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:105:18: 'while' '(' expression ')' statement
                    {
                    string_literal74=(Token)match(input,70,FOLLOW_70_in_statement941);  
                    stream_70.add(string_literal74);


                    char_literal75=(Token)match(input,41,FOLLOW_41_in_statement943);  
                    stream_41.add(char_literal75);


                    pushFollow(FOLLOW_expression_in_statement945);
                    expression76=expression();

                    state._fsp--;

                    stream_expression.add(expression76.getTree());

                    char_literal77=(Token)match(input,42,FOLLOW_42_in_statement947);  
                    stream_42.add(char_literal77);


                    pushFollow(FOLLOW_statement_in_statement949);
                    statement78=statement();

                    state._fsp--;

                    stream_statement.add(statement78.getTree());

                    }


                    // AST REWRITE
                    // elements: 41, expression, 42, 70, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:56: -> ^( While 'while' '(' expression ')' statement )
                    {
                        // C:\\ANTLR\\The Final Project\\MiniJava.g:105:58: ^( While 'while' '(' expression ')' statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(While, "While")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_70.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_41.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_42.nextNode()
                        );

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:106:17: ( 'System.out.println' '(' expression ')' ';' )
                    {
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:106:17: ( 'System.out.println' '(' expression ')' ';' )
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:106:18: 'System.out.println' '(' expression ')' ';'
                    {
                    string_literal79=(Token)match(input,52,FOLLOW_52_in_statement984);  
                    stream_52.add(string_literal79);


                    char_literal80=(Token)match(input,41,FOLLOW_41_in_statement986);  
                    stream_41.add(char_literal80);


                    pushFollow(FOLLOW_expression_in_statement988);
                    expression81=expression();

                    state._fsp--;

                    stream_expression.add(expression81.getTree());

                    char_literal82=(Token)match(input,42,FOLLOW_42_in_statement990);  
                    stream_42.add(char_literal82);


                    char_literal83=(Token)match(input,48,FOLLOW_48_in_statement992);  
                    stream_48.add(char_literal83);


                    }


                    // AST REWRITE
                    // elements: 41, 48, expression, 52, 42
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:63: -> ^( Print 'System.out.println' '(' expression ')' ';' )
                    {
                        // C:\\ANTLR\\The Final Project\\MiniJava.g:106:65: ^( Print 'System.out.println' '(' expression ')' ';' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Print, "Print")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_52.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_41.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_42.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_48.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:107:17: ( Identifier '=' expression ';' )
                    {
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:107:17: ( Identifier '=' expression ';' )
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:107:18: Identifier '=' expression ';'
                    {
                    Identifier84=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement1027);  
                    stream_Identifier.add(Identifier84);


                    char_literal85=(Token)match(input,50,FOLLOW_50_in_statement1029);  
                    stream_50.add(char_literal85);


                    pushFollow(FOLLOW_expression_in_statement1031);
                    expression86=expression();

                    state._fsp--;

                    stream_expression.add(expression86.getTree());

                    char_literal87=(Token)match(input,48,FOLLOW_48_in_statement1033);  
                    stream_48.add(char_literal87);


                    }


                    // AST REWRITE
                    // elements: expression, 50, Identifier, 48
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:49: -> ^( Assignment Identifier '=' expression ';' )
                    {
                        // C:\\ANTLR\\The Final Project\\MiniJava.g:107:51: ^( Assignment Identifier '=' expression ';' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Assignment, "Assignment")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Identifier.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_50.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_48.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:108:17: ( Identifier '[' expression ']' '=' expression ';' )
                    {
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:108:17: ( Identifier '[' expression ']' '=' expression ';' )
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:108:18: Identifier '[' expression ']' '=' expression ';'
                    {
                    Identifier88=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement1066);  
                    stream_Identifier.add(Identifier88);


                    char_literal89=(Token)match(input,53,FOLLOW_53_in_statement1068);  
                    stream_53.add(char_literal89);


                    pushFollow(FOLLOW_expression_in_statement1070);
                    expression90=expression();

                    state._fsp--;

                    stream_expression.add(expression90.getTree());

                    char_literal91=(Token)match(input,54,FOLLOW_54_in_statement1072);  
                    stream_54.add(char_literal91);


                    char_literal92=(Token)match(input,50,FOLLOW_50_in_statement1074);  
                    stream_50.add(char_literal92);


                    pushFollow(FOLLOW_expression_in_statement1076);
                    expression93=expression();

                    state._fsp--;

                    stream_expression.add(expression93.getTree());

                    char_literal94=(Token)match(input,48,FOLLOW_48_in_statement1078);  
                    stream_48.add(char_literal94);


                    }


                    // AST REWRITE
                    // elements: 54, expression, expression, Identifier, 53, 48, 50
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:68: -> ^( ArrayAssignment Identifier '[' expression ']' '=' expression ';' )
                    {
                        // C:\\ANTLR\\The Final Project\\MiniJava.g:108:70: ^( ArrayAssignment Identifier '[' expression ']' '=' expression ';' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ArrayAssignment, "ArrayAssignment")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Identifier.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_53.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_54.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_50.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_48.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:116:1: expression : ( term ( ( '&&' | '<' | '+' | '-' | '*' ) ^ term )* ) ;
    public final MiniJavaParser.expression_return expression() throws RecognitionException {
        MiniJavaParser.expression_return retval = new MiniJavaParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set96=null;
        MiniJavaParser.term_return term95 =null;

        MiniJavaParser.term_return term97 =null;


        Object set96_tree=null;

        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:116:13: ( ( term ( ( '&&' | '<' | '+' | '-' | '*' ) ^ term )* ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:116:17: ( term ( ( '&&' | '<' | '+' | '-' | '*' ) ^ term )* )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\ANTLR\\The Final Project\\MiniJava.g:116:17: ( term ( ( '&&' | '<' | '+' | '-' | '*' ) ^ term )* )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:116:18: term ( ( '&&' | '<' | '+' | '-' | '*' ) ^ term )*
            {
            pushFollow(FOLLOW_term_in_expression1140);
            term95=term();

            state._fsp--;

            adaptor.addChild(root_0, term95.getTree());

            // C:\\ANTLR\\The Final Project\\MiniJava.g:116:23: ( ( '&&' | '<' | '+' | '-' | '*' ) ^ term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40||(LA16_0 >= 43 && LA16_0 <= 44)||LA16_0==46||LA16_0==49) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:116:25: ( '&&' | '<' | '+' | '-' | '*' ) ^ term
            	    {
            	    set96=(Token)input.LT(1);

            	    set96=(Token)input.LT(1);

            	    if ( input.LA(1)==40||(input.LA(1) >= 43 && input.LA(1) <= 44)||input.LA(1)==46||input.LA(1)==49 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set96)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_expression1167);
            	    term97=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term97.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:122:1: term : ( factor ( '[' factor ']' )* ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )* ) -> ^( Term factor ( '[' factor ']' )* ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )* ) ;
    public final MiniJavaParser.term_return term() throws RecognitionException {
        MiniJavaParser.term_return retval = new MiniJavaParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal99=null;
        Token char_literal101=null;
        Token char_literal102=null;
        Token Identifier103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        Token char_literal108=null;
        MiniJavaParser.factor_return factor98 =null;

        MiniJavaParser.factor_return factor100 =null;

        MiniJavaParser.expression_return expression105 =null;

        MiniJavaParser.expression_return expression107 =null;


        Object char_literal99_tree=null;
        Object char_literal101_tree=null;
        Object char_literal102_tree=null;
        Object Identifier103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal106_tree=null;
        Object char_literal108_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:122:13: ( ( factor ( '[' factor ']' )* ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )* ) -> ^( Term factor ( '[' factor ']' )* ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )* ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:122:17: ( factor ( '[' factor ']' )* ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )* )
            {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:122:17: ( factor ( '[' factor ']' )* ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )* )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:122:18: factor ( '[' factor ']' )* ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )*
            {
            pushFollow(FOLLOW_factor_in_term1205);
            factor98=factor();

            state._fsp--;

            stream_factor.add(factor98.getTree());

            // C:\\ANTLR\\The Final Project\\MiniJava.g:123:3: ( '[' factor ']' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:123:4: '[' factor ']'
            	    {
            	    char_literal99=(Token)match(input,53,FOLLOW_53_in_term1211);  
            	    stream_53.add(char_literal99);


            	    pushFollow(FOLLOW_factor_in_term1213);
            	    factor100=factor();

            	    state._fsp--;

            	    stream_factor.add(factor100.getTree());

            	    char_literal101=(Token)match(input,54,FOLLOW_54_in_term1215);  
            	    stream_54.add(char_literal101);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // C:\\ANTLR\\The Final Project\\MiniJava.g:124:3: ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:124:5: '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )?
            	    {
            	    char_literal102=(Token)match(input,47,FOLLOW_47_in_term1224);  
            	    stream_47.add(char_literal102);


            	    Identifier103=(Token)match(input,Identifier,FOLLOW_Identifier_in_term1226);  
            	    stream_Identifier.add(Identifier103);


            	    // C:\\ANTLR\\The Final Project\\MiniJava.g:124:20: ( '(' ( expression ( ',' expression )* )? ')' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==41) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // C:\\ANTLR\\The Final Project\\MiniJava.g:124:21: '(' ( expression ( ',' expression )* )? ')'
            	            {
            	            char_literal104=(Token)match(input,41,FOLLOW_41_in_term1229);  
            	            stream_41.add(char_literal104);


            	            // C:\\ANTLR\\The Final Project\\MiniJava.g:124:25: ( expression ( ',' expression )* )?
            	            int alt19=2;
            	            int LA19_0 = input.LA(1);

            	            if ( (LA19_0==DOUBLE||(LA19_0 >= INT && LA19_0 <= Identifier)||LA19_0==39||LA19_0==41||LA19_0==59||LA19_0==63||(LA19_0 >= 67 && LA19_0 <= 68)) ) {
            	                alt19=1;
            	            }
            	            switch (alt19) {
            	                case 1 :
            	                    // C:\\ANTLR\\The Final Project\\MiniJava.g:124:27: expression ( ',' expression )*
            	                    {
            	                    pushFollow(FOLLOW_expression_in_term1233);
            	                    expression105=expression();

            	                    state._fsp--;

            	                    stream_expression.add(expression105.getTree());

            	                    // C:\\ANTLR\\The Final Project\\MiniJava.g:124:38: ( ',' expression )*
            	                    loop18:
            	                    do {
            	                        int alt18=2;
            	                        int LA18_0 = input.LA(1);

            	                        if ( (LA18_0==45) ) {
            	                            alt18=1;
            	                        }


            	                        switch (alt18) {
            	                    	case 1 :
            	                    	    // C:\\ANTLR\\The Final Project\\MiniJava.g:124:40: ',' expression
            	                    	    {
            	                    	    char_literal106=(Token)match(input,45,FOLLOW_45_in_term1237);  
            	                    	    stream_45.add(char_literal106);


            	                    	    pushFollow(FOLLOW_expression_in_term1239);
            	                    	    expression107=expression();

            	                    	    state._fsp--;

            	                    	    stream_expression.add(expression107.getTree());

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop18;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }


            	            char_literal108=(Token)match(input,42,FOLLOW_42_in_term1247);  
            	            stream_42.add(char_literal108);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: expression, factor, 53, factor, Identifier, 45, 42, 54, 41, expression, 47
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:3: -> ^( Term factor ( '[' factor ']' )* ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )* )
            {
                // C:\\ANTLR\\The Final Project\\MiniJava.g:125:5: ^( Term factor ( '[' factor ']' )* ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Term, "Term")
                , root_1);

                adaptor.addChild(root_1, stream_factor.nextTree());

                // C:\\ANTLR\\The Final Project\\MiniJava.g:128:3: ( '[' factor ']' )*
                while ( stream_53.hasNext()||stream_factor.hasNext()||stream_54.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_53.nextNode()
                    );

                    adaptor.addChild(root_1, stream_factor.nextTree());

                    adaptor.addChild(root_1, 
                    stream_54.nextNode()
                    );

                }
                stream_53.reset();
                stream_factor.reset();
                stream_54.reset();

                // C:\\ANTLR\\The Final Project\\MiniJava.g:129:3: ( '.' Identifier ( '(' ( expression ( ',' expression )* )? ')' )? )*
                while ( stream_Identifier.hasNext()||stream_47.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_47.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_Identifier.nextNode()
                    );

                    // C:\\ANTLR\\The Final Project\\MiniJava.g:129:20: ( '(' ( expression ( ',' expression )* )? ')' )?
                    if ( stream_42.hasNext()||stream_41.hasNext()||stream_expression.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_41.nextNode()
                        );

                        // C:\\ANTLR\\The Final Project\\MiniJava.g:129:25: ( expression ( ',' expression )* )?
                        if ( stream_expression.hasNext()||stream_45.hasNext()||stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                            // C:\\ANTLR\\The Final Project\\MiniJava.g:129:38: ( ',' expression )*
                            while ( stream_expression.hasNext()||stream_45.hasNext() ) {
                                adaptor.addChild(root_1, 
                                stream_45.nextNode()
                                );

                                adaptor.addChild(root_1, stream_expression.nextTree());

                            }
                            stream_expression.reset();
                            stream_45.reset();

                        }
                        stream_expression.reset();
                        stream_45.reset();
                        stream_expression.reset();

                        adaptor.addChild(root_1, 
                        stream_42.nextNode()
                        );

                    }
                    stream_42.reset();
                    stream_41.reset();
                    stream_expression.reset();

                }
                stream_Identifier.reset();
                stream_47.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // C:\\ANTLR\\The Final Project\\MiniJava.g:137:1: factor : ( 'true' | 'false' | Identifier | 'this' | 'new' 'int' '[' expression ']' | 'new' Identifier '(' ')' | '!' expression | '(' expression ')' | INT | DOUBLE ) ;
    public final MiniJavaParser.factor_return factor() throws RecognitionException {
        MiniJavaParser.factor_return retval = new MiniJavaParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal109=null;
        Token string_literal110=null;
        Token Identifier111=null;
        Token string_literal112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        Token char_literal115=null;
        Token char_literal117=null;
        Token string_literal118=null;
        Token Identifier119=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        Token char_literal126=null;
        Token INT127=null;
        Token DOUBLE128=null;
        MiniJavaParser.expression_return expression116 =null;

        MiniJavaParser.expression_return expression123 =null;

        MiniJavaParser.expression_return expression125 =null;


        Object string_literal109_tree=null;
        Object string_literal110_tree=null;
        Object Identifier111_tree=null;
        Object string_literal112_tree=null;
        Object string_literal113_tree=null;
        Object string_literal114_tree=null;
        Object char_literal115_tree=null;
        Object char_literal117_tree=null;
        Object string_literal118_tree=null;
        Object Identifier119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;
        Object char_literal126_tree=null;
        Object INT127_tree=null;
        Object DOUBLE128_tree=null;

        try {
            // C:\\ANTLR\\The Final Project\\MiniJava.g:137:13: ( ( 'true' | 'false' | Identifier | 'this' | 'new' 'int' '[' expression ']' | 'new' Identifier '(' ')' | '!' expression | '(' expression ')' | INT | DOUBLE ) )
            // C:\\ANTLR\\The Final Project\\MiniJava.g:138:6: ( 'true' | 'false' | Identifier | 'this' | 'new' 'int' '[' expression ']' | 'new' Identifier '(' ')' | '!' expression | '(' expression ')' | INT | DOUBLE )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\ANTLR\\The Final Project\\MiniJava.g:138:6: ( 'true' | 'false' | Identifier | 'this' | 'new' 'int' '[' expression ']' | 'new' Identifier '(' ')' | '!' expression | '(' expression ')' | INT | DOUBLE )
            int alt22=10;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt22=1;
                }
                break;
            case 59:
                {
                alt22=2;
                }
                break;
            case Identifier:
                {
                alt22=3;
                }
                break;
            case 67:
                {
                alt22=4;
                }
                break;
            case 63:
                {
                int LA22_5 = input.LA(2);

                if ( (LA22_5==61) ) {
                    alt22=5;
                }
                else if ( (LA22_5==Identifier) ) {
                    alt22=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 5, input);

                    throw nvae;

                }
                }
                break;
            case 39:
                {
                alt22=7;
                }
                break;
            case 41:
                {
                alt22=8;
                }
                break;
            case INT:
                {
                alt22=9;
                }
                break;
            case DOUBLE:
                {
                alt22=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:138:7: 'true'
                    {
                    string_literal109=(Token)match(input,68,FOLLOW_68_in_factor1361); 
                    string_literal109_tree = 
                    (Object)adaptor.create(string_literal109)
                    ;
                    adaptor.addChild(root_0, string_literal109_tree);


                    }
                    break;
                case 2 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:139:17: 'false'
                    {
                    string_literal110=(Token)match(input,59,FOLLOW_59_in_factor1379); 
                    string_literal110_tree = 
                    (Object)adaptor.create(string_literal110)
                    ;
                    adaptor.addChild(root_0, string_literal110_tree);


                    }
                    break;
                case 3 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:140:17: Identifier
                    {
                    Identifier111=(Token)match(input,Identifier,FOLLOW_Identifier_in_factor1397); 
                    Identifier111_tree = 
                    (Object)adaptor.create(Identifier111)
                    ;
                    adaptor.addChild(root_0, Identifier111_tree);


                    }
                    break;
                case 4 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:141:17: 'this'
                    {
                    string_literal112=(Token)match(input,67,FOLLOW_67_in_factor1415); 
                    string_literal112_tree = 
                    (Object)adaptor.create(string_literal112)
                    ;
                    adaptor.addChild(root_0, string_literal112_tree);


                    }
                    break;
                case 5 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:142:17: 'new' 'int' '[' expression ']'
                    {
                    string_literal113=(Token)match(input,63,FOLLOW_63_in_factor1433); 
                    string_literal113_tree = 
                    (Object)adaptor.create(string_literal113)
                    ;
                    adaptor.addChild(root_0, string_literal113_tree);


                    string_literal114=(Token)match(input,61,FOLLOW_61_in_factor1435); 
                    string_literal114_tree = 
                    (Object)adaptor.create(string_literal114)
                    ;
                    adaptor.addChild(root_0, string_literal114_tree);


                    char_literal115=(Token)match(input,53,FOLLOW_53_in_factor1437); 
                    char_literal115_tree = 
                    (Object)adaptor.create(char_literal115)
                    ;
                    adaptor.addChild(root_0, char_literal115_tree);


                    pushFollow(FOLLOW_expression_in_factor1439);
                    expression116=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression116.getTree());

                    char_literal117=(Token)match(input,54,FOLLOW_54_in_factor1441); 
                    char_literal117_tree = 
                    (Object)adaptor.create(char_literal117)
                    ;
                    adaptor.addChild(root_0, char_literal117_tree);


                    }
                    break;
                case 6 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:143:17: 'new' Identifier '(' ')'
                    {
                    string_literal118=(Token)match(input,63,FOLLOW_63_in_factor1459); 
                    string_literal118_tree = 
                    (Object)adaptor.create(string_literal118)
                    ;
                    adaptor.addChild(root_0, string_literal118_tree);


                    Identifier119=(Token)match(input,Identifier,FOLLOW_Identifier_in_factor1461); 
                    Identifier119_tree = 
                    (Object)adaptor.create(Identifier119)
                    ;
                    adaptor.addChild(root_0, Identifier119_tree);


                    char_literal120=(Token)match(input,41,FOLLOW_41_in_factor1463); 
                    char_literal120_tree = 
                    (Object)adaptor.create(char_literal120)
                    ;
                    adaptor.addChild(root_0, char_literal120_tree);


                    char_literal121=(Token)match(input,42,FOLLOW_42_in_factor1465); 
                    char_literal121_tree = 
                    (Object)adaptor.create(char_literal121)
                    ;
                    adaptor.addChild(root_0, char_literal121_tree);


                    }
                    break;
                case 7 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:144:17: '!' expression
                    {
                    char_literal122=(Token)match(input,39,FOLLOW_39_in_factor1483); 
                    char_literal122_tree = 
                    (Object)adaptor.create(char_literal122)
                    ;
                    adaptor.addChild(root_0, char_literal122_tree);


                    pushFollow(FOLLOW_expression_in_factor1485);
                    expression123=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression123.getTree());

                    }
                    break;
                case 8 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:145:17: '(' expression ')'
                    {
                    char_literal124=(Token)match(input,41,FOLLOW_41_in_factor1503); 
                    char_literal124_tree = 
                    (Object)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);


                    pushFollow(FOLLOW_expression_in_factor1505);
                    expression125=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression125.getTree());

                    char_literal126=(Token)match(input,42,FOLLOW_42_in_factor1507); 
                    char_literal126_tree = 
                    (Object)adaptor.create(char_literal126)
                    ;
                    adaptor.addChild(root_0, char_literal126_tree);


                    }
                    break;
                case 9 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:146:14: INT
                    {
                    INT127=(Token)match(input,INT,FOLLOW_INT_in_factor1522); 
                    INT127_tree = 
                    (Object)adaptor.create(INT127)
                    ;
                    adaptor.addChild(root_0, INT127_tree);


                    }
                    break;
                case 10 :
                    // C:\\ANTLR\\The Final Project\\MiniJava.g:147:14: DOUBLE
                    {
                    DOUBLE128=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_factor1537); 
                    DOUBLE128_tree = 
                    (Object)adaptor.create(DOUBLE128)
                    ;
                    adaptor.addChild(root_0, DOUBLE128_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_goal_in_programEntry115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_goal168 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_mainClass_in_goal171 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_goal174 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_mainClass222 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_mainClass224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_mainClass226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_mainClass228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_mainClass230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_mainClass232 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_mainClass234 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_mainClass236 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_mainClass238 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_mainClass240 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_mainClass242 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_mainClass244 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_mainClass246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_mainClass248 = new BitSet(new long[]{0x1010000000010000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_in_mainClass250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_mainClass252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_mainClass254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_classDeclaration333 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_classDeclaration335 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_58_in_classDeclaration339 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_classDeclaration341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_classDeclaration346 = new BitSet(new long[]{0x2080000000010000L,0x0000000000000101L});
    public static final BitSet FOLLOW_varDeclaration_in_classDeclaration350 = new BitSet(new long[]{0x2080000000010000L,0x0000000000000101L});
    public static final BitSet FOLLOW_methodDeclaration_in_classDeclaration357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000101L});
    public static final BitSet FOLLOW_72_in_classDeclaration362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration433 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_varDeclaration435 = new BitSet(new long[]{0x0025000000000000L});
    public static final BitSet FOLLOW_varassign_in_varDeclaration437 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_varDeclaration441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_varassign493 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_varassign495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_varassign526 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_varassign528 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_varassign530 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_varassign532 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_varassign534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_methodDeclaration584 = new BitSet(new long[]{0x2080000000010000L});
    public static final BitSet FOLLOW_type_in_methodDeclaration586 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_methodDeclaration588 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_methodDeclaration590 = new BitSet(new long[]{0x2080040000010000L});
    public static final BitSet FOLLOW_type_in_methodDeclaration594 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_methodDeclaration596 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_45_in_methodDeclaration600 = new BitSet(new long[]{0x2080000000010000L});
    public static final BitSet FOLLOW_type_in_methodDeclaration602 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_methodDeclaration604 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_42_in_methodDeclaration612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_methodDeclaration614 = new BitSet(new long[]{0x3090000000010000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_varDeclaration_in_methodDeclaration618 = new BitSet(new long[]{0x3090000000010000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_statement_in_methodDeclaration625 = new BitSet(new long[]{0x1010000000010000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_65_in_methodDeclaration630 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_methodDeclaration632 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_methodDeclaration634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_methodDeclaration636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_type737 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_type739 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_type741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_type759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_type777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_type795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_statement838 = new BitSet(new long[]{0x1010000000010000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_statement_in_statement842 = new BitSet(new long[]{0x1010000000010000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_72_in_statement847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_statement883 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement885 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_statement887 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement889 = new BitSet(new long[]{0x1010000000010000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_in_statement891 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_statement895 = new BitSet(new long[]{0x1010000000010000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_in_statement897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_statement941 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement943 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_statement945 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement947 = new BitSet(new long[]{0x1010000000010000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_statement_in_statement949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_statement984 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement986 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_statement988 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement990 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_statement1027 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_statement1029 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_statement1031 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_statement1066 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_statement1068 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_statement1070 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_statement1072 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_statement1074 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_statement1076 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_statement1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expression1140 = new BitSet(new long[]{0x0002590000000002L});
    public static final BitSet FOLLOW_set_in_expression1144 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_term_in_expression1167 = new BitSet(new long[]{0x0002590000000002L});
    public static final BitSet FOLLOW_factor_in_term1205 = new BitSet(new long[]{0x0020800000000002L});
    public static final BitSet FOLLOW_53_in_term1211 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_factor_in_term1213 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_term1215 = new BitSet(new long[]{0x0020800000000002L});
    public static final BitSet FOLLOW_47_in_term1224 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_term1226 = new BitSet(new long[]{0x0000820000000002L});
    public static final BitSet FOLLOW_41_in_term1229 = new BitSet(new long[]{0x8800068000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_term1233 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_45_in_term1237 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_term1239 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_42_in_term1247 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_68_in_factor1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_factor1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_factor1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_factor1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_factor1433 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_factor1435 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_factor1437 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_factor1439 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_factor1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_factor1459 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Identifier_in_factor1461 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_factor1463 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_factor1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_factor1483 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_factor1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_factor1503 = new BitSet(new long[]{0x8800028000018100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expression_in_factor1505 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_factor1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_factor1537 = new BitSet(new long[]{0x0000000000000002L});

}