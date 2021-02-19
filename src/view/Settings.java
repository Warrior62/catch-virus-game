package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Settings extends JFrame{

	
	public Settings() {
		fillSettingsWindow();
		initSettingsWindow();
	}
	
	private void initSettingsWindow() {
		this.setTitle("Catch Virus! - Settings");
		this.setSize(600, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	
	private void fillSettingsWindow() {
		// Create components of the Settings window
		JPanel pnlSettings = new JPanel();
		JLabel jlbSpeed = new JLabel("Speed");
		JLabel jlbVirusSound = new JLabel("Virus sound");
		JLabel jlbGameDuration = new JLabel("Game duration (in seconds)");
		JLabel jlbJslVal = new JLabel("1");
		JSlider jslSpeed = new JSlider(1, 5, 1);
		JButton btnBack = new JButton("Back");
		
		// Print various speed levels on the JSlider
		this.configJSlider(jslSpeed);
		
		// Add JLabels and the JSlider into the JPanel
		pnlSettings.add(jlbSpeed);
		pnlSettings.add(jlbVirusSound);
		pnlSettings.add(jlbGameDuration);
		pnlSettings.add(jslSpeed);
		pnlSettings.add(jlbJslVal);
		pnlSettings.add(btnBack);
		this.add(pnlSettings);
		
		// Add listeners on the slide bar and the Back button
		this.setSettingsListeners(jslSpeed, jlbJslVal, btnBack);
	}
	
	private void configJSlider(JSlider jslSpeed) {
		jslSpeed.setMinorTickSpacing(1);  
		jslSpeed.setMajorTickSpacing(1); 
		jslSpeed.setPaintLabels(true);
		jslSpeed.setPaintTicks(true);
		jslSpeed.setPaintTrack(true);
		jslSpeed.setFocusable(true);		
	}
	
	private void setSettingsListeners(JSlider jslSpeed, JLabel jlbJslVal, JButton btnBack) {
		ChangeListener testChangedListener = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				jlbJslVal.setText(String.valueOf(jslSpeed.getValue()));
			}
		};	
		jslSpeed.addChangeListener(testChangedListener);	
		
		ActionListener btnBackClickedListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Back button clicked");
				Settings.super.dispose();
			}
		};
		btnBack.addActionListener(btnBackClickedListener);
	}
	
	public static void main(String[] args) {
		
	}

}
