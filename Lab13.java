import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab13 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, содержащую IP-адрес:");
        String inputString = scanner.nextLine();

        
        Pattern pattern = Pattern.compile(
                "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}");

        Matcher matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            
            FileWriter fileWriter = new FileWriter("result13.txt");
            fileWriter.write(matcher.group());
            fileWriter.close();
        } else {
            
            FileWriter fileWriter = new FileWriter("result13.txt");
            fileWriter.write("IP_Zapican_ne_pravilno");
            fileWriter.close();
        }
    }
}
