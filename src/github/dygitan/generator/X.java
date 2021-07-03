package github.dygitan.generator;

import java.util.ArrayList;
import java.util.List;

public class X extends Letter {

    @Override
    public List<List<String>> generateLetter() {
        int size = getSize();
        
        System.out.println("generate x [" + size + "]");

        List<List<String>> results = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            List<String> temp = new ArrayList<>();

            int mid = (int) Math.ceil((double) size / 2);

            if (i == 1 || i == size) {
                for (int j = 1; j <= size; j++) {
                    if (j == 1 || j == size) {
                        temp.add("*");
                    } else {
                        temp.add(SEPARATOR);
                    }
                }
            } else if (i == mid) {
                for (int j = 1; j <= size; j++) {
                    if (j == mid) {
                        temp.add("*");
                    } else {
                        temp.add(SEPARATOR);
                    }
                }
            } else {
                for (int j = 1; j <= size; j++) {
                    if (j == i || (size - i) + 1 == j) {
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
