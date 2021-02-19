package questionloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * вход: номер теста | возврат - List правильных ответов к тесту
 */
public class CorrectAnswerLoader {
    public CorrectAnswerLoader() throws FileNotFoundException {
    }
    //добавить возможность редактирования пути к файлу ответов или сохранения этого файла в папке программы
    private String standardPath = "E:\\JavaTutorial\\TestMashine\\src\\main\\java\\questionloader\\files\\standard.txt";
    private File fileCorrectAnswer = new File(standardPath);
    QuestionLoader questionLoader = new QuestionLoader();
    String string = questionLoader.readFileToString(fileCorrectAnswer);
    String[] strings = string.split(";");

    public List<Integer> createArrayOfStandardDigits(int testId) {
        //создается лист эталонов ответов
        List<Integer> standards = new ArrayList<Integer>();
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("\\s+","");
            strings[i] = strings[i].replaceAll(",", "");
        }
        String[] strValues = strings[testId].split("(?<=\\d)");
        for (int i = 0; i < strValues.length; i++ ) {
            standards.add(Integer.parseInt(strValues[i]));
        }
        return standards;
    }


}
