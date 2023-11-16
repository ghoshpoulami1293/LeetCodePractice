package Classwork15Practice;
import java.util.Comparator;

public class RankComparator implements Comparator<PlayingCard>{
    @Override
    public int compare(PlayingCard o1 , PlayingCard o2){
        //return <0 if o1 comes before o2
        //return 0 if o1 comes equals o2
        //return >0 if o1 comes after o2
        int diff = o1.getRank().getValue() - o2.getRank().getValue();
        if(diff ==0){
            diff = o1.getSuit().getOrder() - o2.getSuit().getOrder();
        }
        return diff;
    }
}
