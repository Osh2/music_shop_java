package instruments;

public class Flute extends Instrument {

    private String size;

    public Flute(double wholesalePrice, double salePrice, String material, String type, String size) {
        super(wholesalePrice, salePrice, material, type);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
