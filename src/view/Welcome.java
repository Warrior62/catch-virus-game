package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Welcome extends JFrame{
		
	
	public Welcome() {
		fillWindow();
		initWindow();
	}
	
	private void initWindow() {
		this.setTitle("Catch Virus!");
		this.setSize(600, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	
	private void fillWindow() {
		JPanel pnlWelcome = new JPanel();
		JLabel jlbWelcome = new JLabel("Welcome !");
		JLabel jlbReady = new JLabel("Ready to catch Virus ?");
		JButton btnStart = new JButton("Start");
		JButton btnSettings = new JButton("Settings");
		JButton btnExit = new JButton("Exit");
		
		
		pnlWelcome.add(jlbWelcome);
		pnlWelcome.add(jlbReady);
		pnlWelcome.add(btnStart);
		pnlWelcome.add(btnSettings);
		pnlWelcome.add(btnExit);
		this.add(pnlWelcome);
		
		ActionListener btnExitClickedListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Exit button clicked");
				System.exit(1);	
			}
		};
		btnExit.addActionListener(btnExitClickedListener);
		
		ActionListener btnStartClickedListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Start button clicked");
			}
		};
		btnStart.addActionListener(btnStartClickedListener);
	}


	public static void main(String[] args) {
		Welcome w = new Welcome();
	}
}
