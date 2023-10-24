package Assignment9Practice;

public class FirePokemon extends Pokemon{

    //constructor for child class
    public FirePokemon(String name,  PokemonType FIRE, double attack, double health) {
        super(name, PokemonType.FIRE, attack, health);        
    }
   
    //The method is used to set the health to 0 if necessary. Remaining functionality and return is basically same as teh parent method
    @Override
    public double battleSimulation(Pokemon enemyPokemon){

        double damageCausedtoAttackedPokemon = super.battleSimulation(enemyPokemon);   
           
        double health = enemyPokemon.getHealth() - damageCausedtoAttackedPokemon;
        enemyPokemon.setHealth(health);
        if(enemyPokemon.getHealth()<0){
            enemyPokemon.setHealth(0);
        }        
        return damageCausedtoAttackedPokemon;
    }
}
