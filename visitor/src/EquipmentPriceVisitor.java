public class EquipmentPriceVisitor extends EquipmentVisitor {

    public void visitRefrigerator(Refrigerator refrigerator) {
        System.out.println("Refrigerator price: " + refrigerator.getName() + " = $ " + String.valueOf(refrigerator.getPrice()) +
                " with +4% taxes, total $ " + String.valueOf(refrigerator.getPrice() * 1.04));
    }

    public void visitTelevision(Television television) {
        System.out.println("Television price:  " + television.getName() + " = $ " + String.valueOf(television.getPrice()) +
                " with +7% taxes, total $ " + String.valueOf(television.getPrice() * 1.07));
    }

    public void visitStove(Stove stove) {
        System.out.println("Stove price: " + stove.getName() + " = $ " + String.valueOf(stove.getPrice()) +
                " with +5% taxes, total $ " + String.valueOf(stove.getPrice() * 1.05));
    }
}
