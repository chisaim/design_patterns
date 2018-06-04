package home.pb.builder;

public class Computer {
    private ICpu iCpu;
    private IMainBroad iMainBroad;
    public ICpu getiCpu() {
        return iCpu;
    }
    public void setiCpu(ICpu iCpu) {
        this.iCpu = iCpu;
    }
    public IMainBroad getiMainBroad() {
        return iMainBroad;
    }
    public void setiMainBroad(IMainBroad iMainBroad) {
        this.iMainBroad = iMainBroad;
    }
}
