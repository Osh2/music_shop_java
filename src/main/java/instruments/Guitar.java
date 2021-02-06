package instruments;

public class Guitar extends Instrument{

    private int numStrings;
    private String colour;

    public Guitar(InstrumentType instrument, String type, double wholesalePrice, double salePrice, String material, int numStrings, String colour) {
        super(instrument, type, wholesalePrice, salePrice, material);
        this.numStrings = numStrings;
        this.colour = colour;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String getColour() {
        return colour;
    }
}
