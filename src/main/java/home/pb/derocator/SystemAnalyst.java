package home.pb.derocator;

public class SystemAnalyst extends ProJectDerocator {
    public SystemAnalyst(ProJect proJect) {
        super(proJect);
    }
    @Override
    public void beforeCoding() {
        System.out.println("对系统实现进行仔细分析和设计");
    }
}
