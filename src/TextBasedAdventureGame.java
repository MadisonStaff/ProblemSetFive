    import java.util.Random;
    import java.util.Scanner;

    public class TextBasedAdventureGame {
    public class Main {
        public static void main(String[] args) {

            //System objects
            Scanner in = new Scanner(System.in);
            Random rand = new Random();

            // Game variables
            String[] enemies = {"Hypothermia", "Jaguar", "Poison", "Starvation"};


        }
    }
// A return statement of 1 means the player dies a return statement of 2 means the player survives.
        public static int Jaguar() {
            int choice;
            Scanner in = new Scanner(System.in);
            System.out.println("A wild jaguar has appeared!");
            System.out.println("What would you like to do?");
            System.out.println("1. Run");
            System.out.println("2. Fight");
            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("The jaguar chased you down, and you died.");
                return 1;
            } else {
                System.out.println("You hit the jaguar over the head with a rock, and it ran away!");
                return 2;
            }
        }
    }

        class Enemy {
            public static int Hypothermia() {
                int choice;
                Scanner in = new Scanner(System.in);
                System.out.println("Your fingers are turning blue you have hypothermia. What would you like to do?");
                System.out.println("1. ignore it");
                System.out.println("2. build a shelter ");

            }
    }

