import java.util.*;

public class DndDice
{
    public static void main(String[] args)
    {
        //declaring and initializing variables
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        int sides = 0, times = 0;
        //call methods
        sides = DieSides(console, sides);
        times = DieRoll(console, times);
        DieResult(sides, times, r);
    }
    //Asking user what type of die to use
    public static int DieSides(Scanner a, int x)
    {
        System.out.println("What sided dice do you want to roll?");
        while(!a.hasNextInt())
        {
            System.out.println("Please type in a numeric value");
        }
        x = a.nextInt();
        return x;
    }
    //Asking user how many times they want to roll the die/dice
    public static int DieRoll(Scanner b, int y)
    {
        System.out.println("How many times do you want to roll?");
        while(!b.hasNextInt())
        {
            System.out.println("Please type in a numeric value");
        }
        y = b.nextInt();
        return y;
    }
    //Returning roll results
    public static void DieResult(int w, int z, Random r1)
    {
        for(int i = 0; i > z; i++)
        {
            int result = r1.nextInt(z) + 1;
            System.out.println("Roll #" + (i + 1) + ", d" + w + ": " + result);
        }
    }
}