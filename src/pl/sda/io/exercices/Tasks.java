package pl.sda.io.exercices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Tasks {
    private static final Path TEST_FOLDER = Paths.get("C:/workspace/io_test");

    public static void main(String[] args) {
        //#1
        //createTestFolders();

        //#2
        //listFoldersAndFiles();

        //#3
        //deleteFiles();

        //#4
        //writeAndReadWithFiles();

        //#5
        writeAndReadObjectsWithFiles();
    }

    /**
     * 1. Stwórz katalog testowy do ćwiczeń z systemem plików.
     * Wybierz katalog główny i stwórz w nim 3 foldery (A, B, C) i pliki (I.txt, II.txt)
     * W folderze A dodaj dwa podfoldery: A1 i A2.
     * Przenieś plik I.txt do folderu B
     * Skopiuj plik II.txt do folderów: A, A2, B i C
     */
    private static void createTestFolders() {
        System.out.println("TEST_FOLDER = " + TEST_FOLDER.toAbsolutePath());

        Path folderA = TEST_FOLDER.resolve("folderA");
        Path folderA1 = folderA.resolve("folderA1");
        Path folderA2 = folderA.resolve("folderA2");
        Path folderB = TEST_FOLDER.resolve("folderB");
        Path folderC = TEST_FOLDER.resolve("folderC");
        Path fileI = TEST_FOLDER.resolve("I.txt");
        Path fileII = TEST_FOLDER.resolve("II.txt");

        try {
            Files.createDirectories(folderA);
            Files.createDirectories(folderA1);
            Files.createDirectories(folderA2);
            Files.createDirectories(folderB);
            Files.createDirectories(folderC);

            if(Files.notExists(fileI)){
                Files.createFile(fileI);
            }
            if(Files.notExists(fileII)) {
                Files.createFile(fileII);
            }

            //Przenieś plik I.txt do folderu B
            Files.move(fileI, folderB.resolve(fileI.getFileName()));

            //Skopiuj plik II.txt do folderów: A, A2, B i C
            Files.copy(fileII, folderA.resolve(fileII.getFileName()));
            Files.copy(fileII, folderA2.resolve(fileII.getFileName()));
            Files.copy(fileII, folderB.resolve(fileII.getFileName()));
            Files.copy(fileII, folderC.resolve(fileII.getFileName()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 2. Wypisz na konsolę ścieżki do wszystkich folderów i podfolderów z katalogu testowego
     * Następnie wypisz wszystkie pliki znajdujące się w folderze B
     */
    private static void listFoldersAndFiles() {
        try {
            Stream<Path> pathStream = Files.walk(TEST_FOLDER);
            pathStream
                    .filter(Files::isDirectory)
                    .forEach(System.out::println);

            System.out.println("---------------");

            pathStream = Files.list(TEST_FOLDER.resolve("folderB"));
            pathStream.filter(Files::isRegularFile)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 3. Usuń katalog C z katalogu bazowego
     */
    private static void deleteFiles() {
        try {
            Path folderC = TEST_FOLDER.resolve("folderC");

            Stream<Path> pathStream = Files.list(folderC);
            pathStream.forEach(path -> {
                try {
                    Files.delete(path);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            Files.delete(folderC);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 4. Zapisz kilka linijek tekstu do pliku A/II.txt
     * Następnie odczytaj tekst i wyświetl w konsoli.
     */
    private static void writeAndReadWithFiles() {
        Path filePath = TEST_FOLDER.resolve("II.txt");

        try(BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            writer.write("Hello");
            writer.newLine();
            writer.write("World\nSDA");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = Files.newBufferedReader(filePath)) {
            int read = 0;
            while((read = reader.read()) != -1) {
                System.out.println("read = " + (char) read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 5. Utwórz obiekt klasy Student.
     * Zapisz wartości pól ze stworzonego obiektu do pliku: {nazwa_studenta}.txt znajdującego się w folderze A/A1
     * Następnie odczytaj wartości z pliku i na ich podstawie stwórz nowy obiekt klasy Student.
     */
    private static void writeAndReadObjectsWithFiles() {
        Student student = new Student(14, "Jan Kowalski", "Fizyka kwantowa");
        String fileName = student.getName().toLowerCase().replace(" ", "_");
        fileName+= ".txt";
        Path path = TEST_FOLDER.resolve("folderA").resolve("folderA1").resolve(fileName);

        try(BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(String.valueOf(student.getId()));
            writer.write(";");
            writer.write(student.getName());
            writer.write(";");
            writer.write(student.getDepartment());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = Files.newBufferedReader(path)) {
            String firstLine = reader.readLine();
            String[] parts = firstLine.split(";");
            int id = Integer.valueOf(parts[0]);
            String name = parts[1];
            String department = parts[2];

            Student newStudent = new Student(id, name, department);
            System.out.println("newStudent = " + newStudent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
