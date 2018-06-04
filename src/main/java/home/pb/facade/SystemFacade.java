package home.pb.facade;

public class SystemFacade {
    public void createFinanceReport(){
        ISystem humanResource = new HumanResourceSystem();
        ISystem storeSystem = new StoreSystem();
        ISystem financeSystem = new FinanceSystem();
        ISystem saleSystem = new SaleSystem();

        humanResource.getData();
        storeSystem.getData();
        financeSystem.getData();
        saleSystem.getData();

        System.out.println("生成报表");
    }
}
