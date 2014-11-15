package tryfailcatchassert;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private App app;

    @Before
    public void setUp() throws Exception {
        app = new App();
    }

    @Test(expected = IllegalStateException.class)
    public void shutdownWithOutStartThrowException() throws Exception {
        app.configure();
        app.shutdown();
    }
}
