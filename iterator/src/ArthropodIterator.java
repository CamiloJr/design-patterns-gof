import java.util.Iterator;

public class ArthropodIterator implements Iterator<Animal> {

    private Zoo zoo;
    private int position = 0;

    public ArthropodIterator(Zoo zoo) {
        this.zoo = zoo;
    }

    public boolean hasNext() {
        for(int i = position; i < zoo.getAnimals().size(); i++) {
            Animal animal = zoo.getAnimals().get(i);
            if(animal.getAnimalClass().equalsIgnoreCase("arthropod")){
                return true;
            }
        }
        return false;
    }

    public Animal next() {
        while(position < zoo.getAnimals().size()) {
            Animal animal = zoo.getAnimals().get(position);
            position++;

            if(animal.getAnimalClass().equalsIgnoreCase("arthropod")) {
                return animal;
            }
        }
        return null;
    }
}
