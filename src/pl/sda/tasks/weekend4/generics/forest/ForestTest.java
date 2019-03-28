package pl.sda.tasks.weekend4.generics.forest;

public class ForestTest {
    public static void main(String[] args) {
        Tree lTree1 = new LeafyTree("Dąb Bartek", 450);
        Tree lTree2 = new LeafyTree("Brzoza Anna", 40);
        Tree lTree3 = new LeafyTree("Jabłoń Zośka", 2);
        Tree cTree1 = new ConiferTree("Sosna Wieśka", 112);
        Tree cTree2 = new ConiferTree("Swierk Jóżef", 166);

        Forest forest = new Forest(lTree1, lTree2, lTree3, cTree1, cTree2);
        forest.addTree(new ConiferTree("Jodła Pospolita", 33));

        System.out.println("all trees = " + forest.getTrees());
        System.out.println("conifer trees = " + forest.getConiferTrees());
        System.out.println("leafy trees = " + forest.getLeafyTrees());
        System.out.println("trees older than 100 years = " + forest.getOlderThan(100));
    }
}
