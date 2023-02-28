import java.util.Random;
public class RepeatPlayers {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        int position = 0;
        Random ran = new Random();
        int dice = ran.nextInt(6)+1;
        System.out.println("dice: "+dice);
        int optionCheck = ran.nextInt(3);
        System.out.println("optionCheck: "+optionCheck);

        if (optionCheck == LADDER) {
            System.out.println("ladder!!!");
            position = position + dice;
        }
        // snake and the player's position is greater than the value of the dice,
        // the program subtracts the value of the dice from the player's position

        else if (optionCheck == SNAKE && position > dice) {
            System.out.println("snake!!!");
            position = position - dice;
        }

        else {
            System.out.println("noPlay!!!");
            position = position;
        }
        System.out.println("position: "+position);
        while (position<100) {
            Random rc = new Random();
            dice = (int) (Math.random() * 6) + 1;
            System.out.println("dice: "+dice);
            optionCheck = (int) (Math.random() * 3);
            System.out.println("optionCheck: "+optionCheck);


            if (optionCheck == LADDER) {
                System.out.println("ladder!!!");
                position = position + dice;
            }
            else if (optionCheck == SNAKE) {
                System.out.println("snake!!!");
                position = position - dice;
            }
            else {
                System.out.println("noPlay!!!");
                position = position;
            }
            if (position<0) {
                position =0;
            }
            System.out.println("position: "+position);
        }
    }

}
