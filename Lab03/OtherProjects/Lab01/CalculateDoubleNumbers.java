import javax.swing.JOptionPane;

public class CalculateDoubleNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        double sum, difference, product, quotient;

        strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        strNum2 = JOptionPane.showInputDialog("Enter the second number:");

        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;

        String message = "Sum: " + sum +
                         "\nDifference: " + difference +
                         "\nProduct: " + product;

        if (num2 != 0) {
            quotient = num1 / num2;
            message += "\nQuotient: " + quotient;
        } else {
            message += "\nQuotient: Cannot divide by zero!";
        }

        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}