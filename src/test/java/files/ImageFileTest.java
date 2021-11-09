package files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImageFileTest {
    @Test
    public void testConstructor() {
        Assertions.assertDoesNotThrow(() ->
                new ImageFile("img.png", "/", 150, ImageFile.ImageFormat.PNG));
    }

    @Test
    public void testGetName() {
        ImageFile imageFile = new ImageFile("img.png", "/", 150, ImageFile.ImageFormat.PNG);
        Assertions.assertEquals("img.png", imageFile.getName());
    }

    @Test
    public void testGetDirectory() {
        ImageFile imageFile = new ImageFile("img.png", "/", 150, ImageFile.ImageFormat.PNG);
        Assertions.assertEquals("/", imageFile.getDirectory());
    }

    @Test
    public void testGetSize() {
        ImageFile imageFile = new ImageFile("img.png", "/", 150, ImageFile.ImageFormat.PNG);
        Assertions.assertEquals(150, imageFile.getSize());
    }

    @Test
    public void testGetEncoding() {
        ImageFile imageFile = new ImageFile("img.png", "/", 150, ImageFile.ImageFormat.PNG);
        Assertions.assertEquals(ImageFile.ImageFormat.PNG, imageFile.getFormat());
    }

    @Test
    public void testClone() {
        ImageFile imageFile = new ImageFile("myImg.png", "images/", 2000, ImageFile.ImageFormat.JPEG);
        ImageFile cloned = (ImageFile) imageFile.clone();
        Assertions.assertEquals("myImg.png", cloned.getName());
        Assertions.assertEquals("images/", cloned.getDirectory());
        Assertions.assertEquals(2000, cloned.getSize());
        Assertions.assertEquals(ImageFile.ImageFormat.JPEG, cloned.getFormat());
    }
}
