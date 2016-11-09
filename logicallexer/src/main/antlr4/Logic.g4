grammar Logic;

@header {
package generated;

import java.util.Scanner;
}


@parser::members {

	private java.util.HashMap<String, Boolean> memory = new java.util.HashMap<String, Boolean>();

    private boolean exists(String name){
        return memory.containsKey(name);
    }

    private void createVariable(String name){
    	Scanner sc = new Scanner(System.in);
    	System.out.print(name+":");
    	Boolean val = Boolean.parseBoolean(sc.next());
		memory.put(name,val);
    }
}


expression:
		   var=VAR #varExpression
		 | LEFT_PARENTHESIS  expr=expression  RIGHT_PARENTHESIS #parExpr  
		 | NEGATE subexpression=expression #unExpr
		 | left=expression AND right=expression  #andExpr
		 | left=expression OR  right=expression  #orExpr
		 | left=expression IMPLICATION right=expression  #implicationExpr
	;

binaryOperator:
	 AND | OR | IMPLICATION
	;
	
unariOperator:
	NEGATE
;
	
OR: '|';
AND: '&';
IMPLICATION:'>';
NEGATE:'-';
LEFT_PARENTHESIS:'(';
RIGHT_PARENTHESIS:')';
VAR:[a-zA-Z];