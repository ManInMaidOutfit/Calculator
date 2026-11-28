package operations;

public class Multiply implements Operation 
{
    public double execute(double a, double b) 
    {
       return a * b;
    }

    @Override
    public String getSymbol() 
    {
        return "*";
    }

}