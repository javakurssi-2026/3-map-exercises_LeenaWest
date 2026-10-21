> [!NOTE]
> The English translation for this exercise can be found in [this file](./readme.en.md).

# Map-harjoitukset

Tämän harjoitustehtäväpaketin myötä opit hyödyntämään Map-tietorakennetta omissa sovelluksissasi. Harjoitusten tueksi suosittelemme lukemaan Oraclen [dev.java](https://dev.java/)-tutoriaalista sivut [Using Maps to Store Key Value Pairs](https://dev.java/learn/api/collections-framework/maps/) sekä [Managing the Content of a Map](https://dev.java/learn/api/collections-framework/working-with-keys-and-values/).

> *"A hashmap is a structure able to store key-value pairs. The value is any object your application needs to handle, and a key is something that can represent this object.*
>
> *Suppose you need to create an application that has to handle invoices, represented by instances of an Invoice class. Then your values are these Invoice instances, and your keys could be the invoice numbers. Each invoice has a number, and that number is unique among all your invoices."*
>
> Using Maps to Store Key Value Pairs. Oracle. https://dev.java/learn/api/collections-framework/maps/

Tehtävä koostuu useammasta osasta, jotka arvioidaan erikseen hyödyntäen valmiiksi kirjoitettuja testejä.


## Tehtävän aloittaminen

Aloita kloonaamalla Git-repositorio omalle koneellesi. Harjoitus täytyy tehdä omassa kopiossasi, eli varmista, että repositorion osoitteessa on mukana oma GitHub-käyttäjätunnuksesi!

```sh
git clone https://github.com/varmista-etta-github-tunnuksesi-on-repositorion-osoitteessa.git
```

Kloonattuasi projektin omalle koneellesi, avaa se koodieditorissasi.


## Vastausten lähettäminen

Kun olet saanut osan tai kaikki tehtävistä ratkaistua ja commitoinut vastauksesi, lähetä ratkaisut arvioitavaksi `git push`-komennolla. Git push käynnistää automaattisesti GitHub actions -workflow:n, joka kääntää sekä testaa ratkaisusi ja antaa jokaisesta testistä joko hyväksytyn tai hylätyn tuloksen.

Kun GitHub Actions on saanut koodisi suoritettua, näet tuloksen GitHub-repositoriosi actions-välilehdellä. Arvioinnin valmistumiseen menee tyypillisesti pari minuuttia.



## Tehtävä 1: [MapBasics.java](./src/main/java/part01/MapBasics.java) *(perusteet, 40 %)*

Tässä tehtävässä harjoittelemme uuden `Map`-olion luontia sekä tyypillisimpiä operaatioita tiedon lisäämiseksi, hakemiseksi, muuttamiseksi ja poistamiseksi.

Tehtävässä koodattava Java-luokka [MapBasics](./src/main/java/part01/MapBasics.java) koostuu valmiista metodeista, joiden javadoc-kommentit kertovat, miten metodin tulisi toimia. **Sinun tehtäväsi on lukea kommentit ja toteuttaa metodin sisältö vastaamaan metodin nimeä sekä kuvausta.**

Voit testata koodiasi esimerkiksi oman `main`-metodin avulla, tai voit hyödyntää tehtävän valmiita JUnit-yksikkötestejä, jotka löytyvät [MapBasicsTest](./src/test/java/part01/MapBasicsTest.java)-luokasta.

```
./gradlew test --tests MapBasicsTest        # unix
.\gradlew.bat test --tests MapBasicsTest    # windows
```

💡 *Sinun ei tarvitse perehtyä varsinaisen testin tekniseen toteutukseen. Tässä vaiheessa riittää, että suoritat testit ja tutustut niiden mahdollisesti tuottamiin virheilmoituksiin.*

💡 *Jos testit eivät mene läpi, kokeile suorittaa komento uudestaan siten, että lisäät loppuun argumentin `--info`. Näin saat tarkemman tiedon siitä, mikä testissä meni pieleen. Vaihtoehtoisesti voit suorittaa testit koodieditorisi testauspainikkeilla.*

🚀 *Huomaa, että monet tämän luokan metodit eivät ole riippuvaisia käytettävän Map-tietorakenteen tyypistä. Esimerkiksi `countEntries`-metodi voisi toimia yhtä hyvin `<String, String>`- kuin `<String, Integer>`-tyyppisten avainten ja arvojen kanssa. Oikeassa ohjelmassa käyttäisit todennäköisesti geneerisiä tyyppejä, kuten `Map<K, V>`. Tässä tehtävässä ei tarvitse erikseen perehtyä geneerisiin tyyppeihin, mutta voit halutessasi tutustua aiheeseen itsenäisesti ja toteuttaa metodit geneerisinä. Katso lisätietoja tutoriaalista: https://dev.java/learn/generics/.*


## Tehtävä 2: [MapExperts.java](./src/main/java/part02/MapExperts.java) *(soveltaminen, 30 %)*

Tässä tehtävässä jatkamme `Map`-operaatioita soveltavien tehtävien muodossa. Tehtävät ovat luonteeltaan haastavampia ja edellyttävät myös laajempaa ongelmanratkaisua kuin yksittäisen metodin käyttöä.

Kuten edellisessä tehtävässä, myös [MapExperts.java](./src/main/java/part02/MapExperts.java) koostuu valmiista metodeista, joiden javadoc-kommentit kertovat, miten metodin tulisi toimia. **Sinun tehtäväsi on lukea kommentit ja toteuttaa metodin sisältö vastaamaan metodin nimeä sekä kuvausta.**

Kuten edellisessä tehtävässä, voit testata koodiasi esimerkiksi oman `main`-metodin tai valmiiden JUnit-yksikkötestien avulla. Testit löytyvät [MapExpertsTest](./src/test/java/part02/MapExpertsTest.java)-luokasta. Voit suorittaa testit [koodieditorisi testaustyökalulla](https://code.visualstudio.com/docs/java/java-testing) tai [Gradle-automaatiotyökalulla](https://docs.gradle.org/current/userguide/java_testing.html):

```
./gradlew test --tests MapExpertsTest        # unix
.\gradlew.bat test --tests MapExpertsTest    # windows
```


## Tehtävä 3: [PostalCodesMain.java](./src/main/java/part03/PostalCodesMain.java) *(soveltaminen, 15 % + 15 %)*

Tietokoneohjelmat käyttävät usein JSON-tiedostomuotoa rakenteellisen datan käsittelyssä. [JSON (JavaScript Object Notation)](https://www.json.org/) on kevyt ja yleinen tapa tallentaa ja siirtää tietoa ohjelmien välillä. JSON-muotoista dataa voidaan käyttää monissa erilaisissa sovelluksissa, kuten verkkopalvelimissa, mobiilisovelluksissa ja tietokantojen kanssa työskennellessä. JSON-muotoinen data voi näyttää esim. seuraavalta:

```json
{
    "74701": "KIURUVESI",
    "35540": "JUUPAJOKI",
    "74705": "PAKETTIAUTOMAATTI",
    "74704": "SMARTPOST",
    "44884": "SMART POST"
}
```

Java-ohjelmassa Map-tietorakenne soveltuu erinomaisesti yllä esitettyjen avain-arvo-parien käsittelemiseen. Tässä tehtävässä keskitymme postinumeroaineiston käsittelyyn, joka on tallennettu [JSON-muotoiseen tiedostoon nimeltä *postcode_map_light.json*](./data/postcode_map_light.json).

💡 *JSON-tiedoston lukemiseen Java-ohjelmassa käytämme tässä tehtävässä Googlen julkaisemaa [GSON-kirjastoa](https://github.com/google/gson). GSON mahdollistaa JSON-datan muuntamisen Java-olioiksi ja päinvastoin. JSON-tiedoston käsittely on toteutettu valmiiksi [PostalCodesReader](./src/main/java/part03/PostalCodesReader.java)-luokassa. Sinun ei tarvitse perehtyä GSON:in yksityiskohtiin tai käyttää sitä itse.*

🚀 *GSON ei ole osa Javan standardikirjastoa, vaan se on lisätty tähän projektiin Gradle-työkalun avulla. Tutki [`build.gradle`](./build.gradle)-tiedostoa, löydätkö miten ja mihin GSON on määritetty?*


### Käyttöliittymä

Edellisistä tehtävistä poiketen tässä tehtävässä saat toteuttaa ratkaisun parhaaksi katsomallasi tavalla ja luoda parhaaksi katsomasi luokat ja metodit. Ohjelmasi on kuitenkin toimittava siten, että se käynnistyy `PostalCodesMain`-luokan main-metodista ja kysyy käyttäjältä ainoastaan yhden kysymyksen. Tulos täytyy myös tulostaa tehtävänannossa esitetyssä muodossa.

Toteuta siis [PostalCodesMain](./src/main/java/part03/PostalCodesMain.java)-luokkaan logiikka, joka hyödyntää [PostalCodesReader](./src/main/java/part03/PostalCodesReader.java)-luokan `readPostalCodes`-metodia. Ohjelmasi tulee tulostaa tilanteesta riippuen joko käyttäjän syöttämää postinumeroa vastaavan postitoimipaikan nimen tai nimeä vastaavat postinumerot.

**Postinumero (15 %)**

Käyttäjä saattaa siis syöttää numeron, jolloin ohjelma etsii ja tulostaa sitä vastaavan toimipaikan nimen:

```
Input postal code or district (e.g., 00100 or Helsinki): 00100

Post office: HELSINKI

[ ohjelman suoritus päättyy ]
```

Yllä olevassa esimerkissä käyttäjä antoi syötteen `00100` ja ohjelma tulosti nimen `HELSINKI`. Mikäli postinumeroa ei löydy aineistosta, tulosta esimerkiksi teksti "Post office not found."

💡 *Huomaa, että automaattisen arvioinnin vuoksi ohjelman tulee kysyä vain yksi syöte, tulostaa vastaus ja lopettaa.*

**Toimipaikan nimi (15 %)**

Jos käyttäjä syöttää toimipaikan nimen, ohjelman tulee tulostaa kaikki postinumerot, jotka kuuluvat kyseiseen postitoimipaikkaan:

```
Input postal code or district (e.g., 00100 or Helsinki): Porvoo

Postal codes: 06100, 06101, 06150, 06151, 06200, 06400, 06401, 06450, 06500

[ ohjelman suoritus päättyy ]
```

Tässä esimerkissä käyttäjä syötti tekstin `Porvoo` ja ohjelma tulosti Porvoon postinumerot. Mikäli annetulle nimelle ei löydy lainkaan postinumeroita, tulosta esimerkiksi teksti "Postal codes not found." Ohjelmasi tulee löytää postinumerot riippumatta syötetyn nimen kirjainkoosta.

Tulosteessa **postinumeroiden tulee olla kasvavassa järjestyksessä pilkuilla eroteltuna**, joten kerää postinumerot ensin esimerkiksi listalle, jonka [järjestät](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html#sort(java.util.List)) ennen tulostamista.


### Ohjelman suorittaminen

Voit suorittaa [PostalCodesMain](./src/main/java/part03/PostalCodesMain.java)-pääohjelman joko koodieditorisi käyttöliittymän Run-painikkeella tai Gradle-työkalun avulla komentoriviltä:

```
./gradlew --quiet --console plain run         # unix
.\gradlew.bat --quiet --console plain run     # windows

# -q, --quiet         Log errors only.
# --console [plain]   Specifies which type of console output to generate.
#                     Values are 'plain', 'auto' (default), 'rich' or 'verbose'.
```

💡 *Ensimmäisellä suorituskerralla suoritus saattaa olla hyvin hidas, mutta [suoritus nopeutuu seuraavilla kerroilla Gradlen välimuistin ansiosta](https://docs.gradle.org/current/userguide/build_cache.html). Voit myös vaihtoehtoisesti suorittaa ohjelmasi käyttämäsi koodieditorin "run"-painikkeella.*

🚀 *Gradle osaa suorittaa run-komennolla main-metodin oikeasta Java-luokasta, koska `PostalCodesMain` on määritetty [`build.gradle`](./build.gradle)-tiedostossa pääohjelmaksi.*


### Tehtävän testaaminen

Nämä postinumerotehtävät testataan käyttöliittymän kautta, joten niille ei ole aikaisemmista tehtävistä poiketen valmiita yksikkötestejä. Sinun on siis testattava ratkaisusi toimivuus itse suorittamalla ohjelman `main`-metodia ja tarkastamalla sen antamat tulokset. Valmis [PostalCodesReaderTest](./src/test/java/part03/PostalCodesReaderTest.java)-luokka tarkastaa vain, että [valmiiksi annettu koodi postinumeroiden lukemiseksi tiedostoista](./src/main/java/part03/PostalCodesReader.java) toimii kuten pitääkin, mutta se ei testaa toteuttamaasi pääohjelmaa.


## Bonustehtävä 4: [MorseCode.java](./src/main/java/part04/MorseCode.java) *(soveltaminen, 0 %)*

Tämä on bonustehtävä, joka ei sisälly tehtävän arviointiin. Voit halutessasi toteuttaa [MorseCode-luokan](./src/main/java/part04/MorseCode.java) ja siihen liittyvän [MorseApp-luokan](./src/main/java/part04/MorseApp.java), tai voit jättää tämän tehtävän väliin.

MorseCode-luokkaan on toteutettava kaksi metodia: `morseToText` ja `textToMorse`. Nämä metodit muuntavat merkkijonoja morsekoodista "normaaliksi" tekstiksi ja päinvastoin:

```
hello world
.... . .-.. .-.. ---   .-- --- .-. .-.. -..
```

Lisätietoja morsekoodista löytyy esimerkiksi Wikipediasta: [https://en.wikipedia.org/wiki/Morse_code](https://en.wikipedia.org/wiki/Morse_code).

MorseCode-luokalle on valmiit testit, jotka löytyvät [MorseCodeTest](./src/test/java/part04/MorseCodeTest.java)-luokasta.

```
./gradlew test --tests MorseCodeTest        # unix
.\gradlew.bat test --tests MorseCodeTest    # windows
```

---------

## Postinumeroaineiston tekijänoikeudet

Tässä projektissa hyödynnettävä postinumeroaineisto [postcode_map_light.json](./data/postcode_map_light.json) on lainattu [https://github.com/theikkila/postinumerot](https://github.com/theikkila/postinumerot)-projektin [postcode_map_light.json](https://github.com/theikkila/postinumerot/blob/master/postcode_map_light.json)-tiedostosta 7.6.2023.

Datan tekijänoikeudet kuuluvat Postille ja niitä käytetään [Postin käyttöehtojen mukaisesti](https://www.posti.fi/fi/asiakastuki/postinumerotiedostot). Mikäli teet kopioita tästä aineistosta, huolehdi [käyttöehtojen](https://www.posti.fi/fi/asiakastuki/postinumerotiedostot) noudattamisesta.


## Ohjelmoinnin MOOC

`MapExperts`-luokan metodeissa on otettu vahvasti vaikutteita Helsingin yliopiston Ohjelmoinnin perusteet -MOOC-kurssin Python-kielisistä tehtävistä osoitteessa https://ohjelmointi-23.mooc.fi/osa-5. Ohjelmoinnin MOOC on lisensoitu CC BY-NC-SA 4.0 -lisenssillä:

> *Kurssimateriaalin ja tehtävien tekijät ovat Erkki Kaila, Antti Laaksonen ja Matti Luukkainen. Muutama kurssin tehtävistä on Arto Hellaksen (né Vihavainen) käsialaa.*
>
> *Kurssin materiaali on lisensoitu [Creative Commons BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/deed.fi) -lisenssillä, joten voit käyttää ja levittää sitä vapaasti, kunhan alkuperäisten tekijöiden nimiä ei poisteta. Jos teet muutoksia materiaaliin ja haluat levittää muunneltua versiota, se täytyy lisensoida samalla lisenssillä. Materiaalien käyttö kaupalliseen tarkoitukseen on ilman erillistä lupaa kielletty.*


## Tämän tehtävän tekijänoikeudet

Tämän tehtävän on kehittänyt Teemu Havulinna ja se on lisensoitu [Creative Commons BY-NC-SA](https://creativecommons.org/licenses/by-nc-sa/4.0/) -lisenssillä. Tehtävänannon, tehtäväpohjien ja automaattisten testien luonnissa on hyödynnetty ChatGPT 3.5 -kielimallia sekä GitHub Copilot -tekoälytyökalua.
