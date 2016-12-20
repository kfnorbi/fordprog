# SQL interpreter
---

Az SQL interpreter számunkra egy alap adatbázis lekérdezõ nyelvet biztosít amely hasonló alapokon mûködik mint egy **MySQL** vagy **Oracle**.

## Felépítés
Az adatbázis maga a memóriában tárolja a táblákat,oszlopokat,adatokat.
Az adatbázisban szereplõ adat illetve oszlop típusok a következõek:

 - VARCHAR 
 - NUMBER 
 - DATE

Az adatbázis egy rekordjának a modelle a következõképpen néz ki:

- Oszlop név
- Oszlop típus
- Érték (szöveges érték)

Az adatbázis oszlopainak modelle:

- Index
- Oszlop neve
- Oszlop típusa

Az adatbázis tábla modelle:

- Tábla neve
- Oszlopok listája
- Sorok száma

Az adatokat a táblákon belüli oszlopok sorrendjével megfelelõ sorban illesztjük be, ezáltal létrejött egy rekord modell is amely a következõképpen néz ki:

- Index
- Adatbázis adatok listája (amelyek a megfelelõ oszlopokhoz tartoznak)

## Alkalmazás használata
Az alkalmazás maga egy konzolos felhasználói felületet biztosít a felhasználó számára, amely során a memóriában tárolja a bevitt adatokat, táblákat és a bezárása után az adatok törlõdnek (a feladat követelményei között ez a megoldás teljesen jó, nem kellett gondoskodni a perzisztens tárolásról, csak a memóriabelirõl) és az újraindítás után az adatbázis újra üres lesz.
### Parancsok
####  Tábla létrehozása:
Tábla létrehozásához a `create table` parancsot használhatjuk amellyel a memóriában egy új táblát hozhatunk létre.
Parancs szintaxisa:

    create table táblaNeve {oszlopNeve oszlopTípusa(, oszlopNeve oszlopTípusa)*};

Példa a használatra:

    create table test {
	    id number,
	    full_name varchar, 
	    dateOfBirth date, 
	    payment number
    };

A következõ példa egy táblát hoz létre melyben 4 darab oszlop található név szerint:
- id
- full_name
- dateOfBirth
- payment

A táblák típusai különbözõek, kivéve az id illetve a payment mert a típusa mind a kettõnek `number`.
Az alkalmazás nem tesz különbséget az **egész** illetve **valós** számok között, mind a kettõre a `number` típus kell használni.

A parancs futtatása után a memóriában egy `test` nevû tábla jön létre 4 darab oszloppal.

#### Elõforduló kivételek a tábla létrehozása során
Ha a tábla már létezik az adatbázisban akkor a következõ hibát kapja a felhasználó a konzolon:

    SQL Error - 2: Table already exists.
#### Adatok táblába szúrása
Adatok megadott táblába az `insert into` parancsal szúrhatunk be.
Parancs szintaxisa:

    insert into táblaNeve (oszlopNeve(,oszlopNeve)*) values (érték(,érték)*);
Példa a használatra:

    insert into test (id,full_name,payment) values (1,'TestJohn',345.5);
A példa parancs a már létezõ test táblába szúr be egy új rekordok, pontosabban a tábla **id**, **full_name** illetve **payment** oszlopába szúr új adatotat: **1**,**TestJohn** illetve **345.5** értékekkel.

#### Elõforduló kivételek az adatok beszúrása közben
Ha a tábla nem létezik amelybe szúrni akarunk akkor a következõ hibaüzenetet kapjuk a konzol felületén:

    SQL Error - 3: Table does not exists.
Ha az oszlop nem létezik a táblában:

    SQL Error - 5: Column oszlopNeve does not exists in table:táblaNeve.
Ha a beszúrás során valamelyik beviteli adat típusa nem egyezik meg az oszlop típusával:

    SQL Error - 4: Value:'Zoltan' with the column type:NUMBER does not match.
Ha a beszúrás során az oszlopok és a bemeneti értékek listájának hossza nem egyezik:

    SQL Error - 6: Columns and values size are not equals.
#### Adatok lekérdezése
Adatok lekérdezése a `select * from` utasítással történik.
Parancs szintaxisa:

    select oszlopNeve(,oszlopNeve)* from táblaNeve (where feltételek)*;
Példa a használatra:

    select * from test;

VAGY

    select payment,full_name,id from test;
A következõ kép parancs kimenete különbözõ de egy táblából kérdezik le az adatokat.
Az alkalmazás biztosít a felhasználónak egy konzolos kimeneti ablakot is amelyben a lekérdezések eredményét tekintheti meg.
Ha az elõzõ parancsot lefuttatjuk (hozzáadva még kettõ darab insert-et) akkor a kimenet a következõképpen néz ki:

    |             id||      full_name||    dateOfBirth||        payment|
    |              1||       TestJohn||           NULL||          345.5|
    |              2||     TestAndrea||           NULL||         200.67|
    |              3||    TestMichael||     1975-09-12||           NULL|
A második lekérdezés kimenete:

    |        payment||      full_name||             id|
    |          345.5||       TestJohn||              1|
    |         200.67||     TestAndrea||              2|
    |           NULL||    TestMichael||              3|
Adatok lekérése WHERE feltétellel:

    select payment,full_name,id from test where payment > 10;
Kimenet:

    |        payment||      full_name|
    |          345.5||       TestJohn|
    |         200.67||     TestAndrea|
####Függvények használata
Az alkalmazás biztosítja a `SUM,AVG,COUNT,MIN,MAX` függvények használatát a lekérdezésekben, ezek jelenleg csak a lekérdezési oszlopok helyén szerepelhet, WHERE után nem.
Példák a függvények használatára:

**Összeg számítása:**

    select sum(payment) from test;

Kimenete:

    |   sum(payment)|
    |         669.17|
    
**Átlag számítása:**

    select avg(payment) from test;
Kimenete:

    |        avg(payment)|
    |  223.05666666666664|
**Legnagyobb elem keresése:**

    select max(payment) from test;
   
   Kimenete:

    |        max(payment)|
    |               345.5|

**Legkisebb elem keresése:**

    select min(payment) from test;
   Kimenete:

    |        min(payment)|
    |               123.0|

 **Elemek darabszáma:**

     select count(payment) from test;

 Kimenete:

    |      count(payment)|
    |                 3.0|


