package files;

public class TextFile extends File {
    private String encoding;

    public TextFile(String name, String directory, int size, String encoding) {
        super(name, directory, size);
        this.encoding = encoding;
    }

    public String getEncoding() {
        return encoding;
    }

    @Override
    public File clone() {
        return new TextFile(name, directory, size, encoding);
    }
}
