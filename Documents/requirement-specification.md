# Számológép követelmény specifikáció

## 1. Jelenlegi helyzet
Könyvelő cégünk munkájához sok matematikai számítás elvégzésére van szükség, melyeket eddig papíron és fejben végeztünk el. Cégünk most bővült számítógépekkel, melyek minden kollégának rendelkezésére állnak, de sajnálatos módon számolásra alkalmas szoftver nem található rajtuk.


## 2. Vágyálom rendszer
A számítások pontosságának és gyorsaságának fejlesztése érdekében szeretnénk egy szoftver alapú számológépet, amely az összes dolgozó rendelkezésére áll.


## 3. Jelenlegi üzleti folymatok
3.1 Gazdasággal kapcsolatos számítások  
3.1.1 Bérszámfejtés => összeadás, szorzás papíron  
3.1.2 Kamat számítása => összeadás, szorzás papíron
3.1.3 Pénzügyi elemzés => összeadás, kivonás, szorzás, osztás papíron


## 4. Igényelt üzleti folyamatok
4.1 Számítások pontosságának szavatolása  
4.1.1 Műveleti sorrend betartása
4.1.2 Negatív számok kezelése


## 5. Rendszerre vonatkozó szabályok
5.1 Platformfüggetlenség


## 6. Követelménylista
|ID|Modul|Kifejtés|
|--|-----|--------|
|K01|Átlátható|Könnyen kezelhető rendszer
|K02|Felhasználóbarát megjelenés|Grafikus felület nyomógombokkal. Eredmény letisztult kijelzése
|K03|Időhatékonyság|Számítások gyors elvégzése
|K04|Műveletek elvégzése|Képes elvégezni az alapműveleteket. Kezeli a negatív számokat is


## 7. Fogalomszótár
Platformfüggetlenség:
>A platformfüggetlenség vagy többplatformosság, illetve multi-platform fogalma olyan számítógépes programokra, operációs rendszerekre, programozási nyelvekre vagy más számítógépes szoftverekre és implementációikra vonatkozik, amelyek több számítógépes platformon képesek működni. ([*Forrás*](https://www.mimi.hu/informatika/platformfuggetlenseg.html))
