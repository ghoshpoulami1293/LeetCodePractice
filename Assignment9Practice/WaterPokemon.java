package Assignment9Practice;

public class WaterPokemon extends Pokemon{

    public WaterPokemon(String name, PokemonType WATER,double attack, double health) {
        super(name,PokemonType.WATER, attack, health);        
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
