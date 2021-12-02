public class Animal {
    private String name;
    private String animalClass;

    public Animal(String name, String animalClass) {
        this.name = name;
        this.animalClass = animalClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalClass() {
        return this.animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }
}
