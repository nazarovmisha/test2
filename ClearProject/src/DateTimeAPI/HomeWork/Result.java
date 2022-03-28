package DateTimeAPI.HomeWork;
//Создайте файл result.txt в текущей директории со следующим содержимым:
// "duck", "duck", "duck", "goose","monkey", "gorilla", "bonobo","mama gorilla", "baby gorilla"

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Result {
    public static void main(String[] args) {
       final Path text = Paths.get("result.txt");
       try {
           Files.copy(Paths.get("result.txt"),Paths.get("resultSorted.txt"));

       } catch (IOException e) {}
        try {
           final List<String> sorted = Files.readAllLines(text, Charset.defaultCharset());
            final List < String[] > sortedNames = sorted.stream()
                    .map(s -> {
                        final String[] split = s.split(",");
                        return new String[] {
                                split[0],
                                split.length > 1 ? split[1].trim() : ""
                        };
                    })
                    .sorted().distinct().collect(Collectors.toList())
                    .

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    }

