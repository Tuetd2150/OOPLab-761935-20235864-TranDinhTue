import javax.swing.JOptionPane;

public class Second_degreeEquation {
    public static void main(String[] args) {
        String strNum1, strNum2, strNum3;
        double a, b, c;
        double delta;
        String message;

        strNum1 = JOptionPane.showInputDialog("Enter a:");
        strNum2 = JOptionPane.showInputDialog("Enter b:");
        strNum3 = JOptionPane.showInputDialog("Enter c:");

        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);
        c = Double.parseDouble(strNum3);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    message = "Phương trình có vô số nghiệm";
                } else {
                    message = "Phương trình vô nghiệm";
                }
            } else {
                double x = -c / b;
                message = "Phương trình trở thành phương trình bậc nhất một ẩn\n Nghiệm duy nhất của phương trình là: x = " + x;
            }
        } else {
            delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                message = "Phương trình có 2 nghiệm phân biệt:"
                        + "x1 = " + x1 + "\n"
                        + "x2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                message = "Phương trình có nghiệm kép:"
                        + "x = " + x;
            } else {
                message = "Phương trình vô nghiệm thực";
            }
        }

        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}