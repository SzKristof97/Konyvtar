package me.szkristof.konyvtar;

import java.util.ArrayList;
import java.util.List;

public class Konyvtar {

    //Könyvek listája, reprezentálja a könyvtárat
    private List<Konyv> konyvek;

    public Konyvtar(){
        konyvek = new ArrayList<>();
    }

    /**
     * Hozzáadja a listához a beadott könyvet
     *
     * @param k Ez egy Konyv típusú változó, amely tárolja a címet, szerzőt, kiadót és oldalszámot
     */
    public void addKonyv(Konyv k){
        konyvek.add(k);
    }

    /**
     * Rendezi a Könyvtárat (listát) szerző szerint
     */
    public void rendezSzerzo(){
        for(int i = 0; i < konyvek.size(); i++){
            for(int j = i + 1; j < konyvek.size(); j++){
                Konyv k1 = konyvek.get(i),k2 = konyvek.get(j);
                if(k1.getSzerzo().compareTo(k2.getSzerzo())>0){
                    Konyv temp = k1;
                    konyvek.set(i, k2);
                    konyvek.set(j, temp);
                }
            }
        }
    }

    /**
     * Rendezi a Könyvtárat (listát) cím szerint
     */
    public void rendezCim(){
        for(int i = 0; i < konyvek.size(); i++){
            for(int j = i + 1; j < konyvek.size(); j++){
                Konyv k1 = konyvek.get(i),k2 = konyvek.get(j);
                if(k1.getCim().compareTo(k2.getCim())>0){
                    Konyv temp = k1;
                    konyvek.set(i, k2);
                    konyvek.set(j, temp);
                }
            }
        }
    }

    /**
     * Kiírja a képernyőre a Könyvtárat (listát)
     */
    public void listaz(){
        for (int i = 0; i < konyvek.size(); i++) {
            System.out.printf("%d. konyv:\n" +
                    "\tCím:\t%s\n" +
                    "\tSzerző:\t%s\n" +
                    "\tKiadó:\t%s\n" +
                    "\tOldalszám:\t%d\n",
                    (i+1),
                    konyvek.get(i).getCim(),
                    konyvek.get(i).getSzerzo(),
                    konyvek.get(i).getKiado(),
                    konyvek.get(i).getOldalszam());
        }
    }
}
