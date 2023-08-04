package com.shree.gaming.canvas;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

import jaco.mp3.player.MP3Player;

public class SplashScreen extends JWindow{
	private JLabel label = new JLabel();
	
	private MP3Player player;
	private void playSound() {
		player = new MP3Player(SplashScreen.class.getResource("sound.mp3"));
		player.play();
	}
	
	public SplashScreen() {
		setSize(1200,900);
		Icon icon = new ImageIcon(SplashScreen.class.getResource("splash.jpeg"));
		label.setIcon(icon);
		this.add(label);
		setLocationRelativeTo(null);
		setVisible(true);
		playSound();
		try {
			Thread.sleep(10000);
			setVisible(false);
			dispose();
			player.stop();
			GameFrame obj = new GameFrame();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplashScreen screen = new SplashScreen();

	}

}