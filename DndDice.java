import java.util.*;

public class DndDice
{
    public static void main(final String[] args)
    {
        final Scanner console = new Scanner(System.in);
        System.out.println("What sided dice do you want to roll?");
        final int sides = console.nextInt();
        if(sides > 20)
        {
            System.out.println("Amount is too high, choose a different amount.");
        }
        System.out.println("How many times do you want to roll?");
        final int times = console.nextInt();
        if(times > 20)
        {
            System.out.println("Amount is too high, choose a different amount.");
        }
        Method(times, sides);
        console.close();
    }
    public static void Method(final int x, final int y)
    {
        final Random r = new Random();
        for(int i = 0; i < x; i++)
        {
            final int result = r.nextInt(y) + 1;
            System.out.println("d" + y + ": " + result);
        }
    }
}