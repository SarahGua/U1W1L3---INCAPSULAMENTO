import Esercizio1.Esercizio1;
import Esercizio2.Esercizio2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Esercizio1 rettangolo1 = new Esercizio1(2, 4);
        rettangolo1.perimetroRettangolo();
        rettangolo1.stampaRettangolo();

        Esercizio2 SIM1 = new Esercizio2(331, 9495603);
        SIM1.stampaDatiSIM();
    }
}