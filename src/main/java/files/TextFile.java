package files;

public class TextFile extends File {
    private String encoding;

    public TextFile(String name, String directory, int size, String encoding) {
        super(name, directory, size);
        this.encoding = encoding;
    }
}