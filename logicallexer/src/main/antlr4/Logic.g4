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
	       variable #varExpr
		 | LEFT_PARENTHESIS  expr=expression  RIGHT_PARENTHESIS #parExpr  
		 | left=expression operator=binaryOperator('|')  right=expression  #orExpr
		 | left=expression operator=binaryOperator('&')  right=expression  #andExpr
		 | left=expression operator=binaryOperator('>')  right=expression  #implicationExpr
		 | operator=unariOperator  expr=expression #unExpr
	;

binaryOperator:
	OR | AND | IMPLICATION
	;
	
unariOperator:
	NEGATE
;
	
variable :
	VAR
	;

OR: '|';
AND: '&';
IMPLICATION:'>';
NEGATE:'-';
LEFT_PARENTHESIS:'(';
RIGHT_PARENTHESIS:')';
VAR:[a-zA-Z];