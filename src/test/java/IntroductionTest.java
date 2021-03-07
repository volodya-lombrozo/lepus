import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntroductionTest {

    @Test
    public void run() {
        String res = new Introduction().run();
        assertEquals("run", res);
    }

}