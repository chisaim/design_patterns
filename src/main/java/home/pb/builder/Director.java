package home.pb.builder;

/**
 * 这个类的作用类似于电脑城的电脑销售员角色
 */
public class Director {
    private IComputerBuilder builder;
    public Director(IComputerBuilder builder) {
        this.builder = builder;
    }
    public Computer contractor(){
        return builder.getComputer();
    }
}
