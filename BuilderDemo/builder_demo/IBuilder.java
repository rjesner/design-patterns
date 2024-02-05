package builder_demo;

public interface IBuilder
{
    public void BuildBody();
    public void InsertWheels();
    public void AddHeadlights();
    public Product GetVehicle();
}