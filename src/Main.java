import operations.Add;
import operations.Substract;

public class Main {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Калькулятор v" + calculator.getVersion());
        System.out.println("================================");
        
        // Тест сложения
        calculator.setOperation(new Add());
        double result1 = calculator.calculate(10, 5);
        System.out.println("10 " + calculator.getCurrentOperationSymbol() + " 5 = " + result1);
        
        // Тест вычитания
        calculator.setOperation(new Substract());
        double result2 = calculator.calculate(10, 5);
        System.out.println("10 " + calculator.getCurrentOperationSymbol() + " 5 = " + result2);
        
        // Еще один тест
        calculator.setOperation(new Add());
        double result3 = calculator.calculate(100, 200);
        System.out.println("100 " + calculator.getCurrentOperationSymbol() + " 200 = " + result3);
        
        System.out.println("================================");
        System.out.println("Готово!");

        calculator.setOperation(new Division());
        double result4 = calculator.calculate(10, 5);
        System.out.println("10 " + calculator.getCurrentOperationSymbol() + " 5 = " + result4);
        
    }
}