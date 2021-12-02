public class Refrigerator extends Equipment {

    public Refrigerator(String name, double price){
        super(name, price);
    }

    public void accept(EquipmentVisitor equipmentVisitor) {
        equipmentVisitor.visitRefrigerator(this);
    }
}
