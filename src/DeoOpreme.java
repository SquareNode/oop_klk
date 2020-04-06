public class DeoOpreme extends Entitet {

    private String ime;
    private int cena;

    static public int count = 0;

    public DeoOpreme(String ime, int cena) {
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
