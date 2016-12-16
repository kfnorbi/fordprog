grammar DatabaseHandler;


@header{
package hu.unideb.inf.fordprog.antlr4;
}

sql_statement
	: create_table
	| insert_into
	;
create_table
	:CREATE TABLE table_name LKPAR column_definition+ RKPAR SEMICOLON
	;
insert_into
	: INSERT INTO table_name LPAR insert_column_definition+ RPAR VALUES LPAR value+ RPAR SEMICOLON
	;
column_definition
	:  column_name COLUMN_TPYE COMA?
	;
table_name
	: ID+
	;
column_name
	: ID+
	;
insert_column_definition
	: column_name COMA?
	;
value
	: CHAR COMA?
	;
CREATE
	: 'create' | 'CREATE'
	;
TABLE
	: 'table' | 'TABLE'
	;
INSERT
	:'insert' | 'INSERT'
	;
INTO
	:'into' | 'INTO'
	;
VALUES
	:'values' | 'VALUES'
	;
COLUMN_TPYE
	: 'varchar'
	| 'number'
	| 'date'
	;
LKPAR
	: '{'
	;
RKPAR
	: '}'
	;
LPAR
	:'('
	;
RPAR
	:')'
	;
SEMICOLON
	:';'
	;
COMA
	:','
	;
ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
CHAR
	: ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\'')*
	;
WS
   : (' ' | '\t' | '\n' | '\r' )+ -> skip
   ;