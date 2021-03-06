# SQL interpreter
---

Az SQL interpreter sz�munkra egy alap adatb�zis lek�rdez� nyelvet biztos�t amely hasonl� alapokon m�k�dik mint egy **MySQL** vagy **Oracle**.

## Fel�p�t�s
Az adatb�zis maga a mem�ri�ban t�rolja a t�bl�kat,oszlopokat,adatokat.
Az adatb�zisban szerepl� adat illetve oszlop t�pusok a k�vetkez�ek:

 - VARCHAR 
 - NUMBER 
 - DATE

Az adatb�zis egy rekordj�nak a modelle a k�vetkez�k�ppen n�z ki:

- Oszlop n�v
- Oszlop t�pus
- �rt�k (sz�veges �rt�k)

Az adatb�zis oszlopainak modelle:

- Index
- Oszlop neve
- Oszlop t�pusa

Az adatb�zis t�bla modelle:

- T�bla neve
- Oszlopok list�ja
- Sorok sz�ma

Az adatokat a t�bl�kon bel�li oszlopok sorrendj�vel megfelel� sorban illesztj�k be, ez�ltal l�trej�tt egy rekord modell is amely a k�vetkez�k�ppen n�z ki:

- Index
- Adatb�zis adatok list�ja (amelyek a megfelel� oszlopokhoz tartoznak)

## Alkalmaz�s haszn�lata
Az alkalmaz�s maga egy konzolos felhaszn�l�i fel�letet biztos�t a felhaszn�l� sz�m�ra, amely sor�n a mem�ri�ban t�rolja a bevitt adatokat, t�bl�kat �s a bez�r�sa ut�n az adatok t�rl�dnek (a feladat k�vetelm�nyei k�z�tt ez a megold�s teljesen j�, nem kellett gondoskodni a perzisztens t�rol�sr�l, csak a mem�riabelir�l) �s az �jraind�t�s ut�n az adatb�zis �jra �res lesz.
### Parancsok
####  T�bla l�trehoz�sa:
T�bla l�trehoz�s�hoz a `create table` parancsot haszn�lhatjuk amellyel a mem�ri�ban egy �j t�bl�t hozhatunk l�tre.
Parancs szintaxisa:

    create table t�blaNeve {oszlopNeve oszlopT�pusa(, oszlopNeve oszlopT�pusa)*};

P�lda a haszn�latra:

    create table test {
	    id number,
	    full_name varchar, 
	    dateOfBirth date, 
	    payment number
    };

A k�vetkez� p�lda egy t�bl�t hoz l�tre melyben 4 darab oszlop tal�lhat� n�v szerint:
- id
- full_name
- dateOfBirth
- payment

A t�bl�k t�pusai k�l�nb�z�ek, kiv�ve az id illetve a payment mert a t�pusa mind a kett�nek `number`.
Az alkalmaz�s nem tesz k�l�nbs�get az **eg�sz** illetve **val�s** sz�mok k�z�tt, mind a kett�re a `number` t�pus kell haszn�lni.

A parancs futtat�sa ut�n a mem�ri�ban egy `test` nev� t�bla j�n l�tre 4 darab oszloppal.

#### El�fordul� kiv�telek a t�bla l�trehoz�sa sor�n
Ha a t�bla m�r l�tezik az adatb�zisban akkor a k�vetkez� hib�t kapja a felhaszn�l� a konzolon:

    SQL Error - 2: Table already exists.
#### Adatok t�bl�ba sz�r�sa
Adatok megadott t�bl�ba az `insert into` parancsal sz�rhatunk be.
Parancs szintaxisa:

    insert into t�blaNeve (oszlopNeve(,oszlopNeve)*) values (�rt�k(,�rt�k)*);
P�lda a haszn�latra:

    insert into test (id,full_name,payment) values (1,'TestJohn',345.5);
A p�lda parancs a m�r l�tez� test t�bl�ba sz�r be egy �j rekordok, pontosabban a t�bla **id**, **full_name** illetve **payment** oszlop�ba sz�r �j adatotat: **1**,**TestJohn** illetve **345.5** �rt�kekkel.

#### El�fordul� kiv�telek az adatok besz�r�sa k�zben
Ha a t�bla nem l�tezik amelybe sz�rni akarunk akkor a k�vetkez� hiba�zenetet kapjuk a konzol fel�let�n:

    SQL Error - 3: Table does not exists.
Ha az oszlop nem l�tezik a t�bl�ban:

    SQL Error - 5: Column oszlopNeve does not exists in table:t�blaNeve.
Ha a besz�r�s sor�n valamelyik beviteli adat t�pusa nem egyezik meg az oszlop t�pus�val:

    SQL Error - 4: Value:'Zoltan' with the column type:NUMBER does not match.
Ha a besz�r�s sor�n az oszlopok �s a bemeneti �rt�kek list�j�nak hossza nem egyezik:

    SQL Error - 6: Columns and values size are not equals.
#### Adatok lek�rdez�se
Adatok lek�rdez�se a `select * from` utas�t�ssal t�rt�nik.
Parancs szintaxisa:

    select oszlopNeve(,oszlopNeve)* from t�blaNeve (where felt�telek)*;
P�lda a haszn�latra:

    select * from test;

VAGY

    select payment,full_name,id from test;
A k�vetkez� k�p parancs kimenete k�l�nb�z� de egy t�bl�b�l k�rdezik le az adatokat.
Az alkalmaz�s biztos�t a felhaszn�l�nak egy konzolos kimeneti ablakot is amelyben a lek�rdez�sek eredm�ny�t tekintheti meg.
Ha az el�z� parancsot lefuttatjuk (hozz�adva m�g kett� darab insert-et) akkor a kimenet a k�vetkez�k�ppen n�z ki:

    |             id||      full_name||    dateOfBirth||        payment|
    |              1||       TestJohn||           NULL||          345.5|
    |              2||     TestAndrea||           NULL||         200.67|
    |              3||    TestMichael||     1975-09-12||           NULL|
A m�sodik lek�rdez�s kimenete:

    |        payment||      full_name||             id|
    |          345.5||       TestJohn||              1|
    |         200.67||     TestAndrea||              2|
    |           NULL||    TestMichael||              3|
Adatok lek�r�se WHERE felt�tellel:

    select payment,full_name,id from test where payment > 10;
Kimenet:

    |        payment||      full_name|
    |          345.5||       TestJohn|
    |         200.67||     TestAndrea|
####F�ggv�nyek haszn�lata
Az alkalmaz�s biztos�tja a `SUM,AVG,COUNT,MIN,MAX` f�ggv�nyek haszn�lat�t a lek�rdez�sekben, ezek jelenleg csak a lek�rdez�si oszlopok hely�n szerepelhet, WHERE ut�n nem.
P�ld�k a f�ggv�nyek haszn�lat�ra:

**�sszeg sz�m�t�sa:**

    select sum(payment) from test;

Kimenete:

    |   sum(payment)|
    |         669.17|
    
**�tlag sz�m�t�sa:**

    select avg(payment) from test;
Kimenete:

    |        avg(payment)|
    |  223.05666666666664|
**Legnagyobb elem keres�se:**

    select max(payment) from test;
   
   Kimenete:

    |        max(payment)|
    |               345.5|

**Legkisebb elem keres�se:**

    select min(payment) from test;
   Kimenete:

    |        min(payment)|
    |               123.0|

 **Elemek darabsz�ma:**

     select count(payment) from test;

 Kimenete:

    |      count(payment)|
    |                 3.0|
#### DISTINCT
A `DISTINCT` haszn�lat�val a lek�rdez�sek egyedis�g�t tudjuk biztos�tani.
`DISTINCT` haszn�lat�nak szintaxisa:
 

    select distinct oszlopNeve(,oszlopNeve)* from t�blaNeve (where felt�telek)*;

**P�lda a DISTINCT alap haszn�lat�ra:**

    create table test {
	    id number,
	    full_name varchar,
	    dateOfBirth date,
	    payment number
	};
    insert into test (id,full_name,payment) values (1,'TestJohn',345.5);
    insert into test (id,full_name,payment) values (2,'TestAndrea',200.67);
    insert into test (id,full_name,payment) values (3,'TestMichael',123);
    insert into test (id,full_name,payment) values (4,'TestAndrea',200.67);
    
    select distinct payment from test;
Kimenete:

    |             payment|
    |               345.5|
    |              200.67|
    |                 123|
**Haszn�lata f�ggv�nnyel:**

    select distinct sum(payment) from test;
Kimenete:

    |        sum(payment)|
    |              669.17|

**Haszn�lata f�ggv�nnyel �s WHERE felt�tellel:**

    select distinct sum(payment) from test where payment > 200.66;

Kimenete:

    |        sum(payment)|
    |              546.17|

