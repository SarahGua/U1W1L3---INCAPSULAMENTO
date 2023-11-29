package Esercizio2;

public class Esercizio2 {
    public int numeroTelefono;
    public int prefisso;
    public float credito;
    public String listaChiamate;

    //COSTRUTTORE
    public Esercizio2(int prefisso,int numeroTelefono){
        this.prefisso = prefisso;
        this.credito = 0;
        this.listaChiamate = "lista vuota";
        this.numeroTelefono = numeroTelefono;
    }

    //METODO
    public void stampaDatiSIM(){
        System.out.println(prefisso + numeroTelefono);
        System.out.println(credito);
        System.out.println(listaChiamate);
    }

}
