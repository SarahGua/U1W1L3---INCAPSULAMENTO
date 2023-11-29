package Esercizio3;

public class ECommerce {
    public static class Articolo {
        public int codiceArticolo;
        public String descrizioneArticolo;
        public float prezzo;
        public int pezziDisponibili;
    }

    public static class Cliente{
        public int codiceCliente;
        public String nomeCliente;
        public String cognomeCliente;
        public String emailCliente;
        public int dataIscrizione;
    }

    public static class Carrello{
        public int clienteAssociato;
        public String elencoArticoli;
        public float totaleCosto;
    }
}
