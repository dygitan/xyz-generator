package github.dygitan.generator;

import java.util.ArrayList;
import java.util.List;

public class Y extends Letter {

    @Override
    public List<List<String>> generateLetter() {
        int size = getSize();

        System.out.println("generate y [" + size + "]");

        List<List<String>> result = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            List<String> temp = new ArrayList<String>();

            int mid = (int) Math.ceil((double) size / 2);

            if (i == 1) {
                for (int j = 1; j <= size; j++) {
                    if (j == 1 || j == size) {
                        temp.add("*");
                    } else {
                        temp.add(" ");
                    }
                }
            } else if (i < mid) {
                for (int j = 1; j <= size; j++) {
                    if (j == i || (size - i) + 1 == j) {
                        temp.add("*");
                    } else {
                        temp.add(SEPARATOR);
                    }
                }


            } else {
                for (int a = 1; a <= size; a++) {
                    if (a == mid) {
                        temp.add("*");
                    } else {
                        temp.add(" ");
                    }
                }
            }

            result.add(temp);
        }

        return result;
    }
}
