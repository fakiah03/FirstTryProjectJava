import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String red = "\u001B[31m";
        String reset = "\u001B[0m";
        String Answer1 = "samantha";
        String Answer2 = "chickenburg";
        String Answer3 = "zibblezorp";
        String Answer4 = "dancing";
        String Answer5 = "cupcakes";
        String Answer6 = "platypus";
        String Answer7 = "YIKES!";
        String Answer8 = "Speenkle!";
        System.out.println("WELCOME TO MAD LIBS GAME!");
        System.out.println("THE GREAT ADVENTURE\n");

        System.out.printf("%-70s\n", "One day, ________(1), a sparkly explorer, packed her ");
        System.out.printf("%-70s\n", "toaster and set off to the mysterious land of ______(2).");
        System.out.printf("%-70s\n", "She had heard that exactly 47 years ago,");
        System.out.printf("%-70s\n", "a great treasure called the _____(3) was hidden there by ancient ______(4) monks.");
        System.out.printf("%-70s\n", "As she trekked through the jungle filled with ______(5),");
        System.out.printf("%-70s\n", "she was suddenly ambushed by a giant _______(6)");
        System.out.printf("%-70s\n", "______(7) she screamed, leaping behind a tree.");
        System.out.printf("%-70s\n", "But instead of attacking, the platypus handed her a map and said,");
        System.out.printf("%-70s\n", "_______(8) in a very polite voice.");
        System.out.printf("%-70s\n", "With a shrug, Samantha continued her journey, munching on marshmallows");
        System.out.printf("%-70s\n", "and humming a tune.And that’s how she began the weirdest adventure of her life\n");

        System.out.println("*****************************************************************************");
        System.out.println("*   samantha    chickenburg    zibblezorp    dancing   cupcakes   platypus  *");
        System.out.println("*                         YIKES!              Speenkle!                     *");
        System.out.println("*****************************************************************************\n");

        System.out.println("Enter your Answer");
        System.out.println("1 : ");
        Answer1 = scanner.nextLine();
        // use if else statement
        System.out.println("2 : ");
        Answer2 = scanner.nextLine();
        System.out.println("3 : ");
        Answer3 = scanner.nextLine();
        System.out.println("4 : ");
        Answer4 = scanner.nextLine();
        System.out.println("5 : ");
        Answer5 = scanner.nextLine();
        System.out.println("6 : ");
        Answer6 = scanner.nextLine();
        System.out.println("7 : ");
        Answer7 = scanner.nextLine();
        System.out.println("8 :");
        Answer8 = scanner.nextLine();

        if (Answer1 == "samantha") {
            Answer1 = Answer1;
        } else {
            Answer1 = red + " \"samantha\" " + reset;
        }

        if (Answer2 == "chickenburg") {
            Answer2 = Answer2;
        } else {
            Answer2 = red + " \"chickenburg\" " + reset;
        }

        if (Answer3 == "zibblezorp") {
            Answer3 = Answer3;
        } else {
            Answer3 = red + " \"zibblezorp\" " + reset;
        }

        if (Answer4 == "dancing") {
            Answer4 = Answer4;
        } else {
            Answer4 = red + " \"dancing\" " + reset;
        }

        if (Answer5 == "cupcakes") {
            Answer5 = Answer5;
        } else {
            Answer5 = red + " \"cupcakes\" " + reset;
        }

        if (Answer6 == "platypus") {
            Answer6 = Answer6;
        } else {
            Answer6 = red + " \"platypus\" " + reset;
        }

        if (Answer7 == "YIKES!") {
            Answer7 = Answer7;
        } else {
            Answer7 = red + " \"YIKES!\" " + reset;
        }


        if (Answer8 == "Speenkle!") {
            Answer8 = Answer8;
        } else {
            Answer8 = red + " \"Speenkle!\" " + reset;
        }


        System.out.printf("%-70s\n", "One day, " + Answer1 + " , a sparkly explorer, packed her ");
        System.out.printf("%-70s\n", "toaster and set off to the mysterious land of  " + Answer2 + ".");
        System.out.printf("%-70s\n", "She had heard that exactly 47 years ago,");
        System.out.printf("%-70s\n", "a great treasure called the  " + Answer3 + " was hidden there by ancient  " + Answer4 + " monks.");
        System.out.printf("%-70s\n", "As she trekked through the jungle filled with  " + Answer5 + ",");
        System.out.printf("%-70s\n", "she was suddenly ambushed by a giant  " + Answer6);
        System.out.printf("%-70s\n", Answer7 + " she screamed, leaping behind a tree.");
        System.out.printf("%-70s\n", "But instead of attacking, the platypus handed her a map and said,");
        System.out.printf("%-70s\n", Answer8 + " in a very polite voice.");
        System.out.printf("%-70s\n", "With a shrug, Samantha continued her journey, munching on marshmallows");
        System.out.printf("%-70s\n", "and humming a tune.And that’s how she began the weirdest adventure of her life\n");




        

    }
}
