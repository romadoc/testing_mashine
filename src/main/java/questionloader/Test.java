package questionloader;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        QuestionLoader questionLoader = new QuestionLoader();
        //questionLoader.createListOfMainQuestions();
        questionLoader.createListOfSubQuestons();
    }
}
