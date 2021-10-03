# Rendszerterv

## A rendszer célja
A rendszer célja, hogy alapvető matematikai számítások elvégzése gyorsan és pontosan történhessen meg ezzel elősegítve a megrendelő cég munkafolyamatait.

## Projekt terv
A projekt létrehozásához 3 szoftverfejlesztő áll rendelkezésre, illetve 7 munkanap. A 3 fejlesztő közös felelőssége a határidőre való átadás és a hibamentes működés.

## Üzleti folyamatok modellje
A folyamatok szereplője a felhasználó lesz. A program grafikus felhasználói felületen kéri be a számokat valamint az elvégezni kívánt műveletet, majd ugyanezen a felületen vissza is adja az előállított eredményt.

## Követelmények
|ID|Modul|Kifejtés|
|--|-----|--------|
|K01|Átlátható|Könnyen kezelhető rendszer
|K02|Felhasználóbarát megjelenés|Grafikus felület nyomógombokkal, eredmény letisztult kijelzése
|K03|Időhatékonyság|Számítások gyors elvégzése
|K04|Műveletek elvégzése|Képes elvégezni az alapműveleteket. Kezeli a negatív számokat is

## Funkcionális terv
![](https://raw.githubusercontent.com/nehai-kettes-tankor/first-project/master/Documents/uml.png)

## Fizikai környezet
A fejlesztés Java nyelven valósul meg Windows operációs rendszerre, illetve különböző Linux disztribúciókra.
    
## Architekturális terv
A program külön telepítendő minden egyes gépre és nincsenek összeköttetésben. Túlterhelés emiatt csak a memória oldaláról történhet. Ha memóriahiány lép fel, azt a számológép nem tudja kezelni. Ekkor a program leáll. Ezt csak az erőforráshasználat megfelelő beosztásával lehet kiküszöbölni, ami a programnak nem része, így a felhasználó felelőssége. Probléma esetén a gép újraindítása vagy a feleslegesen futó alkalmazások leállítása segíthet.

## Implementációs terv
Az elkészítendő program osztályai lesznek a *Controller* osztály, ami a háttérfolyamatokhoz szükséges osztályokat köti össze a felhasználói felülettel. A gombokról érkező adatokat ez az osztály dolgozza fel, majd továbbítja a modelnek a számításokhoz. Tehát fő feladata az inputok kezelése. A feldolgozáshoz a *Calculate* osztályt használjuk. Ebben meghívjuk a *Separate* osztály *separate* függvényét, amely tartalmazza a sztringként beolvasott értékek átalakításához szükséges függvényt. Illetve a *ComputeRules* osztályt, ami a műveleteket.Ebben a műveleti sorrendnek megfelelően ketté vannak osztva a műveletek és végrehajtódnak. Végül a *Calculate* osztály *solve* metódusa hívja sorban a Model csomag osztályainak a függvényeit megfelelő sorrendben.

## Tesztterv
A tesztelés legfőbb célja, hogy kizárjuk annak esélyét, hogy egy matematikai számítás helytelen eredményt adjon, ezzel esetlegesen kárt okozva a cégnek. Tehát a tesztesetekben a különböző alapműveletek elvégzésének helyessége kerül vizsgálatra.

## Telepítési terv
Az elkészült alkalmazás egy *.jar* állományból lesz futtatható, ehhez a cég közlése alapján rendelkezésre áll minden számítógépen a *Java Development Kit* legfrissebb verziója, így az egyedüli feladat a *.jar* állomány elhelyezése rajtuk.

## Karbantartási terv
Az esetleges hibajavítások, vagy későbbi igények szerinti funkcionális újítások szintén *.jar* állomány útján jutnak el az alkalmazottak számítógépeire.
