package curs.curs13;

public class Bloc {
    String nume;
    static int nrEtaje;
    boolean areParcare;
    String adresa;

    static int numarBlocuriConstruite = 0;
    static String numeCompanie = "Bloc Builder";

    public Bloc(String nume, int nrEtaje, boolean areParcare, String adresa) {
        this.nume = nume;
        this.nrEtaje = nrEtaje;
        this.areParcare = areParcare;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public int getNrEtaje() {
        return nrEtaje;
    }

    public boolean isAreParcare() {
        return areParcare;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrEtaje(int nrEtaje) {
        this.nrEtaje = nrEtaje;
    }

    public void setAreParcare(boolean areParcare) {
        this.areParcare = areParcare;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public static void metodaBloc1(){
        System.out.println("Prima metoda bloc");
    }

    public static int afisareEtaje(Bloc blocParam){
        return nrEtaje;
    }

//    public static String afisareNume(Bloc blocParam){
//
//    }

    public static void Parcare(){
        System.out.println("Metoda afiseaza parcare");
    }


}
