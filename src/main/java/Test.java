import TestCreator.TestPattern;
import TestCreator.TestingMashine;
import questionloader.CorrectAnswerLoader;
import questionloader.QuestionLoader;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        QuestionLoader questionLoader = new QuestionLoader();
        //questionLoader.createListOfMainQuestions();
        //questionLoader.createListOfSubQuestons();
        TestingMashine testingMashine = new TestingMashine();
        testingMashine.testPerson();





    }
}
