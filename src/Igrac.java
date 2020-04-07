public class Igrac extends PokretniEntitet {

    private String ime;
    //deo opreme menjam u private
    private DeoOpreme[] inventar;
    private int zlato;

    //static int numOpreme = 0;
    private int numOpreme = 0;
    public Igrac(String ime, double x, double y) {
        //promenjeni argumenti super, dodata vitalnost
        super(1,0, x, y, 100);
        this.ime = ime;
        inventar = new DeoOpreme[5];
        zlato = 10000;
        numOpreme = 0;
    }

    public String getIme() {
        return ime;
    }

    public int getZlato() {
        return zlato;
    }

    void kupi(DeoOpreme artikal) {
        //inventar.length mi vraca broj alociranih el, znaci uvek 5
        //moram nekako drugacije da brojim koliko sam elemenata kupio
        if(numOpreme < 5 && zlato >= artikal.getCena()){
            //pozivam konstruktor kopije, ne dajem samo referencu, ovako je prvobitno bilo
            inventar[numOpreme] = new DeoOpreme(artikal);
            zlato-=artikal.getCena();
            numOpreme++;
        }
    }
    void ispisiOpremu() {
        for (int i = 0; i < numOpreme; i++) {
            System.out.println("\t -" + inventar[i]);
        }
    }
    @Override
    public String toString() {
        return "Igrac: " + ime + " (" + zlato + ") ;" + super.toString();
    }
}
