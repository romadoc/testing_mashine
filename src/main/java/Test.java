import TestCreator.TestPattern;
import questionloader.CorrectAnswerLoader;
import questionloader.QuestionLoader;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        QuestionLoader questionLoader = new QuestionLoader();
        //questionLoader.createListOfMainQuestions();
        //questionLoader.createListOfSubQuestons();
        TestPattern testPattern = new TestPattern();
        testPattern.showTestQuestion(9);
        CorrectAnswerLoader answerLoader = new CorrectAnswerLoader();
        answerLoader.createArrayOfStandardDigits(1,0);





    }
}
