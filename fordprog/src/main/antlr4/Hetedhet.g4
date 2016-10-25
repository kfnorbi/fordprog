grammar Hetedhet;

@header {
package generated;
}


eval
	:	('+'|'-')?DIGIT+('.'DIGIT+)?('x7^'DIGIT+)?
	;
	
DIGIT:	[0-9];