public class Coin {

    private double weight;
    private double diameter;

    public Coin(int weight, int diameter) throws CoinLogicException {
        if(diameter < 0)throw new CoinLogicException("Diameter should be positiv");
        this.weight = weight;
        this.diameter = diameter;

        }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }
}
