public class PokretniEntitet extends Entitet {

    private double brzina, ugao;
    //Konstruktor koji prihvata vrednosti za oba atributa i poziva konstruktor bazne klase
    public PokretniEntitet(double brzina, double ugao, double x, double y,
                          int vitalnost) {
        //da li da prosledim parametre za super() konstruktor?
        //u tekstu ne pise da trazim i ostale parametre
        super(x,y,vitalnost);
        this.brzina = brzina;
        this.ugao = ugao;
    }

    public double getBrzina() {
        return brzina;
    }

    public double getUgao() {
        return ugao;
    }

    public void setBrzina(double brzina) {
        this.brzina = brzina;
    }

    public void setUgao(double ugao) {
        this.ugao = ugao;
    }
    public void pomeriSe(){
        super.x += brzina*Math.cos(ugao);
        super.y += brzina*Math.sin(ugao);
    }

    @Override
    public String toString() {
        return "Pokretni Entitet: " + "(" + super.x + ", " + super.y + ") " +
         "[" + super.vitalnost + " HP]" + (super.blokira ? "+" : "-") +
                "| brzina: " + brzina + ", ugao: " +
                ugao;
    }
}
