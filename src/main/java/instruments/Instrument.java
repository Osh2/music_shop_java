package instruments;

import behaviours.ForSale;
import behaviours.Play;

public abstract class Instrument implements ForSale, Play {

    private double wholesalePrice;
    private double salePrice;
    private String material;
    private String type;
    private InstrumentType instrument;

    public Instrument(InstrumentType instrument, String type, double wholesalePrice, double salePrice, String material) {
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
        this.material = material;
        this.type = type;
        this.instrument = instrument;
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

    public InstrumentType getInstrument() {
        return instrument;
    }

    public double calculateMarkupAsPercent(){
        double profit = salePrice - wholesalePrice;
        return Math.round(profit/wholesalePrice*100);
    }

    public double calculateMarkup(){
        return salePrice - wholesalePrice;
    }

    public String play(){
        if(this.instrument == InstrumentType.GUITAR){
            return "https://www.youtube.com/watch?v=265UrX_0glY";
        } else if (this.instrument == InstrumentType.KEYS){
            return "https://www.youtube.com/watch?v=n4JD-3-UAzM";
        } else if (this.instrument == InstrumentType.DRUMS){
            return "https://www.youtube.com/watch?v=9esWG6A6g-k";
        } else if (this.instrument == InstrumentType.BRASS){
            return "https://www.youtube.com/watch?v=092VyThpHUM";
        } else {
            return "Out of tune";
        }
    }
}
