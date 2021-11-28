    import java.util.Random;
    import java.util.Scanner;

    public class TextBasedAdventureGame {
    public class Main {
        public static void main(String[] args) {

            //System objects
            Scanner in = new Scanner(System.in);
            Random rand = new Random();

            // Game variables
            String[] enemies = {"Hypothermia", "Jaguar", "Poison", "Infection", "Starvation`"};
            int maxEnemyHealth = 75;
            int enemyAttackDamage = 25;

            //Player Variables
            int health = 100;

        }
    }
}

        class Enemy {
            public static void Jaguar() {
                String choice;
                Scanner in = new Scanner(System.in);
                choice = in.next();
                System.out.println("A wild jaguar has appeared!");
                System.out.println("What would you like to do?");
                System.out.println("1. Run");
                System.out.println("2. Fight");
                choice = in.next();



            }
        }