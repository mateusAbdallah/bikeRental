import java.awt.*;

import javax.swing.*;

public class Main {

	private JFrame frame;
	private JLabel label1, label2, label3;
	private JTextField field1, field2;
	private JRadioButton radioBtn1, radioBtn2, radioBtn3;
	private JCheckBox checkBx1, checkBx2;
	private JButton btn;

	public static void main(String[] args) {
		Main obj = new Main();
		obj.form1();

	}

	public void form1() {

		//create the frame
		frame = new JFrame("Bicycle Exercise");
		frame.setLayout(new GridLayout(6,0));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		//create panel 1
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2,2));
		label1 = new JLabel("Customer name:");
		field1 = new JTextField(20);		
		label2 = new JLabel("Number of days:");
		field2 = new JTextField(20);

		p1.add(label1);
		p1.add(field1);
		p1.add(label2);
		p1.add(field2);
		frame.add(p1);

		//create panel 2
		JPanel p2 = new JPanel();
		radioBtn1 = new JRadioButton();
		radioBtn1.setText("Model 1");
		radioBtn2 = new JRadioButton();
		radioBtn2.setText("Model 2");
		radioBtn3 = new JRadioButton();
		radioBtn3.setText("Model 3");
		p2.add(radioBtn1);
		p2.add(radioBtn2);
		p2.add(radioBtn3);
		frame.add(p2);

		
		frame.setSize(400,400);
		frame.pack();
		frame.setVisible(true);



	}

}