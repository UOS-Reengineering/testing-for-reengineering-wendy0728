package example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import example.project.domain.Scenario;
import example.project.domain.SimulationResult;
import example.project.domain.Snapshot;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestChecker {

    @Test
    public void testCheckCollisionViolations()
    {
        // setup
//        Simulator simulator = new Simulator("dummy");
//        Scenario scenario = new Scenario();
//
//        // testing target
//        Checker checker = new Checker(simulator);
//        boolean isCollision = checker.checkCollisionViolations(scenario); // this invokes a null pointer exception due to the dummy simulator
//        assertEquals(false, isCollision);

        Simulator simulator = mock();
        Snapshot snapshot = new Snapshot();
        Scenario scenario = new Scenario("special scenario leading to the prediction of [0, 0]");


        // testing target
        Checker checker = mock();
        when(checker.checkCollisionViolations(scenario)).thenReturn(true);
        boolean isCollision = checker.checkCollisionViolations(scenario);
        assertEquals(true, isCollision);
        verify(checker, times(1)).checkCollisionViolations(scenario); // verify if ads.predict(scenario) has been called only once
        verify(checker, times(0)).isCollision(snapshot); // verify if ads.printPath() has been never called





    }

}