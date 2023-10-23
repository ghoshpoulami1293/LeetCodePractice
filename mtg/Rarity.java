package mtg;

enum Rarity{

    //Enumerate the three possible rarities of Magic cards, with the values being the frequency at which they appear in a pack
    COMMON(11),
    UNCOMMON(3),
    RARE(1);

    int frequency;
    public boolean isDiscarded;

    Rarity(int frequency){
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    
}