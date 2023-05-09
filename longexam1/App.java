public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod
        Me me = new Me();

        Locations boracay = new Boracay();
        Locations banawe = new Banawe();
        Locations baguio = new Baguio();
        Locations cebu = new Cebu();
        Locations palawan = new Palawan();
        Locations batanes = new Batanes();

        me.visit(boracay);
        me.visit(banawe);
        me.visit(baguio);
        me.visit(cebu);
        me.visit(palawan);
        me.visit(batanes);

    }
}
