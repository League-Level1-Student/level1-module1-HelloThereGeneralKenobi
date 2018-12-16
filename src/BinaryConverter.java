import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	public static void main(String[] args) {
		BinaryConverter binaryConverter = new BinaryConverter();
		binaryConverter.setup();
	}
	
	JFrame frame = new JFrame("Convert 8 bits of binary to ASCII");
	JTextField answer = new JTextField(20);
	JLabel label = new JLabel();
	
	void setup() {
		JPanel panel = new JPanel();
		JButton button = new JButton("convert");
		
		button.addMouseListener(this);
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(answer);
		panel.add(button);
		panel.add(label);
		
		frame.pack();
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
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			String convert = convert(answer.getText());
			label.setText(convert);
			frame.pack();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

