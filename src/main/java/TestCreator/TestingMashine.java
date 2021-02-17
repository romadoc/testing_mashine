package TestCreator;

import questionloader.QuestionLoader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestingMashine {

    public TestingMashine() throws FileNotFoundException {
    }

    private int testId;
    private int score;
    List<TestPattern> testPatternList = new ArrayList<TestPattern>();
    private int quantOfQuestions = getQuantityOfQuestions();
    private void testPerson() throws FileNotFoundException {
        for (int i = 0; i < quantOfQuestions; i++) {
            TestPattern testPattern = new TestPattern();
            testPattern.showTestQuestionAndSubquastions(i);
            testPattern.setStudentAnswers(inputAnswer());
            testPatternList.add(testPattern);
        }
    }

    private int inputAnswer() {
        String s = ">>";
        System.out.println(s);

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println(s);
        }

        return scanner.nextInt();
    }

    private int getQuantityOfQuestions() throws FileNotFoundException {
        QuestionLoader questionLoader = new QuestionLoader();
        return questionLoader.getSize();
    }






}
