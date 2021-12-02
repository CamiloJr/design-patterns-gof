public class Manager extends DecisionMaker {
    public void approve(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getValue() <= 1000f) {
            System.out.println("Purchase request approved by manager.");
        } else if (successorDecisionMaker != null) {
            successorDecisionMaker.approve(purchaseRequest);
        }
    }
}
