import java.util.Iterator;

public class FishiIterator implements Iterator<Animal> {

    private Zoo zoo;
    private int position = 0;

    public FishiIterator(Zoo zoo) {
        this.zoo = zoo;
    }

    public boolean hasNext() {
        for(int i = position; i < zoo.getAnimals().size(); i++) {
            Animal animal = zoo.getAnimals().get(i);
            if(animal.getAnimalClass().equalsIgnoreCase("fishi")){
                return true;
            }
        }
        return false;
    }

    public Animal next() {
        while(position < zoo.getAnimals().size()) {
            Animal animal = zoo.getAnimals().get(position);
            position++;

            if(animal.getAnimalClass().equalsIgnoreCase("fishi")) {
                return animal;
            }
        }
        return null;
    }
}
