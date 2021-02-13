package questionloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * загрузка из файла главных вопросов и подвопросов(предлагаемых вариантов ответа)
 */
public class QuestionLoader {

    public QuestionLoader() throws FileNotFoundException {
    }
    //добавить возможность редактирования или сохранения в папке исп. файла
    private String path = "E:\\JavaTutorial\\TestMashine\\src\\main\\java\\questionloader\\files\\АТЕРОСКЛЕРОЗ.txt";

    private File file = new File(path);
    private String stringOfTestFile = readFileToString(file);

    private List<String> listOfMainQuestions = createListOfMainQuestions();
    private List<String> listOfSubQuastions = createListOfSubQuestons();

    protected String readFileToString(File file) throws FileNotFoundException {
       Scanner scanner = new Scanner(file);
       StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
        }
        return stringBuilder.toString();
    }

    private List<String> createListOfMainQuestions() {
       Pattern pattern = Pattern.compile("\\d*[.]\\s[А-Яа-яA-Za-z ,]*:");
       Matcher matcher = pattern.matcher(stringOfTestFile);
       List<String> list = new ArrayList<String>();
       while (matcher.find()) {
           list.add(matcher.group());
       }
       return list;
    }

    private List<String> createListOfSubQuestons() {
        List<String> list1 = new ArrayList<String>();
        List<String> list = Arrays.asList(stringOfTestFile.split("\\d*[.]\\s[А-Яа-яA-Za-z ,]*:"));
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals("")) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }



    public List<String> getListOfMainQuestions() {
        return listOfMainQuestions;
    }

    public List<String> getListOfSubQuastions() {
        return listOfSubQuastions;
    }
}
