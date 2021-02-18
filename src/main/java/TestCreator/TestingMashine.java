package TestCreator;

import questionloader.QuestionLoader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestingMashine {

    public TestingMashine() throws FileNotFoundException {
    }

    List<TestPattern> testPatternList = new ArrayList<TestPattern>();
    private int quantOfQuestions = getQuantityOfQuestions();
    public void testPerson() throws FileNotFoundException {
        for (int i = 0; i < quantOfQuestions; i++) {
            TestPattern testPattern = new TestPattern();
            testPattern.showTestQuestionAndSubquastions(i);
            testPattern.setStudentAnswers(inputAnswer("type you variant"));
            testPatternList.add(testPattern);
        }
    }

    private int inputAnswer(String s) {
        s = s + " >>";
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println(s);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private int getQuantityOfQuestions() throws FileNotFoundException {
        QuestionLoader questionLoader = new QuestionLoader();
        return questionLoader.getSize();
    }

}
