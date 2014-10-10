import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

/**
 * Created by ce416-17 on 2014. 10. 10..
 */
public class JejuTest {
    @Test
    public void testAdd() throws Exception {
        Assert.assertThat(1 + 1, is(2));
        System.out.println("helloworld");

    }

}
