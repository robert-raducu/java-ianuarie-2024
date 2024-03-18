package curs.curs9;

public class Contract {
    String tipContract;
    int anContract;
    int nrPagini;
    String partiContract;
    int cnp;

    public Contract(String tipContract, int anContract, int nrPagini, String partiContract, int cnp) {
        this.tipContract = tipContract;
        this.anContract = anContract;
        this.nrPagini = nrPagini;
        this.partiContract=partiContract;
        this.cnp = cnp;
    }

    public int getAnContract(){
        return anContract;
    }
}
