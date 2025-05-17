package windowStuff7;

import java.awt.Color;

import javax.swing.*;

public class Window {
	public static void main(String args[]) {
		JFrame frame = new JFrame("显示字符串的长度");
		frame.setBounds(400,200,500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);   //手动关闭默认布局管理；
		
		JTextField inputField = new JTextField("请输入字符串");
		inputField.setBounds(70,30,260,30);
		frame.add(inputField);
		
		JButton button = new JButton("确认");
		button.setBounds(340,30,80,30);
		frame.add(button);
		
		JLabel label = new JLabel();
		label.setBounds(30,80,420,220);
		frame.add(label);
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		
		button.addActionListener(new PoliceListener(inputField,label));
	}
}
