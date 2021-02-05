package instruments;

public class Guitar extends Instrument{

    private int numStrings;
    private String colour;

    public Guitar(double wholesalePrice, double salePrice, String material, String type, int numStrings, String colour) {
        super(wholesalePrice, salePrice, material, type);
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
