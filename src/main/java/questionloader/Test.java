package questionloader;

import TestCreator.TestPattern;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        QuestionLoader questionLoader = new QuestionLoader();
        //questionLoader.createListOfMainQuestions();
        //questionLoader.createListOfSubQuestons();
        TestPattern testPattern = new TestPattern();
        testPattern.showTestQuestion(1);
        questionLoader.createListOfCorrectAnswers();




    }
}
