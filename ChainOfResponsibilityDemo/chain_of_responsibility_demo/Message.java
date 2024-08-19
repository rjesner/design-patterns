package chain_of_responsibility_demo;

public class Message
{
    public String Text;
    public MessagePriority Priority;

    public Message(String msg, MessagePriority p)
    {
        Text = msg;
        this.Priority = p;
    }
}