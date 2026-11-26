import operations.Operation;
import operations.Add;
import operations.Substract;

public class Calculator
{
    public static final String VERSION = "1.0.0";

    private Operation currentOperation;

    public Calculator() 
    {
        this.currentOperation = new Add();
    }

    public void setOperation(Operation operation) 
    {
        this.currentOperation = operation;
    }

    public double calculate(double a, double b) 
    {
        if (currentOperation == null) 
        {
            throw new IllegalStateException("Операция не установлена");
        }
        return currentOperation.execute(a, b);
    }

    public String getCurrentOperationSymbol() 
    {
        return currentOperation.getSymbol();
    }

    public String getVersion() 
    {
        return VERSION;
    }
}