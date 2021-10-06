public class PeakDecorator implements PlayerPrice {
    PlayerPrice playerPrice;

    public PeakDecorator(PlayerPrice playerPrice){
        this.playerPrice = playerPrice;
    }
    @Override
    public Integer getPrice() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
