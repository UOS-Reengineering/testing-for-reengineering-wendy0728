package example.project.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.lang.Math;

/**
 * A class defining the definition of a driving scenario, which is dependent on the domain/application.
 * This must be modified and updated with class Snapshot.
 */
public class Scenario {
    String roadType;
    String weatherCondition;
    List<Float> initEgoCarPos;  // (x, y)
    List<Float> initCarInFrontPos;  // (x, y)

    public Scenario() {
        roadType = null;
        weatherCondition = null;
        initEgoCarPos = null;
        initCarInFrontPos = null;
    }

    public Scenario(String scenarioDescription) {
        // parse scenarioDescription and save the result to the class attributes
        // not implemented
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        Scenario scenario = (Scenario) obj;
        boolean boolInitCarInFrontPos = false;
        List <Float> initCarInFrontPosList = scenario.initCarInFrontPos ;
        float totalObjInitCarInFrontPosList = 0.0F;
        float totalInitCarInFrontPosList = 0.0F;
        for(float valueObjInitCarInFrontPosList: initCarInFrontPosList ){
            totalObjInitCarInFrontPosList += valueObjInitCarInFrontPosList*valueObjInitCarInFrontPosList;
        }
        for(float valueInitCarInFrontPosList: initCarInFrontPos ){
            totalInitCarInFrontPosList += valueInitCarInFrontPosList*valueInitCarInFrontPosList;
        }


        double doubleTotalObjInitCarInFrontPosList = (double)totalObjInitCarInFrontPosList;
        double doubleTotalInitCarInFrontPosList = (double)totalInitCarInFrontPosList;
        double diff = Math.abs((Math.sqrt(doubleTotalObjInitCarInFrontPosList))- (Math.sqrt(doubleTotalInitCarInFrontPosList)));

        if (diff >0.5 && diff <0.5)  {
            boolInitCarInFrontPos = true;

        }

            return roadType.equals(scenario.roadType)
                && weatherCondition.equals(scenario.weatherCondition)
                && initEgoCarPos.equals(scenario.initEgoCarPos)
                && boolInitCarInFrontPos;
        }

}
