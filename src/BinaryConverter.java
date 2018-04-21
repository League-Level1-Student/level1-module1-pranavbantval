import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryConverter implements ActionListener {
	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.createUI();
	}

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JTextField t = new JTextField(20);

	private void createUI() {
		f.add(p);
		p.add(b);
		p.add(t);
		f.setVisible(true);
		f.setTitle("Convert 8 bits of binary to ASCII");
		b.setText("convert");
		b.addActionListener(this);
		f.pack();
		f.setSize(500, 100);

	}
 String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String text = t.getText();
   System.out.println(convert(text));
}
}
