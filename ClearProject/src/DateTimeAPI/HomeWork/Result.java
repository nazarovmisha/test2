package DateTimeAPI.HomeWork;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Result {
    public static void main(String[] args) {
        final Path text = Paths.get("d:\\result.txt");

        try {
            final List<String> listMonkey = Files.readAllLines(text, Charset.defaultCharset());

          final  List<String> sort = listMonkey
                    .stream()
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            sort.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}