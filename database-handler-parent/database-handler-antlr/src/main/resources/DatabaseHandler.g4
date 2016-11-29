grammar DatabaseHandler;

@header{
package hu.unideb.inf.fordprog.antlr4;
}

sqlStatement:
	createTableStatement
		;

createTableStatement:
	'CREATE TABLE 'TABLE_NAME'{'columnDefinition+'};'
		;
		
columnDefinition:
	COLUMN_NAME COLUMN_TYPE COLUMN_MODIFYER','
		;
		
TABLE_NAME:[a-zA-Z]+;
COLUMN_NAME:[a-zA-Z]+;
COLUMN_MODIFIER:'NOT NULL'|'PRIMARY KEY';