public class President  extends DecisionMaker {
    public void approve(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getValue() <= 100000f) {
            System.out.println("Purchase request approved by president.");
        } else {
            System.out.println("Purchase request not approved.");
        }
    }
}
