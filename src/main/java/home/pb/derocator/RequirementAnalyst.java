package home.pb.derocator;

public class RequirementAnalyst extends ProJectDerocator {
    public RequirementAnalyst(ProJect proJect) {
        super(proJect);
    }
    @Override
    public void beforeCoding() {
        System.out.println("对客户需求进行仔细全面准确的收集和分析和确认");
    }
}
