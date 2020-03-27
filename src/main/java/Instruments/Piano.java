package Instruments;

import Behaviors.IPlay;
import Enums.PianoType;
import Enums.Type;

public class Piano extends Instrument {

    PianoType pianoType;


    public Piano(String name, Type type, String manufacturer, double purchasedCost, double sellCost, PianoType pianoType){
        super(name,type,manufacturer,purchasedCost,sellCost);
        this.pianoType=pianoType;
    }

    public String play(){
        return "Plink Plink Plink";
    }

    public PianoType getPianoType(){
        return this.pianoType;
    }


}
