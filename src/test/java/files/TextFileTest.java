package files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextFileTest {
    @Test
    public void testConstructor() {
        Assertions.assertDoesNotThrow(() ->
                new TextFile("text1.txt", "/", 150, "Unicode"));
    }

    @Test
    public void testGetName() {
        TextFile textFile = new TextFile("text1.txt", "/", 150, "Unicode");
        Assertions.assertEquals("text1.txt", textFile.getName());
    }

    @Test
    public void testGetDirectory() {
        TextFile textFile = new TextFile("text1.txt", "/", 150, "Unicode");
        Assertions.assertEquals("/", textFile.getDirectory());
    }

    @Test
    public void testGetSize() {
        TextFile textFile = new TextFile("text1.txt", "/", 150, "Unicode");
        Assertions.assertEquals(150, textFile.getSize());
    }

    @Test
    public void testGetEncoding() {
        TextFile textFile = new TextFile("text1.txt", "/", 150, "Unicode");
        Assertions.assertEquals("Unicode", textFile.getEncoding());
    }
}
