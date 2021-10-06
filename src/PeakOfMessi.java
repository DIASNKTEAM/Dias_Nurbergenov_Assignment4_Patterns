public class PeakOfMessi extends PeakDecorator {

    public PeakOfMessi(PlayerPrice playerPrice) {
        super(playerPrice);
    }
    @Override
    public Integer getPrice(){
        return playerPrice.getPrice() + 60;
    }
}



