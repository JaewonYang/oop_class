import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by ce416-17 on 2014. 10. 17..
 */
public class JejuTest2 {
    @Test
    public void midTest() throws Exception {
        Assert.assertThat(4 * 5 , is(20));
    }
}
