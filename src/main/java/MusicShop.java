import behaviours.ForSale;
import instruments.Instrument;
import instruments.InstrumentType;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ForSale> stock;
    private String name;
    private double till;

    public MusicShop(String name, double till) {
        this.stock = new ArrayList<>();
        this.name = name;
        this.till = till;
    }

    public ArrayList<ForSale> getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public void addToStock(ForSale item){
        stock.add(item);
    }

    public double getPotentialProfits() {
        double total = 0;
        for(ForSale item: stock){
            total += item.calculateMarkup();
        }
        return total;
    }

    public String findItem(InstrumentType instrument){
        for( int i = 0 ; i < stock.size(); i++){
            ForSale item = stock.get(i);
            if( item instanceof Instrument && ((Instrument)item).getInstrument() == instrument) {
                return "Instrument in stock!";
            }
        }
        return "Out of stock";
    }


}
