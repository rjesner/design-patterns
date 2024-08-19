package chain_of_responsibility_demo;

public class ChainOfResponsibilityDemo
{
    public static void main(String[] args)
    {
        System.out.println("***Chain of Responsibility Pattern Demo***\n");
        IReceiver faxHandler, emailHandler;

        emailHandler = new EmailErrorHandler(null);
        faxHandler = new FaxErrorHandler(emailHandler);

        IssueRaiser raiser = new IssueRaiser (faxHandler);
        Message m1 = new Message("Fax is reaching late to the destination",
        MessagePriority.Normal);
        Message m2 = new Message("Email is not going", MessagePriority.High);
        Message m3 = new Message("In Email, BCC field is disabled occasionally",
        MessagePriority.Normal);
        Message m4 = new Message("Fax is not reaching destination",
        MessagePriority.High);
        raiser.RaiseMessage(m1);
        raiser.RaiseMessage(m2);
        raiser.RaiseMessage(m3);
        raiser.RaiseMessage(m4);
    }
}