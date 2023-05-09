public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    @Override
    public void visit(Boracay boracay) {

    }

    public void visit(Locations location) {
        if(budget >= location.getAirFare()) {
            budget -= location.getAirFare();
            System.out.println("Arrived on a location");
        } else {
            System.out.println("Not enough budget");
        }
        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
