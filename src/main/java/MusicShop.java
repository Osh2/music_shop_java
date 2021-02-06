import behaviours.ForSale;

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

//    public void calculatePotentialProfits
}
