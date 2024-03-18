package curs.curs10;

public class Om {
    int varsta;
    float greutate;
    double inaltime;
    String semneDinNastere;

    Om(int varstaParam, float greutateParam){
        this.varsta = varstaParam;
        this.greutate = greutateParam;
    }

    Om(double inaltimeParam, String semnDinNastereParam){
        this.inaltime = inaltimeParam;
        this.semneDinNastere = semnDinNastereParam;
    }

    public int getVarsta() {
        return varsta;
    }

    public float getGreutate() {
        return greutate;
    }

    public double getInaltime() {
        return inaltime;
    }

    public String getSemneDinNastere() {
        return semneDinNastere;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public void setSemneDinNastere(String semneDinNastere) {
        this.semneDinNastere = semneDinNastere;
    }
}
