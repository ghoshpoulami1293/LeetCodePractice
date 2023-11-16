package Homework14Practice;

import java.util.Comparator;

public class PokemonComparator implements Comparator<Pokemon>{

    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        return o2.getValue()-o1.getValue();
    }
}
