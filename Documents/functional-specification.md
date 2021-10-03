# Számológép funkcionális specifikáció

## 1. Jelenlegi helyzet
Könyvelő cégünk munkájához sok matematikai számítás elvégzésére van szükség, melyeket eddig papíron és fejben végeztünk el. Cégünk most bővült számítógépekkel, melyek minden kollégának rendelkezésére állnak, de sajnálatos módon számolásra alkalmas szoftver nem található rajtuk.


## 2. Vágyálom rendszer
Egy MVC paradigmát követő Java program. Fontos a pontosság, emiatt a nagy pontosságot megengedő Double adattípussal dolgozik. A gyorsaságot az algoritmusok hatékonysági elemzésével és optimalizálásával érjük el. A nagyobb felhasználhatóság érdekében egy platformfüggetlen rendszert hozunk létre. Próbáljuk a tárhelyszükségleteket is optimalizálni, hogy az alacsonyabb kapacitással rendelkező gépeknek se okozzon gondot.


## 3. Követelménylista
|ID|Modul|Kifejtés|
|--|-----|--------|
|K01|Átlátható|Könnyen kezelhető rendszer
|K02|Felhasználóbarát megjelenés|Grafikus felület nyomógombokkal. Eredmény letisztult kijelzése
|K03|Időhatékonyság|Számítások gyors elvégzése
|K04|Műveletek elvégzése|Képes elvégezni az alapműveleteket. Kezeli a negatív számokat is


## 4. Használati esetek
![](https://raw.githubusercontent.com/nehai-kettes-tankor/first-project/master/Documents/use-case.png)
