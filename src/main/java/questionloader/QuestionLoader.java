package questionloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionLoader {

    public QuestionLoader() throws FileNotFoundException {
    }

    private String path = "E:\\JavaTutorial\\TestMashine\\src\\main\\java\\questionloader\\files\\АТЕРОСКЛЕРОЗ.txt";


    File file = new File(path);
    String stringOfTestFile = readFileToString(file);
    List<String> listOfMainQuestions = createListOfMainQuestions();
    List<String> listOfSubQuastions = createListOfSubQuestons();


    private String readFileToString(File file) throws FileNotFoundException {
       Scanner scanner = new Scanner(file);
       StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
        }
        return stringBuilder.toString();

    }

    public List<String> createListOfMainQuestions() {
       Pattern pattern = Pattern.compile("\\d*[.]\\s[А-Яа-яA-Za-z ,]*:");
       Matcher matcher = pattern.matcher(stringOfTestFile);
       List<String> list = new ArrayList<String>();
       while (matcher.find()) {
           list.add(matcher.group());
       }
       return list;
    }

    public List<String> createListOfSubQuestons() {
        List<String> list = Arrays.asList(stringOfTestFile.split("\\d*[.]\\s[А-Яа-я ,]*:"));
        return list;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


}
