public class Main {
    public static void main(String[] args) {

        Zoo zoo = new ZooImpl();
        zoo.addAnimal(new Animal("tiger","mammal"));
        zoo.addAnimal(new Animal("cat","mammal"));
        zoo.addAnimal(new Animal("aligator","reptile"));
        zoo.addAnimal(new Animal("chicken","bird"));
        zoo.addAnimal(new Animal("lobster","arthropod"));

        MammalIterator mammalIterator = new MammalIterator(zoo);

        while (mammalIterator.hasNext()){
            Animal animal = mammalIterator.next();
            System.out.println(animal.getName() + ", class: " + animal.getAnimalClass());
        }
    }
}
