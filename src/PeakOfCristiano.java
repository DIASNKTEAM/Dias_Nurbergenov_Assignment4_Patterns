public class PeakOfCristiano extends PeakDecorator {
    public PeakOfCristiano(PlayerPrice playerPrice) {
        super(playerPrice);
    }
    @Override
    public Integer getPrice(){
        return playerPrice.getPrice() + 30;
    }
}
