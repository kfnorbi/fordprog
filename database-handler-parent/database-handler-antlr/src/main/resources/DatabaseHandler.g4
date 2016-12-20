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
	: SELECT distinct? columns+=column_list+  FROM tableName=table_name (where=where_clause)? SEMICOLON #select
	;
column_definition
	:  columnName=column_name columnType=COLUMN_TPYE COMA?
	;
column_list
	: columName=column_list_type COMA? | functionName=function_clause
	;
column_list_type
	: column_name
	| ASTERIX
	;
function_clause
	:functionLabel=function LPAR columnName=column_name RPAR COMA?
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
where_clause
   : WHERE expression #whereClause
   ;
distinct
	:DISTINCT #distinctLabel
	;
expression
   : simple_expression ( expr_op simple_expression )* #expressionLabel
   ;
expr_op
   : AND | OR | NOT
   ;
element
   : CHAR | column_name
   ;
right_element
   : element
   ;
left_element
   : element
   ;
simple_expression
   : left=left_element relation=relational_op right=right_element
   ;
value
	: CHAR COMA?
	;
function
	: MIN
	| MAX
	| COUNT
	| SUM
	| AVG
	;
relational_op
   : EQ
   | NOT_EQ
   | LTE
   | GTE
   | LTH
   | GTH
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
EQ
   : '='
   ;
LTH
   : '<'
   ;
GTH
   : '>'
   ;
LTE
	:'<='
	;
GTE
	:'>='
	;
NOT_EQ
   : '!='
   ;
NOT
   : 'not'
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
SUM
	:'sum' | 'SUM'
	;
AVG
	:'avg' | 'AVG'
	;
MIN
	:'min' | 'MIN'
	;
MAX
	:'max' | 'MAX'
	;
COUNT
	:'count' | 'COUNT'
	;
DISTINCT
	:'distinct' | 'DISTINCT'
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