public class Facade {

    private SubsystemA subsystemA;
    private  SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    public void operationOne() {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }

    public void operationTwo() {
        subsystemC.operationC();
        subsystemB.operationB();
        subsystemA.operationA();
    }
}
