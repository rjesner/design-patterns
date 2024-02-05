package template_demo;

public class TemplateMethodDemo
{
    public static void main(String[] args)
    {
        BasicEngineering bs = new ComputerScience();
        System.out.println("Computer Sc Papers:");
        bs.Papers();
        System.out.println();
        bs = new Electronics();
        System.out.println("Electronics Papers:");
        bs.Papers();
    }
}
