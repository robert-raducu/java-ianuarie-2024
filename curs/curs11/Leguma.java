package curs.curs11;

public class Leguma {
    String nume;
    String culoare;
    String forma;
    String gust;


    public Leguma(String nume, String culoare, String forma, String gust){
        this.nume=nume;
        this.culoare=culoare;
        this.forma = forma;
        this.gust = gust;
    }

    void afiseazaGust(){
        System.out.println("Aceasta este o varza");
    }

    void afiseazaTextura(){
        System.out.println("Cam tare pentru dinti");
    }

    public String getNume(){
        return nume;
    }

    public String getGust(){
        return gust;
    }
}
