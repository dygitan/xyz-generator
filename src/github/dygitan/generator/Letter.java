package github.dygitan.generator;

import java.util.List;

public abstract class Letter {

    public static String SEPARATOR = " ";

    private int size;

    public abstract List<List<String>> generateLetter();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
