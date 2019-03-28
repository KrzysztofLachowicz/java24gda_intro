package pl.sda.tasks.weekend4.generics.forest;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 7. Utwórz klasę Forest która będzie zawierała zbiór różnego rodzajów drzew (liściastych i iglastych - dodaj odpowiednie klasy).
 * Dodaj metody, które zwrócą wszystkie drzewa, tylko liściaste albo tylko iglaste.
 * Dodaj metodę, która zwróci drzewa starsze niż podany parametr.
 */
public class Forest {
    private Set<Tree> trees = new HashSet<>();

    public Forest(Tree... trees) {
        for (Tree tree : trees) {
            this.trees.add(tree);
        }
    }

    public Forest addTree(Tree tree) {
        trees.add(tree);
        return this;
    }

    public Set<Tree> getTrees() {
        return trees;
    }

    public Set<Tree> getOlderThan(int minAge) {
        return trees.stream()
                .filter(tree -> tree.getAge() > minAge)
                .collect(Collectors.toSet());
    }

    public Set<LeafyTree> getLeafyTrees() {
        Set<LeafyTree> leafyTrees = new HashSet<>();
        for (Tree tree : trees) {
            if(tree instanceof LeafyTree) {
                leafyTrees.add((LeafyTree) tree);
            }
        }

        return leafyTrees;
    }

    public Set<ConiferTree> getConiferTrees() {
        Set<ConiferTree> coniferTrees = new HashSet<>();
        for (Tree tree : trees) {
            if(tree instanceof ConiferTree) {
                coniferTrees.add((ConiferTree) tree);
            }
        }

        return coniferTrees;
    }
}
