package Assignment9Practice;

public class Pokemon {
    private String name;
    private PokemonType type;
    private double attack;
    private double health;

     public Pokemon(String name, PokemonType type, double attack, double health) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.health = health;
    }
     public Pokemon(String name, double attack, double health) {
        this.name = name;
        this.type = PokemonType.NORMAL;
        this.attack = attack;
        this.health = health;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public PokemonType getType() {
        return type;
    }
    public void setType(PokemonType type) {
        this.type = type;
    }
    public double getAttack() {
        return attack;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
   
    //table to choose amount of damage
    public double warOfPokemonsDamageCalculator( PokemonType pokemonAttacked, PokemonType pokemonAttacker){
        //return the order of an instance of enum 
        int pokemonAttackerOrdinal = pokemonAttacker.ordinal();// attacker - pokemon 1
        int pokemonDefenderOrdinal = pokemonAttacked.ordinal();//enemy - pokemon 2

        double [][] damagecalculationTable={
            {1,1,1,1},
            {1,1,0.5,2},
            {1,2,1,0.5},
            {1,0.5,2,1}
        };       
        return damagecalculationTable[pokemonAttackerOrdinal][pokemonDefenderOrdinal]; // (attackerStrength - defenderStrength = health)
    }

    //use table to calculate the final damage
    // pokemon 1 attacks pokemon 2
    // pokemon 2 is the enemy/defender
    public double battleSimulation(Pokemon enemyPokemon){
        double attackerStrength = this.getAttack();       
        switch(this.type){
            case NORMAL:
                return attackerStrength;
            case FIRE:
                return attackerStrength * warOfPokemonsDamageCalculator(enemyPokemon.getType(), PokemonType.FIRE);
            case GRASS:
                return attackerStrength * warOfPokemonsDamageCalculator(enemyPokemon.getType(), PokemonType.GRASS);
            case WATER:
                return attackerStrength * warOfPokemonsDamageCalculator(enemyPokemon.getType(), PokemonType.WATER);
            default :
                 return attackerStrength;
        }
    } 

    public boolean consiousPokemon(){
        if(this.health>0)
        return true;        
        else return false;
    } 

    
    @Override
    public String toString() {
        return "Pokemon [name=" + this.name + 
                        ", type=" + this.type + 
                        ", attack=" + this.attack + 
                        ", health=" + this.health + 
                        "]";
    }
    
}
