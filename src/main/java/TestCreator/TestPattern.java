package TestCreator;


import questionloader.QuestionLoader;
import java.io.FileNotFoundException;

/**
 * паттерн для тестирования. подается testID, номер вопроса и выводится вопрос и List эталонных ответов к нему.
 * на ввод - ответы тестируемого, формирование массива ответа студента.
 */
public class TestPattern {
    private QuestionLoader questionLoader = new QuestionLoader();
    private int testID; //id теста
    private int studentAnswer; // ответ на вопрос (id теста и номер вопроса) тестируемого


    public TestPattern() throws FileNotFoundException {
    }

    public void showTestQuestionAndSubquastions(int questionNumber) throws FileNotFoundException {
        //на вход номер вопроса из теста. в консоль - вопрос и варианты ответов
        String mainQuestion = questionLoader.getListOfMainQuestions().get(questionNumber);
        String answerVariants = questionLoader.getListOfSubQuastions().get(questionNumber);
        System.out.println(mainQuestion);
        System.out.println(answerVariants);

    }

    public void setTestID(int testID) {
        this.testID = testID;
    }

    public int getTestID() {
        return testID;
    }

    public int getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswers(int studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

}
