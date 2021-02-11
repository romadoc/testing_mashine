package questionloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionLoader {

    public QuestionLoader() throws FileNotFoundException {
    }

    private String path = "E:\\JavaTutorial\\TestMashine\\src\\main\\java\\questionloader\\files\\АТЕРОСКЛЕРОЗ.txt";
    private String standardPath = "E:\\JavaTutorial\\TestMashine\\src\\main\\java\\questionloader\\files\\standard.txt";


    File file = new File(path);
    String stringOfTestFile = readFileToString(file);

    List<String> listOfMainQuestions = createListOfMainQuestions();
    List<String> listOfSubQuastions = createListOfSubQuestons();

    private File file1 = new File(standardPath);
    private String stringOfStandards = readFileToString(file1);

    int[] standards = createListOfCorrectAnswers();

    private String readFileToString(File file) throws FileNotFoundException {
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
        List<String> list = Arrays.asList(stringOfTestFile.split("\\d*[.]\\s[А-Яа-я ,]*:"));
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals("")) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }


    private int[] createListOfCorrectAnswers() {
        String[] standards = stringOfStandards.split("\\D+");
        int[] numOfStandarts = new int[10];
        for (int i = 0; i < numOfStandarts.length; i++) {
            numOfStandarts[i] = Integer.parseInt(standards[i]);
        }
        return numOfStandarts;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getStandards() {
        return standards;
    }

    public List<String> getListOfMainQuestions() {
        return listOfMainQuestions;
    }

    public List<String> getListOfSubQuastions() {
        return listOfSubQuastions;
    }
}
