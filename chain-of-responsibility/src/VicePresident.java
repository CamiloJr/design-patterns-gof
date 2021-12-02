public class VicePresident  extends DecisionMaker {
    public void approve(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getValue() < 30000f) {
            System.out.println("Purchase request approved by vice president.");
        } else if (successorDecisionMaker != null) {
            successorDecisionMaker.approve(purchaseRequest);
        }
    }
}
