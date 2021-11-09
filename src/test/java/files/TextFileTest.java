package files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextFileTest {
    @Test
    public void testConstructor() {
        Assertions.assertDoesNotThrow(() ->
                new TextFile("text1.txt", "/", 150, "Unicode"));
    }
}
