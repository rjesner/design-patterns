package decorator_demo;

public class ConcreteDecoratorEx_1 extends AbstractDecorator
{
    public void doJob()
    {
        super.doJob();
        System.out.println("I am explicitly from Ex_1");
    }
}