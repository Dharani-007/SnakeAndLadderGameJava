
import java.util.Random;

public class ReportTheNoOftimestheDice {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static int diceCount = 0;

    public static void main(String[] args) {
        int position = 0;
        System.out.println("position: " + position);

        while (position < 100) {
            Random ran = new Random();
            int dice = (int) (Math.random() * 6) + 1;
            System.out.println("dice: " + dice);
            //The program initializes a variable called diceCount to keep track of the number of times the dice is rolled.
            ++diceCount;
            int optionCheck = (int) (Math.random() * 3);
            System.out.println("optionCheck: " + optionCheck);


            if ((optionCheck == LADDER) && (position + dice) <= 100) {
                System.out.println("ladder!!!");
                position = position + dice;
            } else if (optionCheck == SNAKE) {
                System.out.println("snake!!!");
                position = position - dice;
            } else {
                System.out.println("noPlay!!!");
                position = position;
            }
            //If the position becomes negative due to a SNAKE option, the program sets the position to 0.
            if (position < 0) {
                position = 0;
            }

            System.out.println("position: " + position);

            System.out.println("position: " + position + "\ndicecount: " + diceCount);

        }
    }

}