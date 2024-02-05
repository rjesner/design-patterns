package command_demo;

public class MyRedoCommand implements ICommand
{
    private Receiver receiver;

    public MyRedoCommand(Receiver recv)
    {
        receiver = recv;
    }

    @Override
    public void Do()
    {
        receiver.performRedo();
    }
}