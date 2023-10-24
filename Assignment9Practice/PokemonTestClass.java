package Assignment9Practice;
import java.util.Random;
import java.util.Scanner;

public class PokemonTestClass
 {
    public static void main(String[] args) {        
    
     Scanner scanner = new Scanner(System.in);
     Random random = new Random();

        while (true) 
        {
            
            // Generate two random Pokémon
            String[] names = {"Pikachu", "Bergmite", "Blissey", "Alakazam"};
            String randomName1 = names[random.nextInt(names.length)];
            String randomName2 = names[random.nextInt(names.length)];

            // Generate two random Type
            PokemonType[] type = {PokemonType.NORMAL, PokemonType.FIRE,PokemonType.GRASS,PokemonType.WATER};
            PokemonType randomType1 = type[random.nextInt(type.length)];
            PokemonType randomType2 = type[random.nextInt(type.length)];

            // Attack between 50 and 100            
            int randomAttack1 = random.nextInt(50) + 50 ;
            int randomAttack2 = random.nextInt(50) + 50;

            // Health between 500 and 1000
            int randomHealth1 = random.nextInt(500) + 500; 
            int randomHealth2 = random.nextInt(500) + 500;

            FirePokemon pokemon1 = new FirePokemon(randomName1, randomType1, randomAttack1, randomHealth1);
            GrassPokemon pokemon2 = new GrassPokemon(randomName2, randomType2, randomAttack2, randomHealth2);

            // Start the battle in the Arena
            System.out.println("\nStarting a battle!");
            Arena.battle(pokemon1, pokemon2);

            // Ask the user if they want to continue
            System.out.print("\nDo you want to watch another battle? (Y/N): ");
            if (scanner.hasNext()) {
                String input = scanner.next();
                if (input.equalsIgnoreCase("N")) {
                    System.out.println("Goodbye!");
                    break;
                }
            } else {
                System.out.println("Goodbye!");
                break; 
            }
        }
        scanner.close();
       }
   }

//end of  class PokemonTestClass
