package files;

public class ImageFile extends File {
    public enum ImageFormat {PNG, JPEG}

    private ImageFormat format;

    public ImageFile(String name, String directory, int size, ImageFormat format) {
        super(name, directory, size);
        this.format = format;
    }

    public ImageFormat getFormat() {
        return format;
    }

    @Override
    public File clone() {
        return null;
    }
}
