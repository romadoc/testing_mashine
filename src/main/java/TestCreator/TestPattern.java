package TestCreator;

import questionloader.QuestionLoader;

import java.io.FileNotFoundException;

/**
 * паттерн для тестирования. подается номер вопроса и выводится вопрос и варианты ответов к нему.
 */
public class TestPattern {
    private int studentAnswer;

    public void showTestQuestion(int questionNumber) throws FileNotFoundException {
        QuestionLoader questionLoader = new QuestionLoader();
        String mainQuestion = questionLoader.createListOfMainQuestions().get(questionNumber);
        String subquestionsOfMainQuestion = questionLoader.createListOfSubQuestons().get(questionNumber);
        System.out.println(mainQuestion);
        System.out.println(subquestionsOfMainQuestion);

    }

}
