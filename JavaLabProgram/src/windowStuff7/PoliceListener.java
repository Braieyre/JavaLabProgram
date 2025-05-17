package windowStuff7;

import java.awt.event.*;

import javax.swing.*;

public class PoliceListener implements ActionListener {
	private JTextField input;
	private JLabel label;
	
	public PoliceListener(JTextField input,JLabel label) {
		this.input = input;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String inputText = input.getText();
		int length = inputText.length();
		label.setText("“" + inputText + "”" + "的长度：" + length);
		
	}
	
		

}
