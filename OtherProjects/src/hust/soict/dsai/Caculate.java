package hust.soict.dsai;
import javax.swing.JOptionPane;

public class Caculate {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
        
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        
        strNotification += num1 + " and " + num2;

        JOptionPane.showMessageDialog(null, strNotification, "Input Notification", JOptionPane.INFORMATION_MESSAGE);
        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        JOptionPane.showMessageDialog(null, "Sum: " + sum, "Sum of Two Numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Difference: " + difference, "Difference of Two Numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Product: " + product, "Product of Two Numbers", JOptionPane.INFORMATION_MESSAGE);
        
        if (num2 != 0) {
            double quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, "Quotient: " + quotient, "Quotient of Two Numbers", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Division by zero is undefined.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.exit(0);
    }
}
