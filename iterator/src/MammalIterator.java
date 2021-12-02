import java.util.Iterator;

public class MammalIterator implements Iterator<Animal> {

    private Zoo zoo;
    private int position = 0;

    public MammalIterator(Zoo zoo) {
        this.zoo = zoo;
    }

    public boolean hasNext() {
        for(int i = position; i < zoo.getAnimals().size(); i++) {
            Animal animal = zoo.getAnimals().get(i);
            if(animal.getAnimalClass().equalsIgnoreCase("mammal")){
                return true;
            }
        }
        return false;
    }

    public Animal next() {
        while(position < zoo.getAnimals().size()) {
            Animal animal = zoo.getAnimals().get(position);
            position++;

            if(animal.getAnimalClass().equalsIgnoreCase("mammal")) {
                return animal;
            }
        }
        return null;
    }
}
