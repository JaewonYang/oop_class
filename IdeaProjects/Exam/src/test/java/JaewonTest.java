import static org.junit.Assert.*;

/**
 * Created by ce416-17 on 2014. 10. 24..
 */

public class JaewonTest {
    public static void main(String[] args){
        Calculator c= new Calculator();

        double multiple_result = c.multiple(10, 50);
        assertEquals(500, multiple_result, 0);

        int sum_result = c.sum(5,10);
        assertEquals(15, sum_result, 0);
    }
}

 class Calculator{
    double multiple(double num1, double num2){
       return num1*num2;
    }
    int sum(int num1, int num2){
         return num1+num2;
     }
 }
