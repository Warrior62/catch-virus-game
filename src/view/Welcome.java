package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;


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
		// Create components of the Welcome window
		JPanel pnlWelcome = new JPanel();
		JLabel jlbWelcome = new JLabel("Welcome !");
		JLabel jlbReady = new JLabel("Ready to catch Virus ?");
		JButton btnStart = new JButton("Start");
		JButton btnSettings = new JButton("Settings");
		JButton btnExit = new JButton("Exit");
		
		
		this.setStyles(jlbWelcome, jlbReady, btnStart, btnSettings, btnExit);
		
		// Add JLabels and JButtons into the JPanel
		pnlWelcome.add(jlbWelcome);
		pnlWelcome.add(jlbReady);
		pnlWelcome.add(btnStart);
		pnlWelcome.add(btnSettings);
		pnlWelcome.add(btnExit);
		this.add(pnlWelcome);
		
		// Add listeners on the three buttons
		this.setWelcomeListeners(btnStart, btnSettings, btnExit);
	}
	
	private void setStyles(JLabel jlbWelcome, JLabel jlbReady, JButton btnStart, JButton btnSettings, JButton btnExit) {
		jlbWelcome.setFont(new Font("Avenir", Font.BOLD, 24));
		jlbReady.setFont(new Font("Avenir", Font.BOLD, 24));	
		
		// START BTN //
		btnStart.setFont(new Font("Avenir", Font.PLAIN, 19));
		btnStart.setBackground(Color.GREEN);
		btnStart.setOpaque(true);
		btnStart.setBorderPainted(false);
		btnStart.setPreferredSize(new Dimension(150, 40));
		//btnStart.setLayout(null);
		//btnStart.setBounds(250, 400, 100, 50);
		
		// SETTINGS BTN //
		btnSettings.setFont(new Font("Avenir", Font.PLAIN, 19));
		btnSettings.setBackground(Color.GRAY);
		btnSettings.setOpaque(true);
		btnSettings.setBorderPainted(false);
		btnSettings.setPreferredSize(new Dimension(150, 40));
		
		// EXIT BTN //
		btnExit.setFont(new Font("Avenir", Font.PLAIN, 19));
		btnExit.setBackground(Color.RED);
		btnExit.setOpaque(true);
		btnExit.setBorderPainted(false);
		btnExit.setPreferredSize(new Dimension(150, 40));
	}

	private void setWelcomeListeners(JButton btnStart, JButton btnSettings, JButton btnExit) {
		ActionListener btnStartClickedListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Start button clicked");
				new Play();
			}
		};
		btnStart.addActionListener(btnStartClickedListener);
		
		ActionListener btnSettingsClickedListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Settings button clicked");
				new Settings();		
			}
		};
		btnSettings.addActionListener(btnSettingsClickedListener);
		
		
		ActionListener btnExitClickedListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane jopExit = new JOptionPane();
				System.out.println("Exit button clicked");
				int selectedValue = jopExit.showConfirmDialog(null, "Do you really want to exit the game ?", "Exit Catch Virus!", JOptionPane.YES_NO_OPTION);

				if(selectedValue == JOptionPane.YES_OPTION) {
					System.out.println("Exit game ...");
					System.exit(1);	
				}
			}
		};
		btnExit.addActionListener(btnExitClickedListener);	
	}


	public static void main(String[] args) {
		Welcome w = new Welcome();
	}
}
