package interpreter_demo;

public class StringToBinaryExp implements IExpression
{
    private String str;

    public StringToBinaryExp(String s)
    {
        this.str = s;
    }

    @Override
    public void interpret(Context ic)
    {
        ic.getBinaryForm(str);
    }
}