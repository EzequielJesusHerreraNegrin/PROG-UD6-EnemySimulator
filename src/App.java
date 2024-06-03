import java.util.Scanner;

import com.minecraft.entities.characters.Character;
import com.minecraft.entities.noCharacters.hostileMods.kinds.endermans.Endermans;
import com.minecraft.entities.noCharacters.hostileMods.kinds.zombies.Zombi;
import com.minecraft.entities.noCharacters.noHostileMods.kinds.sheep.Sheep;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int intputDefense = 0;
        int intputStrengh = 0;
        String option = "";
        String welcomeMessage = """
            \nWelcome to 
            ************ MINECRAFT ************ 
            1. Choose a weapon
            2. Choose an armor
            3. Arena
            4. Exit
            ***********************************
            Choose an option:
                """;
                String weaponTable = """
                    \nCHOOSE A WEAPON
                    |++++++++++++++++|++++++++++++++|
                    |     Weapons    |   Strength   |
                    |++++++++++++++++|++++++++++++++|   
                    |      None      |      1       |
                    |                |              |
                    |   Long Sword   |      2       |
                    |                |              |
                    |   Iron sword   |      3       |
                    |                |              |
                    |  Diamond Sword |      5       |
                    |++++++++++++++++|++++++++++++++|
                    """;
                    String armorTable = """
                        \nCHOOSE YOUR ARMOR
                        |++++++++++++++++|++++++++++++++|
                        |     Armors     |   Defense    |
                        |++++++++++++++++|++++++++++++++|   
                        |   0. None      |      0       |
                        |                |              |
                        |  1. lether     |      1       |
                        |                |              |
                        |   2. Iron      |      2       |
                        |                |              |
                        |  3. Diamond    |      3       |
                        |++++++++++++++++|++++++++++++++|
                        """;
                        String enemiTable = """
                            \nCHOOSE YOUR ENEMY
                            |++++++++++++++++|
                            |     Enemy      |
                            |++++++++++++++++|
                            |    Enderman    |
                            |                |
                            |     Zombie     |
                            |                |
                            |     Sheep      |
                            |++++++++++++++++|
                            """;
                            
                            while (option != "4") {
                                System.out.println(welcomeMessage);
                                option = scanner.next();
                                
                                switch (option) {
                                    case "1":
                    System.out.println(weaponTable);
                    String intput = scanner.next();
                    switch (intput) {
                        case "1":
                        intputStrengh = 1;
                        break;
                        
                        case "2":
                        intputStrengh = 2;
                        break;
                        
                        case "3":
                        intputStrengh = 3;
                        break;
                        
                        case "4":
                        intputStrengh = 5;
                        break;
                        
                        default:
                        System.out.println("thats not a valid input.");
                            break;
                        }
                        
                        case "2":
                        System.out.println(armorTable);
                        intputDefense = scanner.nextInt();
                        break;
                        
                        case "3":
                        System.out.println(enemiTable);
                        String inputEnemy = scanner.next();
                        Character character = new Character(intputDefense, intputStrengh);
                        int turn = 0;
                        int turnCounter = 0;
                        String winner;
                        switch (inputEnemy) {
                            case "1":
                                Endermans enderman = new Endermans(14, 6);
                                while (character.getHealth() > 0 && enderman.getHealth() > 0) {
                                    if (turn == 0) {
                                        character.attact(enderman);
                                        turn = 1;
                                    } else {
                                        int action = (int) Math.round(Math.random() * 10);
                                        if (action % 2 == 0) {
                                            enderman.attact(enderman);
                                        } else {
                                            enderman.move();
                                        }
                                        turn = 0;
                                    }
                                    turnCounter++;
                                }
                                winner = character.getHealth() != 0 ? "Character" : "Enderman";
                                System.out.println("\nWinner: "+winner+" Rounds: "+turnCounter);
                                break;
                                
                            case "2":
                                Zombi zombi = new Zombi(10, 4);
                                while (character.getHealth() > 0 && zombi.getHealth() > 0) {
                                    if (turn == 0) {
                                        character.attact(zombi);
                                        turn = 1;
                                    } else {
                                        int action = (int) Math.round(Math.random() * 10);
                                        if (action % 2 == 0) {
                                            zombi.attact(zombi);
                                        } else {
                                            zombi.move();
                                        }
                                    }
                                    turnCounter++;
                                }
                                winner = character.getHealth() != 0 ? "Character" : "Zombi";
                                System.out.println("\nWinner: "+winner+" Rounds: "+turnCounter);
                                break;
                        
                            case "3":
                                Sheep sheep = new Sheep(5);
                                while (character.getHealth() > 0 && sheep.getHealth() > 0) {
                                    if (turn == 0) {
                                        character.attact(sheep);
                                        turn = 1;
                                    } else {
                                        int action = (int) Math.round(Math.random() * 10);
                                        if (action % 2 == 0) {
                                            sheep.move();
                                        }                                   }
                                    turnCounter++;
                                }
                                winner = character.getHealth() != 0 ? "Character" : "Sheep";
                                System.out.println("\nWinner: "+winner+" Rounds: "+turnCounter);
                                break;
                        
                            default:
                                break;
                    }
                    break;
                default:
                    System.out.println("thats not a valid input.");
                    break;
            }
        }
        scanner.close();
    }
}
