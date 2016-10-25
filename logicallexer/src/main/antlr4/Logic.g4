grammar Logic;

@header {
package generated;
}

expression
	:	VAR  | 
		 LEFT_PARENTHESIS  expression  RIGHT_PARENTHESIS  |
		 expression  binaryoperator  expression  |
		 unarioperator  expression 
	;
	
binaryoperator:
	AND | OR
	;

unarioperator:
	NEGATE
	;


OR: '|';
AND: '&';
IMPLICATION:'>';
NEGATE:'-';
LEFT_PARENTHESIS:'(';
RIGHT_PARENTHESIS:')';
VAR:[a-zA-Z];