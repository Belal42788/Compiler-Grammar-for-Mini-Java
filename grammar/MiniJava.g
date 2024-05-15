grammar MiniJava;

options {output=AST;}

tokens{
ProgramEntry;
GeneralArithExpr;
Term;
Factor;
Start;
MainClass;
ClassDeclaration;
VarDeclaration;
MethodDeclaration;
ID;
Int;
Boolean;
IntArray;
ArrayAssignment;
Assignment;
Print;
While;
If;
Stmt;
DoubleNum;
IntNum;
Pracet;
Not;
NNew;
New;
This;
Flase;
True;
Goal;
}
@members {
	String s="";
}
// Arithmetic expressions
programEntry: (goal) ->^(Start goal);
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
 
// The finally clause is the last part a rule executes before returning.
finally { s = s + "Exit..."+"\n"; }


goal        :   (classes*) ->^(Goal classes*);
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

classes	:	((classDeclaration| mainClass)^);

// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


mainClass   :   
		('class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' declirationsORStatement* '}' '}')
		->^(MainClass 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' declirationsORStatement* '}' '}')
		;

// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


classDeclaration    :   
			('class' Identifier ( 'extends' Identifier )? '{' declirationsORStatement* '}')
			->^(ClassDeclaration 'class' Identifier ( 'extends' Identifier )? '{' declirationsORStatement* '}')
			;
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


declirationsORStatement
	:	(( varDeclaration | methodDeclaration | statement)^);
	
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

	
	
varDeclaration  :   (type Identifier varassign?  ';')
			->^(VarDeclaration type Identifier varassign? ';')
			;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

varassign :    ( '=' expression ) ->^(Assignment Identifier '=' expression )
            | ('[' expression ']' '=' expression ) ->^(ArrayAssignment Identifier '[' expression ']' '=' expression )	;	
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


methodDeclaration   :   ('public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{'  declirationsORStatement* 'return' expression ';' '}')
			->^(MethodDeclaration 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' declirationsORStatement* 'return' expression ';' '}')
			;

// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


type        :   ('int' '[' ']'
            |   'boolean'
            |   'int'
            |   Identifier)
            ;

// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


statement   :   ('{' ( statement )* '}') ->^(Stmt '{' ( statement )* '}')
            |   ('if' '(' expression ')' statement  ('else' statement)?) ->^(If 'if' '(' expression ')' statement ('else' statement)?)
            |   ('while' '(' expression ')' statement) ->^(While 'while' '(' expression ')' statement)
            |   ('System.out.println' '(' expression ')' ';') ->^(Print 'System.out.println' '(' expression ')' ';')
            |   (Identifier '=' expression ';') ->^(Assignment Identifier '=' expression ';')
            |   (Identifier '[' expression ']' '=' expression ';') ->^(ArrayAssignment Identifier '[' expression ']' '=' expression ';')
            ;


// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


expression  :   (term ( ( '&&' | '||' | '<' | '+' | '-' | '*' | '>' | '<=' |'>=' '/' )^ term )*);

// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


term        :   (factor 
		('[' factor ']' )*
		( '.' Identifier ('(' ( expression ( ',' expression )* )? ')' )? )*)
		->^(
		Term
		factor 
		('[' factor ']' )*
		( '.' Identifier ('(' ( expression ( ',' expression )* )? ')' )? )*
		)
		;

// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


factor      :    
	    ('true'
            |   'false'
            |   Identifier
            |   'this'
            |   'new' 'int' '[' expression ']'
            |   'new' Identifier '(' ')'
            |   '!' expression
            |   '(' expression ')'
            |INT
            | Strings
            |DOUBLE )
            ;

// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


Identifier 	:	('a'..'z'|'A'..'Z'|'_')  ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*  ;
INT	:	 ('0'..'9')+ ;
Strings	:	'"' (.)* '"';
DOUBLE	:	INT '.' INT;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
ML_COMMENT	:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
SL_COMMENT	:	'//' (.)*'\n'+{skip();};