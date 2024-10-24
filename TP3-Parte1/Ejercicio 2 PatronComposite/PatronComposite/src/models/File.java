package models;

public class File extends FileSystemComponent{
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " (Size: " + size + " bytes)");
    }
}
