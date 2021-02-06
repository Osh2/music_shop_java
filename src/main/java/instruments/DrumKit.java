package instruments;

public class DrumKit extends Instrument {

    private int numToms;
    private int numCymbals;
    private String features;


    public DrumKit(InstrumentType instrument, String type, double wholesalePrice, double salePrice, String material, int numToms, int numCymbals, String features) {
        super(instrument, type, wholesalePrice, salePrice, material);
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
