package github.dygitan.generator;

import java.util.ArrayList;
import java.util.List;

public class Z extends Letter {

    @Override
    public List<List<String>> generateLetter() {
        int size = getSize();

        System.out.println("generate z [" + size + "]");

        List<List<String>> results = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            List<String> temp = new ArrayList<>();

            if (i == 1 || i == size) {
                for (int j = 1; j <= size; j++) {
                    temp.add("*");
                }
            } else {
                for (int j = 1; j <= size; j++) {
                    if (j == size - (i - 1)) {
                        temp.add("*");
                    } else {
                        temp.add(SEPARATOR);
                    }
                }
            }

            results.add(temp);
        }

        return results;
    }
}
