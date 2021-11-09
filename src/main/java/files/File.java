package files;

public abstract class File {
    protected String name;
    protected String directory;
    protected int size;

    public File(String name, String directory, int size) {
        this.name = name;
        this.directory = directory;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getDirectory() {
        return directory;
    }

    public int getSize() {
        return size;
    }

    public abstract File clone();

    public String toString() {
        return name + ", " + directory + ", " + String.valueOf(size);
    }
}
