package home.pb.iterator;

import org.junit.Test;

public class IteratorTest {
    @Test
    public void IteratorTest(){
        NameRepository nameRepository = new NameRepository();
        for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}