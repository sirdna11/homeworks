package io.codelex.test.test4;

import java.io.*;

public class FileReverse {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Andris\\Desktop\\homeworks\\src\\main\\java\\io\\codelex\\test\\test4\\text.txt";

        try {

            File inputFile = new File(filePath);
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            String reversedContent = content.reverse().toString();
            String reversedTitle = new StringBuilder(inputFile.getName()).reverse().toString();


            String outputFilePath = inputFile.getParent() + File.separator + reversedTitle;
            FileWriter fileWriter = new FileWriter(outputFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(reversedContent);


            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("File reversed and saved successfully.");
            System.out.println("Reversed file path: " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}