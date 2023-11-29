package Esercizio1;

public class Esercizio1 {
    //ATTRIBUTI
    public float altezza;
    public float larghezza;

    //COSTRUTTORE
    public Esercizio1(float altezza, float larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //METODO CALCOLO PERIMETRO
    public void perimetroRettangolo(){
        System.out.println((altezza + larghezza) * 2);
    }

    public void stampaRettangolo(){
        System.out.println((altezza + larghezza) * 2);
        System.out.println(altezza * larghezza);
    }
}
