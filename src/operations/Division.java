package operations;

public class Division implements Operation 
{
    @Override
    public String getSymbol() 
    {
        return "/";
    }
    public double execute(double a, double b) 
    {
       return a / b;
    }
}