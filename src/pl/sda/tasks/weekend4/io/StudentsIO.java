package pl.sda.tasks.weekend4.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class StudentsIO {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student(1, "Marta", "Matematyka"));
        students.add(new Student(3, "Łukasz", "Fizyka"));
        students.add(new Student(6, "Marcin", "Informatyka"));
        students.add(new Student(11, "Ala", "Botanika"));

        Path path = Paths.get("C:/workspace/io_tasks/students.txt");
        //writeStudents(path, students);

        Set<Student> readStudents = readStudents(path);
        System.out.println("readStudents = " + readStudents);
    }

    /**
     * 6. Napisz kod, który zapisze do pliku kolekcję obiektów typu Student.
     * Zadbaj o własny format zapisu danych w postaci tekstowej.
     * Każdy obiekt powinien być zapisany w nowej linii.
     */
    private static void writeStudents(Path path, Set<Student> students) {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Student student : students) {
                writer.write(String.valueOf(student.getId()));
                writer.write(";");
                writer.write(student.getName());
                writer.write(";");
                writer.write(student.getDepartment());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 7. Napisz kod, który wczyta dane z pliku utworzonego w punkcie 6 oraz utwórzy z nich kolekcję obiektów typu Student.
     */
    private static Set<Student> readStudents(Path path) {
        Set<Student> students = new HashSet<>();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while((line = reader.readLine()) != null) {
                if (line == null || line.isEmpty()) {
                    break;
                }
                String[] parts = line.split(";");
                int id = Integer.valueOf(parts[0]);
                String name = parts[1];
                String department = parts[2];

                Student student = new Student(id, name, department);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
