package pl.sda.tasks.weekend2.encapsulation.family_tree;

/**
 *  2. Dodaj do klas utworzonych w zadaniu na początku zajęć (drzewo genealogiczne)
 *     odpowiednie modyfikatory dostępu na poziomie pól, konstruktorów i metod.
 */
public class FamilyTest {
    public static void main(String[] args) {
        Person husbandFather = new Person("Stanislaw", "Kowalski", 77);
        Person husbandMother = new Person("Zofia", "Kowalska", 75);
        Person wifeFather = new Person("Władysław", "Matuszak", 69);
        Person wifeMother = new Person("Stefania", "Matuszak", 71);
        Person husband = new Person("Jan", "Kowalski", 50);
        Person wife = new Person("Marta", "Kowalska", 44);
        Person daughter = new Person("Ola", "Kowalska", 18);
        Person son = new Person("Mateusz", "Kowalski", 14);
        Family kowalscy = new Family("Rodzina Kowalskich", husbandFather, husbandMother, wifeFather, wifeMother, husband, wife, daughter, son);
        System.out.println(kowalscy.toString());
        System.out.println();

        husbandFather = new Person("Zdzisław", "Nowak", 81);
        husbandMother = new Person("Weronika", "Nowak", 86);
        wifeFather = new Person("Stefan", "Mróz", 59);
        wifeMother = new Person("Leontyna", "Mróz", 55);
        husband = new Person("Marian", "Nowak", 47);
        wife = new Person("Urszula", "Nowak", 41);
        daughter = new Person("Gosia", "Nowak", 10);
        son = new Person("Marcink", "Nowak", 12);
        Family nowak = new Family("Rodzina Nowaków", husbandFather, husbandMother, wifeFather, wifeMother, husband, wife, daughter, son);
        System.out.println(nowak.toString());
    }
}
