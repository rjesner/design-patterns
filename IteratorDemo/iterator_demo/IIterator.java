package iterator_demo;

public interface IIterator
{
    public void First();
    public String Next();
    public Boolean IsDone();
    public String CurrentItem();
}