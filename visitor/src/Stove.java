public class Stove extends Equipment {
    public Stove(String name, double price){
        super(name, price);
    }

    public void accept(EquipmentVisitor equipmentVisitor) {
        equipmentVisitor.visitStove(this);
    }
}
