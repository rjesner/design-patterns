package factory_demo;

public class Duck implements IAnimal
{
    @Override
    public void Speak()
    {
        System.out.println("Duck says Pack-pack");
    }
}