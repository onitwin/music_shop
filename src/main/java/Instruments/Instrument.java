package Instruments;

import Behaviors.IPlay;
import Behaviors.ISell;
import Enums.Type;

public abstract class Instrument implements ISell, IPlay {

    private String name;
    private Type type;
    private String manufacturer;
    private double purchasedCost;
    private double sellCost;

    public Instrument(String name, Type type,String manufacturer,double purchasedCost,double sellCost){
        this.name=name;
        this.type=type;
        this.manufacturer=manufacturer;
        this.purchasedCost=purchasedCost;
        this.sellCost=sellCost;
    }
    //getters


    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPurchasedCost() {
        return purchasedCost;
    }

    public double getSellCost() {
        return sellCost;
    }

    //setters

    public void setPurchasedCost(double purchasedCost) {
        this.purchasedCost = purchasedCost;
    }

    public void setSellCost(double sellCost) {
        this.sellCost = sellCost;
    }

    //methods

    public String calculateMarkup(){
        double sellPriceMinusBuyPrice=this.getSellCost()-this.getPurchasedCost();
        double midPrice=sellPriceMinusBuyPrice/getPurchasedCost();
        double markUp=midPrice*100;
        markUp=Math.round(markUp);
        String markUpAsString=markUp+"%";
        return markUpAsString;
    }
}
