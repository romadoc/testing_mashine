package questionloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionLoader {

    public QuestionLoader() throws FileNotFoundException {
    }

    private String path = "E:\\JavaTutorial\\TestMashine\\StudentTest\\src\\questionloader\\files\\АТЕРОСКЛЕРОЗ.txt";

    // "\d.+:" загрузка главного вопроса
    // "\d.+\." загрузка вариантов ответа
    File file = new File(path);
    String testFile = readFileToString(file);


    private String readFileToString(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String s = "";
        while (scanner.hasNextLine()) {
            s = scanner.nextLine();
        }
        return s;

    }

    public void createListOfQuestions(){
        System.out.println("loader");
        Pattern pattern = Pattern.compile("\\d.+:");
        Matcher matcher = pattern.matcher(testFile);
        List<String> mainQuestion = new ArrayList<String>();
        if (matcher.find()) {
            mainQuestion.add(matcher.group());
        }
        for (String st: mainQuestion) {
            System.out.println(st + "; ");
        }

    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
