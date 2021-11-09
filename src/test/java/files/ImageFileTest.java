package files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImageFileTest {
    @Test
    public void testConstructor() {
        Assertions.assertDoesNotThrow(() ->
                new ImageFile("img.png", "/", 150, ImageFile.ImageFormat.PNG));
    }
}
