package home.typeargs;

public class MyClass {

    private double val;

    <T extends Number> MyClass(T arg){
        val = arg.doubleValue();
    }

    void showVal(){
        System.out.println("val: " + val);
    }

}
