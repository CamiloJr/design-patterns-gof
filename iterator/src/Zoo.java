import java.util.ArrayList;
import java.util.Iterator;

public abstract class Zoo {
    public abstract ArrayList<Animal> getAnimals();
    public abstract void addAnimal(Animal animal);
    public abstract void removeAnimal(Animal animal);
    public abstract Iterator<Animal> createIterator();
}
