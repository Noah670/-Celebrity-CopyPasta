import java.util.Scanner;

/* game that will tell a very epic story based on your suggested words 
*
*   Celeberity copypasta meme format 
*/

public class MadLads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give me a celeberity name:");
        String name = input.nextLine();

        System.out.println("Give me a location:");
        String location = input.nextLine();

        System.out.println("give me a weapon");
        String userWeapon = input.nextLine();

        System.out.println("give me an adjective ");
        String userAdjective = input.nextLine();

        System.out.println("I saw " + name + " at a grocery store in " + location + " yesterday.");
        System.out.println(
                "I told him how cool it was to meet him in person, but I didn\'t want to be a douche and bother him and ask him for photos or anything.");
        System.out.println();
        System.out.println("He said,\"Oh, like you\'re doing now?\"");
        System.out.println();
        System.out.println(
                "I was taken aback, and all I could say was \" Huh?\" but he kept cutting me off and going \"huh? huh? huh?\"");
        System.out.println(
                "and closing his hand shut in front of my face. I walked away and continued with my shopping, and I heard him chuckle as I walked off.");
        System.out.println(
                "When I came to pay for my stuff up front I saw him trying to walk out the doors with like fifteen Milky Ways in his hands without paying.");
        System.out.println();
        System.out.println(
                "The girl at the counter was very nice about it and professional, and was like \"Sir, you need to pay for");
        System.out.println(
                "those first.\" At first he kept pretending to be tired and not hear her, but eventually turned back around and brough them to the counter");
        System.out.println();
        System.out.println(
                "When she took one of the bars and started scanning it multiple times, he stopped her and told her to scham them each");
        System.out.println(
                "individually \"to prevent any electrical infetterence,\" and then turned around and winked at me.");
        System.out.println(
                "I don\'t even think that\'s a word. After she scanned each bar and put them in a bag and started to say the price, he kept interrupting her by yawning really loudly.");

    }
}