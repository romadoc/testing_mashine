package TestCreator;

import questionloader.CorrectAnswerLoader;
import questionloader.QuestionLoader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestingMashine {

    protected List<TestPattern> listOfAnswers = new ArrayList<TestPattern>();
    int score = 0;
    private int quantOfQuestions = getQuantityOfQuestions();

    public TestingMashine() throws FileNotFoundException {
    }

    public void testPerson() throws FileNotFoundException {
        for (int i = 0; i < quantOfQuestions; i++) {
            TestPattern testPattern = new TestPattern();
            testPattern.showTestQuestionAndSubquastions(i);
            testPattern.setStudentAnswers(inputAnswer("type you variant"));
            listOfAnswers.add(testPattern);
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
        //getting quantity of quastions in test
        QuestionLoader questionLoader = new QuestionLoader();
        return questionLoader.getSize();
    }

    public void compareAnswerAndStandards() throws FileNotFoundException {

        List<Integer> incorrectanswers = new ArrayList<Integer>();
        for (int i = 0; i < listOfAnswers.size(); i++) {
            int studentAnswer = listOfAnswers.get(i).getStudentAnswer();
            CorrectAnswerLoader correctAnswerLoader = new CorrectAnswerLoader();
            int correct = correctAnswerLoader.createArrayOfStandardDigits(0).get(i);
            if (studentAnswer == correct) {
                score++;
            } else {
                incorrectanswers.add(i+1);
            }

        }
        System.out.println();
        System.out.println("you score is: " + score);
        System.out.println("incorrect answers in question(s): " + incorrectanswers);

    }

}
