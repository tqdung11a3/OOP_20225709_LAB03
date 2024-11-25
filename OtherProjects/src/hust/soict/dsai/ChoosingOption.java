//import javax.swing.JOptionPane;
//
//public class ChoosingOption {
//	public static void main(String[] args) {
//		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
//		JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
//		System.exit(0);
//	}
//}
package hust.soict.dsai;

import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		Object[] options = {"I do", "I don't"}; 
		int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", "Choose Option",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "I do" : "I don't"));
		System.exit(0);
	}
}