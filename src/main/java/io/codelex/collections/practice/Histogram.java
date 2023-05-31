package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);

        int[] histogram = new int[11];


        for (String line : lines) {
            String[] scoresStr = line.split("\\s+");
            for (String scoreStr : scoresStr) {
                int score = Integer.parseInt(scoreStr);
                int index = score / 10;
                histogram[index]++;
            }
        }


        for (int i = 0; i < histogram.length; i++) {
            String range;
            if (i == 10) {
                range = "  100:";
            } else {
                range = String.format("%02d-%02d:", i * 10, (i * 10) + 9);
            }

            String asterisks = "*".repeat(histogram[i]);

            System.out.println(range + " " + asterisks);
        }
    }
}
