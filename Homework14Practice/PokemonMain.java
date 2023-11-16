package Homework14Practice;

import java.util.Comparator;

public class PokemonMain implements BinarySearchTree<Pokemon> {
    /**
     * Creates a binary tree with your favorite Pokémon at the root and a new PokemonComparator.
       Insert at least 10-15 more Pokémon in any order.
       Use your StringVisitor to stringify the binary tree and print the string.
       They should print in reverse order by number (from largest to smallest)
    *
    */
    private BinaryNode<Pokemon> rootNode;
    private int size;
    private Comparator<Pokemon> comparator;

    public PokemonMain(Comparator<Pokemon> comparator) {
        rootNode = null;
        size = 0;
        this.comparator = comparator;
    }

    /*insert Pokemon in tree*/
        @Override
        public void insert(Pokemon pokemon) {
            if (rootNode == null) {
                rootNode = new BinaryNode<>(pokemon, comparator);
            } else {
                rootNode.binaryInsert(rootNode, pokemon);
            }
            size++;
        }

     /*returns size of the Pokemon BST */
        @Override
        public int size() {
            return size;
        }

    /* search Pokemon in tree*/
    @Override
    public boolean search(Pokemon targetPokemon) {
        if (rootNode == null) {
            return false;
        } else {
            return rootNode.binarySearch(rootNode, targetPokemon);
        }
    }

    /**Traverses the Pokemon Tree */
    @Override
    public void infixTraversal(Visitor visitor) {
        if (rootNode != null) {
            rootNode.infixTraversal(visitor);
        }
    }

    @Override
    public String toString() {
        return "rootnode - " + rootNode.getValue() + " size : " + size;
    }

    public static void main(String[] args) {

        Comparator<Pokemon> comparator = new PokemonComparator();
        BinarySearchTree<Pokemon> pokemonTree = new PokemonMain(comparator);

        Pokemon pokemon1 = new Pokemon("Pikachu", 25);
        Pokemon pokemon2 = new Pokemon("Charizard",50);
        Pokemon pokemon3 = new Pokemon("Caterpie",100);
        Pokemon pokemon4 = new Pokemon("Bulbasaur",65);
        Pokemon pokemon5 = new Pokemon("Charmander", 40);
        Pokemon pokemon6 = new Pokemon("Venusaur",78);
        Pokemon pokemon7 = new Pokemon("Rattata",49);       
        Pokemon pokemon8 = new Pokemon("Arcanine",12);
        Pokemon pokemon9 = new Pokemon("Wartortle",26);
        Pokemon pokemon10 = new Pokemon("Ivysaur",46);
        Pokemon pokemon11 = new Pokemon("Bellsprout",62);
        Pokemon pokemon12 = new Pokemon("Metapod",86);
        Pokemon pokemon13 = new Pokemon("Zubat",79);
        Pokemon pokemon14 = new Pokemon("Blastoise",42);
        Pokemon pokemon15 = new Pokemon("Squirtle",34);
        

        pokemonTree.insert(pokemon1);
        pokemonTree.insert(pokemon2);
        pokemonTree.insert(pokemon3);
        pokemonTree.insert(pokemon4);
        pokemonTree.insert(pokemon5);
        pokemonTree.insert(pokemon6);
        pokemonTree.insert(pokemon7);
        pokemonTree.insert(pokemon8);
        pokemonTree.insert(pokemon9);
        pokemonTree.insert(pokemon10);
        pokemonTree.insert(pokemon11);
        pokemonTree.insert(pokemon12);
        pokemonTree.insert(pokemon13);
        pokemonTree.insert(pokemon14);
        pokemonTree.insert(pokemon15);

        System.out.println(pokemonTree);

        System.out.println(pokemonTree.search(new Pokemon("Blastoise", 42)));
        System.out.println(pokemonTree.search(new Pokemon("Bellsprout", 62)));
        System.out.println(pokemonTree.search(new Pokemon("Bulbasaur", 65)));
        System.out.println(pokemonTree.search(new Pokemon("Pikachu", 25)));
        System.out.println(pokemonTree.search(new Pokemon("Ivysaur", 46)));
        System.out.println(pokemonTree.search(new Pokemon("Arcanine",12)));

        StringyfyVisitor stringify = new StringyfyVisitor();
        pokemonTree.infixTraversal(stringify);
        System.out.println(stringify);


        System.out.println();

        // passing null as the Comparator
        BinarySearchTree<Pokemon> pokemonTreeAnother = new PokemonMain(null);

        pokemonTreeAnother.insert(pokemon1);
        pokemonTreeAnother.insert(pokemon2);
        pokemonTreeAnother.insert(pokemon3);
        pokemonTreeAnother.insert(pokemon4);
        pokemonTreeAnother.insert(pokemon5);
        pokemonTreeAnother.insert(pokemon6);
        pokemonTreeAnother.insert(pokemon7);
        pokemonTreeAnother.insert(pokemon8);
        pokemonTreeAnother.insert(pokemon9);
        pokemonTreeAnother.insert(pokemon10);
        pokemonTreeAnother.insert(pokemon11);
        pokemonTreeAnother.insert(pokemon12);
        pokemonTreeAnother.insert(pokemon13);
        pokemonTreeAnother.insert(pokemon14);
        pokemonTreeAnother.insert(pokemon15);

        System.out.println(pokemonTreeAnother);

        System.out.println(pokemonTree.search(new Pokemon("Bulbasaur", 65)));
        System.out.println(pokemonTree.search(new Pokemon("Zubat",79)));
        System.out.println(pokemonTree.search(new Pokemon("Ivysaur", 46)));
        System.out.println(pokemonTree.search(new Pokemon("Wartortle",26)));

        StringyfyVisitor stringify2 = new StringyfyVisitor();
        pokemonTreeAnother.infixTraversal(stringify2);
        System.out.println(stringify2);
    }
}
    