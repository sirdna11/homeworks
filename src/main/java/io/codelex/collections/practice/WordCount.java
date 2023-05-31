package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);

        int wordCount = 0;
        int charCount = 0;

        for (String line : lines) {
            String[] words = line.split("\\s+");
            wordCount += words.length;

            for (String word : words) {
                charCount += word.length();
            }
        }

        System.out.println("Lines = " + lines.size());
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);
    }
}
