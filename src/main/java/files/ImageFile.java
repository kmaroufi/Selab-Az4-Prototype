package files;

public class ImageFile extends File {
    public enum ImageFormat {PNG, JPEG}

    private ImageFormat format;

    public ImageFile(String name, String directory, int size, ImageFormat format) {
        super(name, directory, size);
        this.format = format;
    }

    @Override
    public File clone() {
        return null;
    }
}
