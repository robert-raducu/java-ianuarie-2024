package curs.curs10;

public class Student {
    String numePrenume;
    int varsta;
    int nrMatricol;
    boolean esteIntegralist;

    Student(String numePrenumeParam, int varstaParam) {
        this.numePrenume = numePrenumeParam;
        this.varsta = varstaParam;
    }

    Student(int nrMatricolParam, boolean esteIntegralistParam) {
        this.nrMatricol = nrMatricolParam;
        this.esteIntegralist = esteIntegralistParam;
    }

    public String getNumePrenume(){
        return numePrenume;
    }

    public void setNumePrenume(String numePrenume){
        this.numePrenume=numePrenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getNrMatricol() {
        return nrMatricol;
    }

    public void setNrMatricol(int nrMatricol) {
        this.nrMatricol = nrMatricol;
    }

    public boolean isEsteIntegralist() {
        return esteIntegralist;
    }

    public void setEsteIntegralist(boolean esteIntegralist) {
        this.esteIntegralist = esteIntegralist;
    }
}
