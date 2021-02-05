package instruments;

public class Piano extends Instrument {

    private int age;

    public Piano(double wholesalePrice, double salePrice, String material, String type, int age) {
        super(wholesalePrice, salePrice, material, type);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
