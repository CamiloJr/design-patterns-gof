public class Main {
    public static void main(String[] args) {
        DecisionMaker president = new President();
        DecisionMaker vicepresident = new VicePresident();
        DecisionMaker director = new Director();
        DecisionMaker manager = new Manager();

        manager.setSuccesor(director);
        director.setSuccesor(vicepresident);
        vicepresident.setSuccesor(president);

        PurchaseRequest purchaseRequest = new PurchaseRequest(100000f, "popcorn maker");
        manager.approve(purchaseRequest);
    }
}
