import javax.swing.JOptionPane;

public class linear_equation{
    public static void main(String[] args){
        String strNum1, strNum2;
        double a, b, x;
        String message;

        strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        strNum2 = JOptionPane.showInputDialog("Enter the second number:");

        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);

        if (a == 0){
            if (b == 0){
                message = "Phương trình có vô số nghiệm";
            } else{
                message = "Phương trình vô nghiệm";
            }
        } else{
            x = -b / a;
            message = "Nghiệm của phương trình bậc nhất một ẩn là: " + x;
        }

        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}
