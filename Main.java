import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Main implements ActionListener {

	private JFrame frame;
	private JLabel label1, label2, image1, image2, image3;
	private JTextField field1, field2;
	private JRadioButton radioBtn1, radioBtn2, radioBtn3;
	private JCheckBox checkBx1, checkBx2;
	private JButton btn;

	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		obj.form1();

	}

	public void form1() throws IOException {

		//create the frame
		frame = new JFrame("Bicycle Exercise");
		frame.setLayout(new GridLayout(6,0));
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

		BufferedImage img1 = ImageIO.read(new File("src\\images\\bicycle1.png"));
		image1 = new JLabel(new ImageIcon(img1));
		BufferedImage img2 = ImageIO.read(new File("src\\images\\bicycle2.png"));
		image2 = new JLabel(new ImageIcon(img2));
		BufferedImage img3 = ImageIO.read(new File("src\\images\\bicycle3.png"));
		image3 = new JLabel(new ImageIcon(img3));
		image1.setVisible(false);
		image2.setVisible(false);
		image3.setVisible(false);

		radioBtn1 = new JRadioButton();
		radioBtn1.setText("Model 1");
		radioBtn1.addActionListener(this);
		radioBtn2 = new JRadioButton();
		radioBtn2.setText("Model 2");
		radioBtn3 = new JRadioButton();
		radioBtn3.setText("Model 3");
		ButtonGroup g1 = new ButtonGroup();
		g1.add(radioBtn1);
		g1.add(radioBtn2);
		g1.add(radioBtn3);
		radioBtn1.addActionListener(this);
		radioBtn2.addActionListener(this);
		radioBtn3.addActionListener(this);

		p2.add(image1);
		p2.add(image2);
		p2.add(image3);
		p2.add(radioBtn1);
		p2.add(radioBtn2);
		p2.add(radioBtn3);
		frame.add(p2);

		//create panel 3

		JPanel p3 = new JPanel();
		checkBx1 = new JCheckBox();
		checkBx1.setText("Senior Citizen");
		checkBx2 = new JCheckBox();
		checkBx2.setText("Member");
		ButtonGroup g2 = new ButtonGroup();
		g2.add(checkBx1);
		g2.add(checkBx2);
		checkBx1.addActionListener(this);
		checkBx2.addActionListener(this);
		
		p3.add(checkBx1);
		p3.add(checkBx2);
		frame.add(p3);

		//create panel 4
		JPanel p4 = new JPanel();
		btn = new JButton("Compute");
		btn.addActionListener(this);
		p4.add(btn);
		frame.add(p4);
		

		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);



	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(radioBtn1.isSelected()) {
			image1.setVisible(true);
			image2.setVisible(false);
			image3.setVisible(false);

		}
		else if(radioBtn2.isSelected()) {
			image2.setVisible(true);
			image1.setVisible(false);
			image3.setVisible(false);
		}
		else if(radioBtn3.isSelected()) {
			image3.setVisible(true);
			image2.setVisible(false);
			image1.setVisible(false);
		}

		if(e.getSource().equals(btn)) {
			double total = 0.0;
			int model1 = 14;
			int model2 = 12;
			int model3 = 10;
			double seniorDiscount = 0.1;
			double memberDiscount = 0.12;
			String name = field1.getText();
			Integer days = Integer.parseInt(field2.getText());


			if(days < 6) {
				total = 8.99;
			}	

			else if(days >=6 && days <= 10) {
				double discount = 0.08;
				if(radioBtn1.isSelected() && checkBx1.isSelected()) {

					double result = (model1 * discount) - model1;
					total = (result * seniorDiscount) - result;
				}
				else if(radioBtn2.isSelected() && checkBx1.isSelected()) {
					
					double result = (model2 * discount) - model2;
					total = (result * seniorDiscount) - result;
				}
				else if(radioBtn3.isSelected() && checkBx1.isSelected()) {
					
					double result = (model3 * discount) - model3;
					total = (result * seniorDiscount) - result;
				}
				else if(radioBtn1.isSelected() && checkBx2.isSelected()) {
					
					double result = (model1 * discount) - model1;
					total = (result * memberDiscount) - result;
				}
				else if(radioBtn2.isSelected() && checkBx2.isSelected()) {
					
					double result = (model2 * discount) - model2;
					total = (result * memberDiscount) - result;
				}
				else if(radioBtn3.isSelected() && checkBx2.isSelected()) {
					
					double result = (model3 * discount) - model3;
					total = (result * memberDiscount) - result;
				}
			}
			else if(days > 10) {

				double discount = 0.1;
				if(radioBtn1.isSelected() && checkBx1.isSelected()) {

					double result = (model1 * discount) - model1;
					total = (result * seniorDiscount) - result;
				}
				else if(radioBtn2.isSelected() && checkBx1.isSelected()) {
					
					double result = (model2 * discount) - model2;
					total = (result * seniorDiscount) - result;
				}
				else if(radioBtn3.isSelected() && checkBx1.isSelected()) {
					
					double result = (model3 * discount) - model3;
					total = (result * seniorDiscount) - result;
				}
				else if(radioBtn1.isSelected() && checkBx2.isSelected()) {
					
					double result = (model1 * discount) - model1;
					total = (result * memberDiscount) - result;
				}
				else if(radioBtn2.isSelected() && checkBx2.isSelected()) {
					
					double result = (model2 * discount) - model2;
					total = (result * memberDiscount) - result;
				}
				else if(radioBtn3.isSelected() && checkBx2.isSelected()) {
					
					double result = (model3 * discount) - model3;
					total = (result * memberDiscount) - result;
				}

			}

			JOptionPane.showMessageDialog(btn, "Hello " + name + "\nThanks for chose our company" + 
			"\nYou selected " + days + " days"  + "\nSo will be charge " + " $" + total + " dollars");
		}

	}

}
