public class PurchaseRequest {

    private float value = 0f;
    private String description;

    public PurchaseRequest(float value, String description) {
        this.value = value;
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
