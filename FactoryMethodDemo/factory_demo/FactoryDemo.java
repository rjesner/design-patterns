package factory_demo;

public class FactoryDemo {
    public static void main(String[] args) throws Exception
    {
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal DuckType = animalFactory.GetAnimalType("Duck");
        DuckType.Speak();
        IAnimal TigerType = animalFactory.GetAnimalType("Tiger");
        TigerType.Speak();
        //There is no Lion type. So, an exception will be thrown
        IAnimal LionType = animalFactory.GetAnimalType("Lion");
        LionType.Speak();
    }
}
