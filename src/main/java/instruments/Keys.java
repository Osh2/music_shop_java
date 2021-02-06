package instruments;

public class Keys extends Instrument {

    private int age;

    public Keys(InstrumentType instrument, String type, double wholesalePrice, double salePrice, String material, int age) {
        super(instrument, type, wholesalePrice, salePrice, material);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
