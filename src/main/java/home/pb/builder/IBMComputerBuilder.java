package home.pb.builder;

public class IBMComputerBuilder implements IComputerBuilder {
    private Computer computer;
    public IBMComputerBuilder() {
        this.computer = new Computer();
    }
    @Override
    public void builderCPU() {
        ICpu cpu = new AmdCPU();
        this.computer.setiCpu(cpu);
    }
    @Override
    public void builderMainBroad() {
        IMainBroad mainBroad = new GaMainBroad();
        this.computer.setiMainBroad(mainBroad);
    }
    @Override
    public Computer getComputer() {
        this.builderCPU();
        this.builderMainBroad();
        return this.computer;
    }
}
