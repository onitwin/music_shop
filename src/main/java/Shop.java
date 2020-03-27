import Behaviors.ISell;

import java.util.ArrayList;

public class Shop{

    ArrayList<ISell> stock;

    public Shop(){
        this.stock= new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public void removeStock(ISell item){
        this.stock.remove(item);
    }

    public double totalMarkUp(){
        double total = 0;
        for(ISell product : this.stock){
            total += product.calculateMarkup();
        }
        return total;
    }


}
