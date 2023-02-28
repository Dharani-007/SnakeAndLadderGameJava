import java.util.Random;

public class GetTheNoBetween1to6 {
    public static void main(String[] args) {

        int postion = 0;
        Random rc = new Random();
        int randomNumber = (int) (Math.random() * 6) + 1;

        System.out.println("The number is " + randomNumber);
    }
}





