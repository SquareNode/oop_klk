public class DeoOpreme extends Entitet {

    private String ime;
    private int cena;


    //Brojanje napravljenih objekata ove klase
    static public int count = 0;
    //da li public ili private? ne pise da treba da postoji geter za to
    //tako da ako zelim da mu pristupim stavicu public

    // Konstruktor koji prihvata vrednosti za oba atributa i poziva konstruktor bazne klase.
    public DeoOpreme(String ime, int cena) {
        //ovde nema smisla pozivati konstruktor sa bilo kakvim parametrima
        //jer se ne radi o pokretnom objektu, odnosno nemamo x,y koord i vitalnost,
        //poziv super ce samo postaviti blokira na true
        //ili mozda i ima smisla? zavisi kako razmisljamo
        super();
        this.ime =ime;
        this.cena = cena;
        count++;
    }

    public DeoOpreme(DeoOpreme d) {
        super(d.x, d.y, d.vitalnost);
        this.ime = d.ime;
        this.cena = d.cena;
        count++;
    }

    public String getIme() {
        return ime;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "DeoOpreme: " + ime + " (" + cena + " zlata)";
    }
}
