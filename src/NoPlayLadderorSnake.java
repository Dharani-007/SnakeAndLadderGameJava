import java.util.Random;

public class NoPlayLadderorSnake {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        // initializes two variables
        int postion = 0;
        int position = 0;
        //generates a random number between 1 and 6
        Random ran = new Random();
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("dice: " + dice);
        // another random number between 0 and 2
        int optionCheck = (int) (Math.random() * 3);
        System.out.println("optionCheck: " + optionCheck);

        //if-else statements to check value of optionCheck, determine what action to take
        if (optionCheck == LADDER) {
            System.out.println("ladder!!!");
            position = position + dice;
        } else if (optionCheck == SNAKE && position > dice) {
            System.out.println("snake!!!");
            position = position - dice;
        } else {
            System.out.println("noPlay!!!");
            position = position;
        }
        System.out.println("position: " + position);
    }

}
