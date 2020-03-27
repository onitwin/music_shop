package Items;

import Behaviors.ISell;

public abstract class BaseItem implements ISell {
    double purchasedCost;
    double sellCost;
    String name;

    public BaseItem(String name,double purchasedCost,double sellCost){
        this.name=name;
        this.purchasedCost=purchasedCost;
        this.sellCost=sellCost;

    }

    public double getPurchasedCost() {
        return purchasedCost;
    }

    public double getSellCost() {
        return sellCost;
    }

    public String getName() {
        return name;
    }

    public double calculateMarkup(){
        double markUp=this.getSellCost()-this.getPurchasedCost();
//        double markUp=sellPriceMinusBuyPrice/getPurchasedCost();
//        double markUp=midPrice*100;
//        markUp=Math.round(markUp);
        return markUp;
    }

}
