package instruments;

public class Brass extends Instrument {

    private String size;


    public Brass(InstrumentType instrument, String type, double wholesalePrice, double salePrice, String material, String size) {
        super(instrument, type, wholesalePrice, salePrice, material);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
