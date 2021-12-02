public class Main {
    public static void main(String[] args) {
        Salesman salesman = new Salesman("Richard", 10000f);
        System.out.println(salesman.getName() + " - Total Sales: " + salesman.getTotalSales());

        SalesMemories salesMemories = new SalesMemories();
        salesMemories.setMemento(salesman.createMemento());

        salesman.setName("Willian");
        salesman.setTotalSales(50000f);

        System.out.println(salesman.getName() + " - Total Sales: " + salesman.getTotalSales());

        salesman.retoreMemeneto(salesMemories.getMemento());

        System.out.println(salesman.getName() + " - Total Sales: " + salesman.getTotalSales());
    }
}
