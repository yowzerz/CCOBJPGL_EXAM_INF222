public class Boracay implements Locations {

    int airFare = 100;

    public int getAirFare() {return airFare;}

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
