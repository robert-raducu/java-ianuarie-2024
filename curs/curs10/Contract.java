package curs.curs10;

public class Contract {
    String tipContract;
    int nrPagini;
    int nrParti;
    boolean aExpirat;

    Contract(String tipContractParam, int nrPaginiParam) {
        this.tipContract = tipContractParam;
        this.nrPagini = nrPaginiParam;
    }

    Contract (int nrPartiParam, boolean aExpiratParam){
        this.nrParti = nrPartiParam;
        this.aExpirat = aExpiratParam;
    }

    public String getTipContract() {
        return tipContract;
    }

    public void setTipContract(String tipContract) {
        this.tipContract = tipContract;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public int getNrParti() {
        return nrParti;
    }

    public void setNrParti(int nrParti) {
        this.nrParti = nrParti;
    }

    public boolean isaExpirat() {
        return aExpirat;
    }

    public void setaExpirat(boolean aExpirat) {
        this.aExpirat = aExpirat;
    }
}
