package instruments;

import behaviours.ForSale;

public abstract class Instrument implements ForSale {

    private double wholesalePrice;
    private double salePrice;
    private String material;
    private String type;

    public Instrument(double wholesalePrice, double salePrice, String material, String type) {
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
        this.material = material;
        this.type = type;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public double calculateMarkup(){
        double profit = salePrice - wholesalePrice;
        return profit/wholesalePrice;
    }
}
