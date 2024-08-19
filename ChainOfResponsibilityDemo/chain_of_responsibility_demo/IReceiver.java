package chain_of_responsibility_demo;

public interface IReceiver
{
    Boolean ProcessMessage(Message msg);
}