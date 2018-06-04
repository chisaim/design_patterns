package home.pb.derocator;

import org.junit.Test;

public class DerocatorTest {
    @Test
    public void derocatorTest(){
        ProJect baseProject = new Program();
        baseProject.coding();
        System.out.println();

        ProJect tester = new SystemTester(baseProject);
        tester.coding();
        System.out.println();

        ProJect sysAnalyst = new SystemAnalyst(baseProject);
        sysAnalyst.coding();
        System.out.println();

        ProJect requirementAnalyst = new  RequirementAnalyst(baseProject);
        requirementAnalyst.coding();
        System.out.println();

        ProJect manager = new ProjectManager(new RequirementAnalyst(new SystemAnalyst(new SystemTester(baseProject))));
        manager.coding();
        System.out.println();
    }
}
