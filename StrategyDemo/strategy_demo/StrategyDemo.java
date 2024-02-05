package strategy_demo;


import java.io.IOException;
import java.util.Scanner;

public class StrategyDemo
{
    public static void main(String[] args) throws IOException
    {
        Scanner in= new Scanner(System.in);
        IChoice ic = null;
        Context cxt = new Context();
        String input1,input2;;
        System.out.println("Enter an integer:");
        input1 = in.nextLine();
        System.out.println("Enter another integer:");
        input2 = in.nextLine();
        System.out.println("Enter ur choice(1 or 2)");
        System.out.println("Press 1 for Addition, 2 for Concatenation");
        String c = in.nextLine();
        if (c.equals("1"))
        {
            ic = new FirstChoice();
        }
        else
        {
            ic = new SecondChoice();
        }
        cxt.SetChoice(ic);
        cxt.ShowChoice(input1,input2);
        System.out.println("End of Strategy pattern");
    }
}
