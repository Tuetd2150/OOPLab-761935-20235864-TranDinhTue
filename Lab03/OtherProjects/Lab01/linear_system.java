import javax.swing.JOptionPane;

public class linear_system {
    public static void main(String[] args) {
        String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
        double a11, a12, b1, a21, a22, b2;
        double D, D1, D2;
        String message;

        strNum1 = JOptionPane.showInputDialog("Enter a11:");
        strNum2 = JOptionPane.showInputDialog("Enter a12:");
        strNum3  = JOptionPane.showInputDialog("Enter b1:");
        strNum4 = JOptionPane.showInputDialog("Enter a21:");
        strNum5 = JOptionPane.showInputDialog("Enter a22:");
        strNum6  = JOptionPane.showInputDialog("Enter b2:");

        a11 = Double.parseDouble(strNum1);
        a12 = Double.parseDouble(strNum2);
        b1  = Double.parseDouble(strNum3);
        a21 = Double.parseDouble(strNum4);
        a22 = Double.parseDouble(strNum5);
        b2  = Double.parseDouble(strNum6);

        D  = a11 * a22 - a21 * a12;
        D1 = b1 * a22 - b2 * a12;
        D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            message = "Phương trình có nghiệm duy nhất:"
                    + "x1 = " + x1 + "\n"
                    + "x2 = " + x2;
        } else {
            if (D1 == 0 && D2 == 0) {
                message = "Phương trình có vô số nghiệm";
            } else {
                message = "Phương trình vô nghiệm";
            }
        }

        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}