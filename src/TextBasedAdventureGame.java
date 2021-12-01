    import java.util.Random;
    import java.util.Scanner;

    public class TextBasedAdventureGame {
        public static void main(String[] args) {

            //System objects
            Scanner in = new Scanner(System.in);
            Random rand = new Random();
            int j = 0;
            int score = 0;
            boolean running = true;


            // Game variables
            String[] enemies = {"Hypothermia", "Jaguar", "Venom", "Starvation"};
            System.out.println("You are stranded in the jungle!");


            // GAME:
            while (running) {
                System.out.println("-------------------------------------------------");
                System.out.println("The choices you make will decide if you survive. Choose wisely. ");
                int choice = Jaguar();

                // call the method Jaguar()
                if (choice == 1) {
                    System.out.println("-----DEATH------");
                    System.out.println("You have lost the possible point for this round.");
                    break;
                }
                if (choice == 2) {
                    System.out.println("You survived to the next obstacle!");
                    score++;
                    break;
                }
                if (Jaguar() == 3) {

                }

            }
            while (running) {
                int choice = Venom();
                // call the method Venom here
                if (choice == 1) {
                    System.out.println("-----DEATH------");
                    System.out.println("You have lost the possible point for this round.");
                    break;
                }
                if (choice == 2) {
                    System.out.println("You survived to the next obstacle!");
                    score++;
                    break;
                }
                if (Venom() == 3) {
                }

            }

        //call the method Starvation here
            while (running) {
            int choice = Starvation();
            if (choice == 1) {
                System.out.println("-----DEATH------");
                System.out.println("You have lost the possible point for this round.");
                break;
            }
            if (choice == 2) {
                System.out.println("You survived to the next obstacle!");
                score++;
                break;
            }
            else if (Starvation() == 3) {
            }
        }
            while (running)
        {
            int choice = Hypothermia();

            /**
            call method hypothermia here
             */

            if (choice == 1) {
                System.out.println("-----DEATH------");
                System.out.println("You have lost the possible point for this round.");
                break;
            }
            if (choice == 2) {
                System.out.println("You survived to the next obstacle!");
                score++;
            }
            if (Hypothermia() == 3) {
            }
        }
            System.out.println("------CONGRATULATIONS-------");
            System.out.println("You have made it to the end of the Jungle challenge!");
            System.out.println("your score is "+((score /4)*100)+"%");

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
            } else if (choice == 2) {
                System.out.println("You hit the jaguar over the head with a rock, and it ran away!");
                return 2;
            }
            else {
                return 3;// invalid return statement
            }
        }

        public static int Venom() {
            int choice;
            Scanner in = new Scanner(System.in);
            System.out.println("Tststststs. You have come across a fierce rattlesnake. What should you do?");
            System.out.println("1. Pick up the sword to your left and fight it");
            System.out.println("2. Run away");
            choice = in.nextInt();
            if (choice == 2) {
                System.out.println("You are running away, but the snake has caught up. It has bitten you in the leg and" +
                        "you perish from its venom");
                return 1;
            } if (choice == 1){
                System.out.println("You grab the sword. In one fowl swoop, you slay the snake and are unscathed");
                return 2;
            }
            else {
                return 3;
            }
        }

        public static int Starvation() {
            int choice;
            Scanner in = new Scanner(System.in);
            System.out.println("You haven't eaten in two days and need to find food. What would you like to do?");
            System.out.println("1. Make a spear and kill wild boar.");
            System.out.println("2. Eat wild berries in the jungle.");
            System.out.println("3. Make a fishing pole to catch tuna. ");
            System.out.println("4. Do nothing.");

            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("You regain enough energy to improve shelter.");
                return 2;
            } else if (choice == 2) {
                System.out.println("The berries were poisonous and you died.");
                return 1;
            } else if (choice == 3) {
                System.out.println("You have a little more energy but are still need more food.");
                return 2;
            } else if (choice == 4) {
                System.out.println("You died from starvation.");
                return 1;
            } else {
                return 3;
            }

        }



            public static int Hypothermia() {
                int choice;
                Scanner in = new Scanner(System.in);
                System.out.println("Your fingers are turning blue you have hypothermia. What would you like to do?");
                System.out.println("1. ignore it");
                System.out.println("2. build a shelter ");
                System.out.println("3. insulate the ground with leaves");
                choice = in.nextInt();
                if (choice == 1) {
                    System.out.println("You ignored it, and you died.");
                    return 1;
                }
                else if (choice == 2) {
                    System.out.println("You built a shelter to stay warm!");
                    return 2;
                }
                else if (choice == 3) {
                    System.out.println("You insulated the ground with leaves to stay warm!");
                    return 2;
                }
                else {
                    return 3;
                }
            }
        }



