import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import io.qameta.allure.junit4.DisplayName;

public class MainTest {
    @Test
    @DisplayName("Create App")
    public void testAppConstructor() {
        try {
            new App();

        } catch (Exception e) {
            fail("Failed to create construction");
        }
        assertTrue(true);
    }
}
