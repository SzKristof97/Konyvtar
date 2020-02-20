package me.szkristof.konyvtar;

public class Konyv {

    //Változók
    private String szerzo;
    private String cim;
    private String kiado;
    private int oldalszam;

    //Konstruktor, az alap adatok megadása kötelező!
    public Konyv(String szerzo, String cim, String kiado, int oldalszam){
        this.szerzo = szerzo;
        this.cim = cim;
        this.kiado = kiado;
        this.oldalszam = oldalszam;
    }

    //Setterek (Ezekkel lehet állítani az egyes változók értékeit)
    public void setSzerzo(String szerzo){
        this.szerzo = szerzo;
    }

    public void setCim(String cim){
        this.cim = cim;
    }

    public void setKiado(String kiado){
        this.kiado = kiado;
    }

    public void setOldalszam(int oldalszam){
        this.oldalszam = oldalszam;
    }

    //Getterek (Ezekkel lehet a változók értékeit lekérdezni)
    public String getSzerzo() {
        return szerzo;
    }

    public String getCim() {
        return cim;
    }

    public String getKiado() {
        return kiado;
    }

    public int getOldalszam() {
        return oldalszam;
    }
}
