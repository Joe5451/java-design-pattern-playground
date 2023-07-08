public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startUp() {
        this.cpu.startUp();
        this.memory.startUp();
        this.disk.startUp();
    }
}
