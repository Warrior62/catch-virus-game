package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Play extends JFrame{

	public Play() {
		fillPlayWindow();
		initPlay();
	}
	
	private void initPlay() {
		this.setTitle("Catch Virus! - PLAYING");
		this.setSize(600, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	
	private void fillPlayWindow() {
		// Create components of the Play window
		JPanel pnlPlay = new JPanel();
		JButton btnPause = new JButton("Pause");
		
		// Add JButton into the JPanel
		pnlPlay.add(btnPause);
		this.add(pnlPlay);
		
		// Add listeners on the Pause button
		this.setPlayListeners(btnPause);
	}
	
	private void setPlayListeners(JButton btnPause) {
		ActionListener btnPauseClickedListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pause button clicked");
			}
		};
		btnPause.addActionListener(btnPauseClickedListener);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
