package Items;

public class SheetMusic extends BaseItem {

    private String musician;

    public SheetMusic(String name,double purchasedCost,double sellCost,String musician){
        super(name,purchasedCost,sellCost);
        this.musician=musician;
    }

    public String getMusician() {
        return musician;
    }
}
