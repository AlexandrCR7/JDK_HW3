import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Calculator {

    private <T1 extends Number, T2 extends Number> Double sum(T1 t1, T2 t2){
        Double finalSum = t1.doubleValue() + t2.doubleValue();
        System.out.println(finalSum);
        return finalSum;
    }

    private <T1 extends Number, T2 extends Number> Double multiply(T1 t1, T2 t2){
        Double finalSum = t1.doubleValue() * t2.doubleValue();
        System.out.println(finalSum);
        return finalSum;
    }

    private <T1 extends Number, T2 extends Number> Double divide(T1 t1, T2 t2){
        Double finalSum = t1.doubleValue() / t2.doubleValue();
        System.out.println(finalSum);
        return finalSum;
    }

    private <T1 extends Number, T2 extends Number> Double subtract(T1 t1, T2 t2){
        Double finalSum = t1.doubleValue() - t2.doubleValue();
        System.out.println(finalSum);
        return finalSum;
    }



    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(5.1, 2);
        calculator.subtract(3.8, 1);
        calculator.divide(5, 2.5);
        calculator.multiply(1.9, 1.9);
    }
}
