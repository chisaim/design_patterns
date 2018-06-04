package home.pb.template;

import org.junit.Test;

public class TemplateTest {
    @Test
    public void templateTest(){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new FootBall();
        game.play();
    }
}