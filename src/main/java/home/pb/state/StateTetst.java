package home.pb.state;


import org.junit.Test;

public class StateTetst {
    @Test
    public void stateTest(){
        Context context = new Context();
        StartState start = new StartState();
        start.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
