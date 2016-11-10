grammar Logic;

@header {
package generated;
}

expression:
		   var=VAR #varExpression
		 | LEFT_PARENTHESIS  expr=expression  RIGHT_PARENTHESIS #parExpr  
		 | NEGATE subexpression=expression #unExpr
		 | left=expression AND right=expression  #andExpr
		 | left=expression OR  right=expression  #orExpr
		 | left=expression IMPLICATION right=expression  #implicationExpr
	;

OR: '|';
AND: '&';
IMPLICATION:'>';
NEGATE:'-';
LEFT_PARENTHESIS:'(';
RIGHT_PARENTHESIS:')';
VAR:[a-zA-Z];