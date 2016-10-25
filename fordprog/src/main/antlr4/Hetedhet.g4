grammar Hetedhet;

@header {
package generated;
}


eval
	:	('+'|'-')?digit+('.'digit+)?('x7^'digit+)?
	;
	
digit:	'0'|'1'|'2'|'3'|'4'|'5'|'6' ;