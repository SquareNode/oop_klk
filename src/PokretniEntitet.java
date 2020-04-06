public class PokretniEntitet extends Entitet {

    private double brzina, ugao;

    public PokretniEntitet(double brzina, double ugao) {
        super();
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
        return super.toString() + "| brzina: " + brzina + ", ugao: " +
                ugao;
    }
}
