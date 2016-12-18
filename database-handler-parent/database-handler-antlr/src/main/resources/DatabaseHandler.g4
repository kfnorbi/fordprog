grammar DatabaseHandler;


@header{
package hu.unideb.inf.fordprog.antlr4;
}

sql_statement
	: create_table
	| insert_into
	| select_clause
	;
create_table
	:CREATE TABLE tableName=table_name LKPAR columns+=column_definition+ RKPAR SEMICOLON #createTable
	;
insert_into
	: INSERT INTO tableName=table_name LPAR insertColumnDefinition+=insert_column_definition+ RPAR VALUES LPAR value+ RPAR SEMICOLON #insertInto
	;
select_clause
	: SELECT columns+=column_list+ FROM tableName=table_name #select
	;
column_definition
	:  columnName=column_name columnType=COLUMN_TPYE COMA?
	;
column_list
	: columName=column_list_type COMA?
	;
column_list_type
	: column_name
	| ASTERIX
	;
table_name
	: tableName=ID+ #tableName
	;
column_name
	: columnName=ID+ #columnName
	;
insert_column_definition
	: columnName=column_name COMA? #insertColumnDefinition
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
SELECT
	:'select' | 'SELECT'
	;
FROM
	:'from' | 'FROM'
	;
WHERE
	:'where' | 'WHERE'
	;
AND
	:'and' | 'AND' | '&&'
	;
OR
	:'or' | 'OR' | '||'
	;
EQUALS
	:'='
	;
GT
	:'>'
	;
LT
	:'<'
	;
GTE
	:'>='
	;
LTE
	:'<='
	;
OPERATOR
	: EQUALS
	| GT
	| LT
	| GTE
	| LTE
	;
LOGICAL
	: AND
	| OR
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
ASTERIX
	:'*'
	;
ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
CHAR
	: ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\''|'-'|'.')*
	;
WS
   : (' ' | '\t' | '\n' | '\r' )+ -> skip
   ;