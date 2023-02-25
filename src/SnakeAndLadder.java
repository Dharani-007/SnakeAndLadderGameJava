public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Game");
        int startPos = 0;
        int random = (int) (Math.random() * 10);
        int dice = (random % 6) + 1;
        int option = random % 3;
        int value = random % 6;

        int i = 0;
        int noplay = 0;
        int ladder = 1;
        int snake = 2;
        while (i <= 20)
            while (i <= 100) {
                if (dice == noplay) {
                    System.out.println("No Play" + i);
                } else if (option == ladder) {
                    i = i + value;
                    System.out.println("Ladder" + i);
                } else {
                    i = i - value;
                    System.out.println("snake" + i);
                }
                //- Note In case the player position moves
                //below 0, then the player restarts from 0
                i = i - value;
                if (i < 0) {
                    i = 0;
                    System.out.println("snake" + i);
                } else {
                    System.out.println("snake" + i);
                }
                System.out.println("player rolls die and get value=" + i);
                System.out.println("Dice Roll =" + value);

            }

    }
}
