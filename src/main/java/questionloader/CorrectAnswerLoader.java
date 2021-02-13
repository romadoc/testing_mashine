package questionloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorrectAnswerLoader {
    public CorrectAnswerLoader() throws FileNotFoundException {
    }
    //добавить возможность редактирования или сохранения в папке исп. файла
    private String standardPath = "E:\\JavaTutorial\\TestMashine\\src\\main\\java\\questionloader\\files\\standard.txt";
    private File fileCorrectAnswer = new File(standardPath);
    QuestionLoader questionLoader = new QuestionLoader();
    String string = questionLoader.readFileToString(fileCorrectAnswer);
    String[] strings = string.split(";");

    //вход: номер теста, номер вопроса | возврат - правильный ответ
    public int createArrayOfStandardDigits(int testID, int questionNum) {
        List<Integer> standards = new ArrayList<Integer>();
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("\\s+","");
            strings[i] = strings[i].replaceAll(",", "");
        }
        String[] strValues = strings[testID].split("(?<=\\d)");
        for (int i = 0; i < strValues.length; i++ ) {
            standards.add(Integer.parseInt(strValues[i]));
        }
        return standards.get(questionNum);
    }
}
