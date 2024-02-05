package memento_demo;

class MementoDemo
{
    public static void main(String[] args)
    {
        Originator o = new Originator();
        o.setState("First state");
        // Holding old state
        Caretaker c = new Caretaker();
        c.SaveMemento(o.OriginatorMemento());
        //Changing state
        o.setState("Second state");
        // Restore saved state
        o.Revert(c.RetrieveMemento());
    }
}