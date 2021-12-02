public abstract class DecisionMaker {

    protected DecisionMaker successorDecisionMaker;

    public void setSuccesor(DecisionMaker decisionMaker) {
        this.successorDecisionMaker = decisionMaker;
    }

    public abstract void approve(PurchaseRequest purchaseRequest);
}
