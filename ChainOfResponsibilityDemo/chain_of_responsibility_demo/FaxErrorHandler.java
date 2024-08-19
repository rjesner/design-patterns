package chain_of_responsibility_demo;

public class FaxErrorHandler implements IReceiver
{
    private IReceiver _nextReceiver;

    public FaxErrorHandler(IReceiver nextReceiver)
    {
        _nextReceiver = nextReceiver;
    }
    public Boolean ProcessMessage(Message msg)
    {
        if(msg.Text.contains("Fax"))
        {
            System.out.println("FaxErrorHandler processed " + "priority issue: "+ msg.Text);
            return true;
        }
        else
        {
            if(_nextReceiver != null) {
                _nextReceiver.ProcessMessage(msg);
            }
        }
        return false;
    }
}