import java.util.ArrayList;
import java.util.Iterator;

public class ZooImpl extends Zoo {

    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public Iterator<Animal> createIterator() {
        return animals.iterator();
    }
}
