package Assignment9Practice;

import java.util.Scanner;

public class Arena {   
       
        public static void battle(Pokemon pokemon1, Pokemon pokemon2){
            System.out.println("Pokemon 1:");
            System.out.println(pokemon1);

            System.out.println("Pokemon 2:");
            System.out.println(pokemon2);

        Scanner scanner = new Scanner(System.in);        

        while (pokemon1.consiousPokemon() && pokemon2.consiousPokemon()) {
            // Pokemon 1 attacks Pokemon 2:            
            // pokemon 2 is the enemy/defender
            // poekmon 1 is the attacker
            double pokemon1attackPokemon2 = pokemon1.battleSimulation(pokemon2);
            System.out.println(pokemon1.getName() + " attacked" + pokemon2.getName() + " causing damage =" + pokemon1attackPokemon2);
            System.out.println(pokemon2.getName() + " remaining health: " + pokemon2.getHealth());

            // Check if Pokemon 2 is knocked out
            if (!pokemon2.consiousPokemon()) {
                System.out.println(pokemon2.getName() + " is knocked out!");
                break;
            } 
            
            System.out.print("Continue battle? Please enter (Y/N): ");
            String input = scanner.next();
            if (!input.equals("Y")) {
                break;
            }
        }
        scanner.close();
    }
}