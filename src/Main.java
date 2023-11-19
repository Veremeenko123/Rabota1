import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Веремеенко
public class Main {
    public static void main(String[] args) {
        int number = 0;
        String numberSum;
        int sum = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("F://МДК//text.txt"))) {
            String line;
            String boldText = "\u001B[1mОценка меньше 3-х баллов: \u001B[0m";
            System.out.println(boldText + "\n");
            while ((line = bufferedReader.readLine()) != null) {
                number++;
                numberSum = line.replaceAll("\\D", "");
                sum = sum + Integer.parseInt(numberSum);
                System.out.println(numberSum);

                System.out.println("Общий балл" + sum);
            }
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}