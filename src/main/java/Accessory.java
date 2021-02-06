import behaviours.ForSale;

public class Accessory implements ForSale {

    private double wholesalePrice;
    private double salePrice;
    private String item;
    private String make;
    private String associatedInstrument;

    public Accessory(double wholesalePrice, double salePrice, String item, String make, String associatedInstrument) {
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
        this.item = item;
        this.make = make;
        this.associatedInstrument = associatedInstrument;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public String getItem() {
        return item;
    }

    public String getMake() {
        return make;
    }

    public String getAssociatedInstrument() {
        return associatedInstrument;
    }

    public double calculateMarkupAsPercent(){
        double profit = salePrice - wholesalePrice;
        return Math.round(profit/wholesalePrice*100);
    }

    public double calculateMarkup(){
        return salePrice-wholesalePrice;
    }
}
