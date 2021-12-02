public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        EquipmentPriceVisitor  equipmentPriceVisitor = new EquipmentPriceVisitor();

        store.addEquipment(new Refrigerator("Brastemp", 1000));
        store.addEquipment(new Refrigerator("Phillips", 2500));
        store.addEquipment(new Television("Sony", 2200));
        store.addEquipment(new Television("Samgsung", 2500));
        store.addEquipment(new Stove("Phillips", 1500));

        for (Equipment equipment : store.getEquipments()) {
            equipment.accept(equipmentPriceVisitor);
        }
    }
}
