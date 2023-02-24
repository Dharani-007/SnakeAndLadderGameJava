import java.util.Random;

public class GetTheNoBetween {
    public static void main(String[] args) {
        Random rc = new Random();
        int randomNumber = (int) (Math.random() * 6) + 1;

        System.out.println("The number is " + randomNumber);
    }
}


