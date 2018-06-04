package home.pb.derocator;

public class SystemTester extends ProJectDerocator {
    public SystemTester(ProJect proJect) {
        super(proJect);
    }
    @Override
    public void afterCoding() {
        System.out.println("对系统进行严格的集成测试");
    }
}
