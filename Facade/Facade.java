public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
    }

    public void operate() {
        this.subsystemA.operateA();
        this.subsystemB.operateB();
    }
}
