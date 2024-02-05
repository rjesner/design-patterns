package builder_demo;

public class BuilderDemo
{
    public static void main(String[] args)
    {
        Director director = new Director();
        IBuilder carBuilder = new Car();
        IBuilder motorBuilder = new MotorCycle();
        // Making Car
        director.Construct(carBuilder);
        Product p1 = carBuilder.GetVehicle();
        p1.Show();
        //Making MotorCycle
        director.Construct(motorBuilder);
        Product p2 = motorBuilder.GetVehicle();
        p2.Show();
    }
}