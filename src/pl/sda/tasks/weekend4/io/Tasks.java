package pl.sda.tasks.weekend4.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:", "workspace", "io_tasks", "name.txt");

        //writeToFile(path, "Jarosław Skarżyński");

        //String fromFile = readFromFile(path);
        //System.out.println("fromFile = " + fromFile);

        //copy(path, path.resolveSibling("copy.txt"));
        //copy(path.resolveSibling("image.png"), path.resolveSibling("copy.png"));

        //Path pathToWords = path.resolveSibling("words.txt");
        //writeToFile(pathToWords, "Filemon;Maurycy;Jan;Zenek;Ola;Kasia;Filemon;Maurycy;Ewa;Robert;Maurycy;Szymon;Jan;Maurycy;Filemon;Ewa");
        //Map<String, Integer> stringIntegerMap = analyzeFile(pathToWords, ";");
        //System.out.println("words statistics = " + stringIntegerMap);

        //Path folderWithNumbers = path.resolveSibling("folder_with_numbers");
        //createsFolders(folderWithNumbers);
    }

    /**
     * 3. Napisz kod, który zapisze do pliku Twoje imię i nazwisko.
     */
    private static void writeToFile(Path path, String name) throws IOException {
        Files.createDirectories(path.getParent());
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(name);
        }
    }

    /**
     * 4. Napisz kod, który odczyta plik tekstowy i wyświetli jego zawartość na konsoli.
     */
    private static String readFromFile(Path path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String firstLine;
            while ((firstLine = reader.readLine()) != null) {
                stringBuilder.append(firstLine).append("\n");
            }
        }

        return stringBuilder.toString();
    }

    /**
     * 5. Napisz kod, który skopiuje zawartość dowolnego pliku (tekstowego lub binarnego) do drugiego pliku .
     */
    private static void copy(Path from, Path to) throws IOException {
        try (InputStream inputStream = Files.newInputStream(from);
             BufferedInputStream fromStream = new BufferedInputStream(inputStream);
             OutputStream outputStream = Files.newOutputStream(to);
             BufferedOutputStream toStream = new BufferedOutputStream(outputStream)) {
            byte[] bytes = new byte[100];
            int count;
            while ((count = fromStream.read(bytes)) != -1) {
                byte[] bytesToWrite = Arrays.copyOf(bytes, count);
                toStream.write(bytesToWrite);
            }
        }
    }

    /**
     * 8. Napisz kod, który przeanalizuje podany plik tekstowy oraz utworzy statystykę występowania poszczególnych słów w odczytanym tekście.
     * Zadbaj o odpowiednią obsługę wyjątków. Daj możliwość podania separatora poszczególnych słów.
     */
    private static Map<String, Integer> analyzeFile(Path path, String delimiter) {
        Map<String, Integer> wordsStatistics = new HashMap<>();
        try (Scanner scanner = new Scanner(path.toFile())) {
            scanner.useDelimiter(delimiter);
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordsStatistics.putIfAbsent(word, 0);
                Integer oldValue = wordsStatistics.get(word);
                wordsStatistics.put(word, ++oldValue);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return wordsStatistics;
    }

    /**
     * 9. Napisz kod, który stworzy:
     *    - 10 katalogów o nazwach 0, 100, 200, …, 900.
     *    - w każdym z katalogów stwórz 10 plików z nazwami odpowiadającymi poszczególnym dziesiątkom liczb - czyli
     *    np. w katalogu 0 będą się znajdować pliki: 1-10.txt, 11-20.txt, … a w katalogu 200: 200-210.txt, 211-220.txt.
     *    - w każdym pliku zapisz sumę liczb z zakresu który wskazuje nazwa pliku, np. w pliku 0-10.txt powinna się pojawić liczba: 55.
     */
    private static void createsFolders(Path root) {
        try {
            for (int i = 0; i < 10; i++) {
                String folderName = String.valueOf(i * 100);
                Path folder = root.resolve(folderName);
                Files.createDirectories(folder);

                for (int j = 0; j < 10; j++) {
                    int from = (i * 100) + (j * 10) + 1;
                    int to = from + 9;
                    String fileName = String.format("%s-%s.txt",from, to);
                    Path file = folder.resolve(fileName);
                    if(Files.notExists(file)) {
                        Files.createFile(file);
                    }

                    int sum = 0;
                    while(from <= to) {
                        sum+= from;
                        from++;
                    }

                    writeToFile(file, String.valueOf(sum));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}