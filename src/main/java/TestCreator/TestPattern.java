package TestCreator;

import questionloader.CorrectAnswerLoader;
import questionloader.QuestionLoader;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * паттерн для тестирования. подается номер вопроса и выводится вопрос и List эталонных ответов к нему.
 */
public class TestPattern {
     private QuestionLoader questionLoader = new QuestionLoader();
     private CorrectAnswerLoader correctAnswerLoader = new CorrectAnswerLoader();
     private int testID;

    public TestPattern() throws FileNotFoundException {
    }

    public void showTestQuestion(int questionNumber) throws FileNotFoundException {

        String mainQuestion = questionLoader.getListOfMainQuestions().get(questionNumber);
        String answerVariants = questionLoader.getListOfSubQuastions().get(questionNumber);
        System.out.println(mainQuestion);
        System.out.println(answerVariants);

    }

    private List<Integer> getlistOfAnswerStandarts() {
        return correctAnswerLoader.createArrayOfStandardDigits(testID);

    }

}
