package pl.sda.tasks.weekend2.encapsulation.family_tree;

public class Family {
    private String name;
    private Person husbandFather;
    private Person husbandMother;
    private Person wifeFather;
    private Person wifeMother;
    private Person husband;
    private Person wife;
    private Person son;
    private Person daughter;

    public Family(String name, Person husbandFather, Person husbandMother, Person wifeFather, Person wifeMother, Person husband, Person wife, Person daughter, Person son) {
        this.name = name;
        this.husbandFather = husbandFather;
        this.husbandMother = husbandMother;
        this.wifeFather = wifeFather;
        this.wifeMother = wifeMother;
        this.husband = husband;
        this.wife = wife;
        this.son = son;
        this.daughter = daughter;
    }

    public Person getHusbandFather() {
        return husbandFather;
    }

    public Person getHusbandMother() {
        return husbandMother;
    }

    public Person getWifeFather() {
        return wifeFather;
    }

    public Person getWifeMother() {
        return wifeMother;
    }

    public Person getHusband() {
        return husband;
    }

    public Person getWife() {
        return wife;
    }

    public Person getSon() {
        return son;
    }

    public Person getDaughter() {
        return daughter;
    }

    @Override
    public String toString() {
        return String.format("%s (suma lat: %d, średnia wieku: %.2f)%n" +
                                   "\t rodzice męża: %30s %30s%n" +
                                   "\t rodzice żony: %30s %30s%n" +
                                   "\t   mąż i żona: %30s %30s%n" +
                                   "\t       dzieci: %30s %30s",
                        name, getSumOfYearsOfLive(), getAverageAge(),
                        husbandFather, husbandMother, wifeFather, wifeMother, husband, wife, son, daughter
        );
    }

    public int getSumOfYearsOfLive() {
        return husbandFather.getAge() + husbandMother.getAge() +
               wifeFather.getAge() + wifeMother.getAge() +
               husband.getAge() + wife.getAge() +
               daughter.getAge() + son.getAge();
    }

    public double getAverageAge() {
        return getSumOfYearsOfLive() / 8.0;
    }
}
