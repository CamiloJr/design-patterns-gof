public class Director extends DecisionMaker {
    public void approve(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getValue() <= 10000f) {
            System.out.println("Purchase request approved by director.");
        } else if (successorDecisionMaker != null) {
            successorDecisionMaker.approve(purchaseRequest);
        }
    }
}
