package tryfailcatchassert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AppTest {

    private App app;

    @Before
    public void setUp() throws Exception {
        app = new App();
    }

    @Test
    public void shutdownWithOutStartThrowsIllegalStateException() throws Exception {
        app.setName("");
        app.configure();
        try {
            app.shutdown();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("state is not STARTED", e.getMessage());
        }
    }
}
