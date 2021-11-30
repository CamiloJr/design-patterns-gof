public class Main {

    public static void main(String[] args) {

        //Developers
        Developer developer1 = new Developer("Willian", 900);
        Developer developer2 = new Developer("Richard", 1200);
        Developer developer3 = new Developer("Paul", 5000);

        //Managers
        Manager manager1 = new Manager("Carl", 15000);
        Manager manager2 = new Manager("Joseph", 10000);
        Manager manager3 = new Manager("Alisson", 5000);

        developer1.add(developer2);

        //Structure
        //Alisson supervises Willian and Richard
        manager3.add(developer1);
        manager3.add(developer2);

        //Joseph supervises Paul
        manager2.add(developer3);

        //Carl supervises Joseph and Alisson
        manager1.add(manager2);
        manager1.add(manager3);

        //Show
        manager1.showCollaborator();
    }
}
