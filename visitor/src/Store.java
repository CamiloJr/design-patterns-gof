import java.util.ArrayList;

public class Store {

    private ArrayList<Equipment> equipments = new ArrayList<Equipment>();

    public void addEquipment(Equipment equipment) {
        equipments.add(equipment);
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }
}
