public class Igrac extends PokretniEntitet {

    private String ime;
    public DeoOpreme[] inventar;
    private int zlato;

    static int numOpreme = 0;

    public Igrac(String ime, double x, double y) {

        super(1,0);
        this.ime = ime;
        this.x = x;
        this.y = y;
        inventar = new DeoOpreme[5];
        zlato = 10000;
    }

    public String getIme() {
        return ime;
    }

    public int getZlato() {
        return zlato;
    }

    void kupi(DeoOpreme artikal) {
        if(numOpreme < 5 && zlato >= artikal.getCena()){
            inventar[numOpreme] = new DeoOpreme(artikal);
            zlato-=artikal.getCena();
            numOpreme++;
        }
    }

    @Override
    public String toString() {
        return "Igrac: " + ime + " (" + zlato + ") ;" + super.toString();
    }
}
