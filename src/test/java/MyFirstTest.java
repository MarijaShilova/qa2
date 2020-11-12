import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;
import org.junit.jupiter.api.Test;

public class MyFirstTest {
    private int globalVar = 10;

//odnostrocnij koment
    /*
    mnogostrocnij
    koment
     */
    //ctrl + / otkomentij strocku

    @Test //anotacija ,ne smozem zapustitj kak test)metod zapuskajem kak test
    public void firstTest() {
        System.out.println("Hello, corona!");
        int sum = sumTwoDigits(10,20);
        System.out.println("Aaand the sum is: " + sum);
        System.out.println(sumTwoDigits(3,8));

    }

    private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;

    }
}
