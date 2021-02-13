package TestCreator;

import questionloader.QuestionLoader;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * паттерн для тестирования. подается номер вопроса и выводится вопрос и List эталонных ответов к нему.
 */
public class TestPattern {

    public void showTestQuestion(int questionNumber) throws FileNotFoundException {
        QuestionLoader questionLoader = new QuestionLoader();
        String mainQuestion = questionLoader.getListOfMainQuestions().get(questionNumber);
        String answerVariants = questionLoader.getListOfSubQuastions().get(questionNumber);
        System.out.println(mainQuestion);
        System.out.println(answerVariants);

    }

}
