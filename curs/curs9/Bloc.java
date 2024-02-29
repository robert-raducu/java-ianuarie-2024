package curs.curs9;

public class Bloc {
    String stradaBloc;
    int anConstructie;
    int etaj;
    boolean lift;

    public Bloc(String stradaBloc, int anConstructie, int etaj, boolean lift){
        this.stradaBloc = stradaBloc;
        this.anConstructie = anConstructie;
        this.etaj = etaj;
        this.lift =lift;
    }

    void afiseazaRiscSeistmic(){
        System.out.println("Riscul seistmic este mare");
    }
}
