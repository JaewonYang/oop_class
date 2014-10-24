import static org.junit.Assert.*;

/**
 * Created by ce416-17 on 2014. 10. 24..
 */

public class JaewonTest {
    public static void main(String[] args){
        Calculator c= new Calculator();

        double result = c.multiple(10, 50);
        assertEquals(500, result, 0);
    }
}

 class Calculator{
    double multiple(double num1, double num2){
       return num1*num2;
    }
 }
