package pl.sda.io.exercices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LiveCoding {
    public static void main(String[] args) {
        //symboliczne odwołania
        Path folder = Paths.get("..\\.\\..\\.");
        System.out.println("baseFolder = " + folder);
        System.out.println("baseFolder = " + folder.toAbsolutePath());
        try {
            System.out.println("baseFolder = " + folder.toRealPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //tworzenie Path do konkretnego katalogu
        Path baseFolder = Paths.get("C:\\io_test");
        System.out.println("baseFolder = " + baseFolder);

        try {
            //sprawdzanie i tworzenie katalogu na dysku
            if(Files.exists(baseFolder.getParent()) && !Files.exists(baseFolder)) {
                Files.createDirectory(baseFolder);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path = baseFolder.resolve("text.txt");
        try {
            //sprawdzanie i tworzenie pliku na dysku
            if(!Files.exists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            //wyciąganie wszystkich plików/katalogów z aktualnego katalogu (bez zagnieżdżania)
            Stream<Path> stream = Files.list(baseFolder);
            List<Path> pathList = stream.collect(Collectors.toList());
            for (Path path1 : pathList) {
                System.out.println("path = " + path1.toAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            //wyciąganie wszystkich plików/katalogów z aktualnego katalogu (+ podkatalogi)
            Stream<Path> stream = Files.walk(baseFolder);
            List<Path> pathList = stream.collect(Collectors.toList());
            for (Path path1 : pathList) {
                System.out.println("path = " + path1.toAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
