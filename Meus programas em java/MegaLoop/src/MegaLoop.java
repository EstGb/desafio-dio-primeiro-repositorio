import java.util.Random;

public class MegaLoop {
    public static void main(String[] args) {

        Random generate = new Random();
        int x=0;
        // While -> Por enquanto, ou seja enquanto ele for verdadeiro, vai ficar execultando
        while (x<6) {
            int number = generate.nextInt(60);

            System.out.println(number);
            x++;
        }


    }
}
