package Instruments;

import Enums.GuitarType;
import Enums.Type;
import Behaviors.IPlay;

public class Guitar extends Instrument{

    GuitarType guitarType;

    public Guitar (String name, Type type, String manufacturer, double purchasedCost, double sellCost, GuitarType guitarType){
        super(name,type,manufacturer,purchasedCost,sellCost);
        this.guitarType=guitarType;
    }

    public String play(){
        return "Wahwahwahwah";
    }

    public GuitarType getGuitarType(){
        return this.guitarType;
    }

}
