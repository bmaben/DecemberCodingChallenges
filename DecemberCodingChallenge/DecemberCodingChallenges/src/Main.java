
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main mainInstance = new Main();
        mainInstance.decemberOne();
    }


        public void decemberOne() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("website.txt"));
                String line;
                int firstNumber;
                int secondNumber;
                int numbersAdded;
                int totalSum = 0;
                while ((line = reader.readLine()) != null) {
                    String lineNoLetters = line.replaceAll("[^0-9]", "");
                    if (!lineNoLetters.isEmpty()) {
                        firstNumber = Character.getNumericValue(lineNoLetters.charAt(0));
                        secondNumber = Character.getNumericValue(lineNoLetters.charAt((lineNoLetters.length() - 1)));
                        int concat = Integer.parseInt(String.valueOf(firstNumber) + String.valueOf(secondNumber));
                        totalSum += concat;

                    }
                }
                reader.close();
                System.out.println(totalSum);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }