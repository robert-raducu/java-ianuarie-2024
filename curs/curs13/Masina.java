package curs.curs13;

public class Masina {
    String marca;
    String culoare;
    int anFabricatie;
    String proprietar;
    static int numarMasiniVandute = 0;
    static String locatieShowRoom = "Stada Auto";

    public Masina(String marca, String culoare, int anFabricatie, String proprietar) {
        this.marca = marca;
        this.culoare = culoare;
        this.anFabricatie = anFabricatie;
        this.proprietar = proprietar;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public String getProprietar() {
        return proprietar;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }
}
