public class Banawe implements Locations{
    int airFare = 75;

    public int getAirFare() {return airFare;}

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
