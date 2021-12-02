public class Television extends Equipment {
    public Television(String name, double price){
        super(name, price);
    }

    public void accept(EquipmentVisitor equipmentVisitor) {
        equipmentVisitor.visitTelevision(this);
    }
}
