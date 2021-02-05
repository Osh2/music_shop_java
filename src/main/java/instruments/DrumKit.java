package instruments;

public class DrumKit extends Instrument {

    private int numToms;
    private int numCymbals;
    private String features;

    public DrumKit(double wholesalePrice, double salePrice, String material, String type, int numToms, int numCymbals, String features) {
        super(wholesalePrice, salePrice, material, type);
        this.numToms = numToms;
        this.numCymbals = numCymbals;
        this.features = features;
    }

    public int getNumToms() {
        return numToms;
    }

    public int getNumCymbals() {
        return numCymbals;
    }

    public String getFeatures() {
        return features;
    }
}
