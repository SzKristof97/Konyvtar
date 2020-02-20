package me.szkristof.konyvtar;

public class Main {
    public static void main(String[] args) {
        //Könyvtár létrehozása
        Konyvtar konyvtar = new Konyvtar();

        //Könyvtár feltöltése könyvekkel
        konyvtar.addKonyv(new Konyv("Molnár Ferenc","A Pál utcai fiúk","Móra Ferenc Könyvkiadó",160));
        konyvtar.addKonyv(new Konyv("Jókai Mór","A kőszívű ember fiai","A Hon",648));
        konyvtar.addKonyv(new Konyv("Gárdonyi Géza","Egri Csillagok","Móra Ferenc Könyvkiadó",304));

        //Könyvek rendezése szerző szerint és kiírás
        System.out.printf("Könyvek rendezése szerző szerint:\n");
        konyvtar.rendezSzerzo();
        konyvtar.listaz();

        //Könyvek rendezése cím szerint és kiírás
        System.out.printf("\nKönyvek rendezése cím szerint:\n");
        konyvtar.rendezCim();
        konyvtar.listaz();
    }
}
