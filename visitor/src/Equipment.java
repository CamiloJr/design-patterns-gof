public abstract class Equipment {

    private String name;
    private double price;

    public Equipment(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract  void accept(EquipmentVisitor equipmentVisitor);
}
