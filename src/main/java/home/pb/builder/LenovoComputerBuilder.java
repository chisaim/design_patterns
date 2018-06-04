package home.pb.builder;


public class LenovoComputerBuilder implements IComputerBuilder {
    private Computer computer;
    public LenovoComputerBuilder() {
        this.computer = new Computer();
    }
    @Override
    public void builderCPU() {
        ICpu cpu = new InterCPU();
        this.computer.setiCpu(cpu);
    }
    @Override
    public void builderMainBroad() {
        IMainBroad mainBroad = new AsusMainBroad();
        this.computer.setiMainBroad(mainBroad);
    }
    @Override
    public Computer getComputer() {
        this.builderCPU();
        this.builderMainBroad();
        return this.computer;
    }
}
