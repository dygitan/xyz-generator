package github.dygitan.generator;

import java.util.List;
import javax.swing.JOptionPane;

public class Horizontal {

    public static void main(String[] args) throws Exception {
        String[] letters = JOptionPane.showInputDialog("Enter letter(s):").split(",");

        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter size:"));

        if (size % 2 == 0 || size < 3) {
            JOptionPane.showMessageDialog(null, "Invalid size!", "INVALID", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (String str : letters) {
            Letter letter = null;

            if (str.equalsIgnoreCase("X")) {
                letter = new X();
            } else if (str.equalsIgnoreCase("Y")) {
                letter = new Y();
            } else if (str.equalsIgnoreCase("Z")) {
                letter = new Z();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input [" + letter + "]",
                        "INVALID", JOptionPane.ERROR_MESSAGE);
                return;
            }

            letter.setSize(size);
            
            printOutput(letter.generateLetter());
        }
    }

    private static void printOutput(List<List<String>> result) {
        for (List<String> temp : result) {
            for (String s : temp) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
