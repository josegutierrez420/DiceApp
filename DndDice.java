import java.util.*;

public class DndDice
{
    public static void main(final String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("What sided dice do you want to roll?");
        while(!console.hasNextInt())                                //add event to rerun process if > 20
        {
            System.out.println("Invalid, please enter a number.");
            console.next();
        }
        int sides = console.nextInt();
        System.out.println("How many times do you want to roll?");
        while(!console.hasNextLine())//add event to rerun process if > 20
        {
            System.out.println("Invalid, please enter a number.");
            console.next();
        }
        int times = console.nextInt();
        Method(times, sides);
        console.close();
    }
    public static void Method(final int x, final int y)
    {
        Random r = new Random();
        for(int i = 0; i < x; i++)
        {
            int result = r.nextInt(y) + 1;
            System.out.println("Roll #" + (i + 1) + ", d" + y + ": " + result);
        }
    }
}