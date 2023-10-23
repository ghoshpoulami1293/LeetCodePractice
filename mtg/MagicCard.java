package mtg;

public class MagicCard {
    private String name ;
    //the amount of damage dealt to other cards when attacking.
    private double power;
    //the amount of damage the card can sustain
    private double toughness;
    //one of four possible values
    private Rarity rarity;
    //string representing the mana value of a Magic card
    private String manaValue;

    private boolean isDiscarded;

    public String getManaValue() {
        return manaValue;
    }
    public String getName() {
        return name;
    }public double getPower() {
        return power;
    }public Rarity getRarity() {
        return rarity;
    }public double getToughness() {
        return toughness;
    }

    public void setManaValue(String manaValue) {
        this.manaValue = manaValue;
    }public void setName(String name) {
        this.name = name;
    }public void setPower(double power) {
        this.power = power;
    }public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }public void setToughness(double toughness) {
        this.toughness = toughness;
    }public void setDiscarded(boolean isDiscarded) {
        this.isDiscarded = isDiscarded;
    }


    //costructor
    MagicCard(String name, double power, double toughness, Rarity rairity,String manaValue){
        this.name=name;
        this.manaValue=manaValue;
        this.power= power;
        this.toughness=toughness;
        this.rarity= rairity;
        this.isDiscarded= false;
    }

    /*returns an integer representing the amount of mana needed to cast a card,
     i.e. Shivan Dragon at 4RR would be 6- 4 generic mana, and 1 each for the red mana.
     */
    public int getConvertedManaCost(String manaValue){
        int integerManaValue =0 ;
        int length = manaValue.length();
        int firstVal =manaValue.charAt(0);
        integerManaValue = firstVal + (length-1);
        return integerManaValue;
    }

    /**this method will deal damage equal to the card's power, 
     * and should compare that number to the toughness of the blocker to see if it should be discarded 
    **/
   public boolean attack(MagicCard blocker){
    
    this.toughness = getConvertedManaCost(this.manaValue);
    double blockerToughness = getConvertedManaCost(blocker.manaValue);
    this.power=(this.toughness - blockerToughness );
     if(this.power>=0){
        this.isDiscarded= true;
     }else this.isDiscarded=false;
    return this.isDiscarded;
    }

   @Override
   public String toString(){
        return ("Name: " + this.name+
                "\npower : " +this.power + 
                "\ntoughness : " +this.toughness + 
                "\nmanaValue : " +this.manaValue);
    }
}
