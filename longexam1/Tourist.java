interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
