package command_demo;

public class MyUndoCommand implements ICommand
{
    private Receiver receiver;

    public MyUndoCommand(Receiver recv)
    {
        receiver = recv;
    }

    @Override
    public void Do()
    {
        receiver.performUndo();
    }
}