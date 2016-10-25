grammar Telefonszam;

@header {
package generated;
}

eval
	:	
		elojel?(orszag Kotojel?)? (korzet Kotojel?)? (elso | masodik | harmadik | negyedik | otodik | hatodik | hetedik | nyolcadik)
	;
	
Plusz:'+';
INT1: DIGIT;
INT2: DIGIT DIGIT;
INT3: DIGIT DIGIT DIGIT;
INT4: DIGIT DIGIT DIGIT DIGIT;
INT5: DIGIT DIGIT DIGIT DIGIT DIGIT;
INT6: DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT;
INT7: DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT;
INT8: DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT;
INT9: DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT;
Kotojel:'-';
orszag: INT2;
elojel: Plusz;
elso: INT9;
korzet: INT1 | INT2;
masodik: INT7;
harmadik: INT6;
negyedik: INT3 Kotojel INT3;
otodik: INT4 Kotojel INT3;
hatodik: INT2 Kotojel INT2 Kotojel INT3;
hetedik: INT3 Kotojel INT4;
nyolcadik: INT3 Kotojel INT2 Kotojel INT2;
WS
   : [ \r\n] + -> skip
   ;
DIGIT : [0-9];