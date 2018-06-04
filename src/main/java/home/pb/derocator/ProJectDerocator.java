package home.pb.derocator;

public abstract class ProJectDerocator implements ProJect{
    private ProJect proJect;
    public ProJectDerocator(ProJect proJect) {
        this.proJect = proJect;
    }
    @Override
    public void coding() {
        beforeCoding();
        proJect.coding();
        afterCoding();
    }
    public void beforeCoding(){}
    public void afterCoding(){}
}
