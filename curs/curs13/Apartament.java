package curs.curs13;

public class Apartament {
    int nrCamere;
    double suprafata;
    boolean areBalcon;
    String proprietar;

    static int numarApartamentVandute = 0;
    static String numeAgentieImobiliara = "ImobiliarPlus";

    public Apartament(int nrCamere, double suprafata, boolean areBalcon, String proprietar) {
        this.nrCamere = nrCamere;
        this.suprafata = suprafata;
        this.areBalcon = areBalcon;
        this.proprietar = proprietar;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public boolean isAreBalcon() {
        return areBalcon;
    }

    public String getProprietar() {
        return proprietar;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public void setSuprafata(double suprafata) {
        this.suprafata = suprafata;
    }

    public void setAreBalcon(boolean areBalcon) {
        this.areBalcon = areBalcon;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }
}
