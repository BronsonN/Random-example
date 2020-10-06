// Standard import for the Scanner class
import java.util.*;
public class Randoms {
    public static void main (String [] args) {
        // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);
        Random r = new Random();
        int die1, die2;
        die1 = r.nextInt (6)+1;
        die2 = r.nextInt (6)+1;
        System.out.printf ("Die 1 = %d Die 2 = %d%n", die1, die2);
    }
}
