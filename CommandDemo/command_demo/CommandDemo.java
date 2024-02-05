package command_demo;

public class CommandDemo
{
    public static void main(String[] args)
    {
        Receiver intendedreceiver = new Receiver();
        Invoke inv = new Invoke();
        MyUndoCommand unCmd = new MyUndoCommand(intendedreceiver);
        MyRedoCommand reCmd = new MyRedoCommand(intendedreceiver);
        inv.ExecuteCommand(unCmd);
        inv.ExecuteCommand(reCmd);
    }
}