package curs.curs10;

public class Floare {
    int nrPetale;
    String culoare;
    String miros;
    boolean areGhiveci;

    /** Constructor **/
    Floare(int nrPetaleParam,String culoareParam){
        this.nrPetale=nrPetaleParam;
        this.culoare=culoareParam;
        System.out.println("Am apelat constructorul cu 2 parametrii");
    }

    /** Metoda / comportament **/
    int metodaCareIntoarce10() {
        return 10;
    }

    void metodaCareNuReturneazaNimic(){
        System.out.println("Metoda nu apeleaza nimic :(");
    }

    /** Getter && Setter **/
    int getNumarPetale(){
        return nrPetale;
    }

    void setNumarPetale(int nrPetaleParametru){
        this.nrPetale =  nrPetaleParametru;
    }

    /** **/

}
