public class Entitet implements Blokira {

    protected double x, y;
    protected int vitalnost;
    protected boolean blokira;

    public Entitet() {
        x = 0;
        y = 0;
        vitalnost = 0;
        blokira = true;
     }

    public Entitet(double x, double y, int vitalnost) {
        this.x = x;
        this.y = y;
        this.vitalnost = vitalnost > 0 ? vitalnost : 0;
        blokira = true;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getVitalnost() {
        return vitalnost;
    }
    public boolean getBlokira() {
        return blokira;
    }

    @Override
    public String toString() {
        return "Entitet:" +
                "(" + x + ","+
                 y + ") [" +
                vitalnost + " HP] "+
                (blokira ? "+" : "-");
    }

    @Override
    public boolean isBlokira() {
        return blokira;
    }

    @Override
    public void setBlokira(boolean blok) {
        this.blokira = blok;
    }
}
