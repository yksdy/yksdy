//package src20160328;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class TankGame extends JFrame implements ActionListener{
	public static void main(String[] args){
		new TankGame();
	}
	private JMenuBar jmb;
	private JMenu jm;
	private JMenuItem jmi1;
	private JMenuItem jmi2;
	private MyStartPanel msp=null;
	private PlayWav pw = null;
	public TankGame(){
		jmb = new JMenuBar();
		jm = new JMenu("Menu");
		jmi1 = new JMenuItem("Start");
		jmi2 = new JMenuItem("Exit");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("exit");
		msp = new MyStartPanel();
		pw = new PlayWav("111.wav");
	//	pw = new PlayWav("111.mp3");
		pw.start();
		jm.add(jmi1);
		jm.add(jmi2);
		jmb.add(jm);
		this.add(BorderLayout.NORTH,jmb);
		this.add(BorderLayout.CENTER,msp);
		this.setVisible(true);
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("exit")){
			System.exit(0);
		}
		
	}
}
class MyStartPanel extends JPanel implements Runnable{
	MyStartPanel(){
		new Thread(this).start();
	}
	private int time = 0;
	public void paint(Graphics g){
		super.paint(g);
		if(time%2==1){
			g.setFont(new Font("宋体",Font.BOLD,30));
			g.setColor(Color.RED);
			g.drawString("Welcom to Tank World",100,100);
		}
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(400);
			}catch(Exception e){
				e.printStackTrace();
			}
			time++;
			this.repaint();
		}
	}
}

class PlayWav extends Thread{
	private String wavFilename;
	public PlayWav(String wavFilename){
		this.wavFilename = wavFilename;
	}
	public void run(){
		File soundFile = new File(wavFilename);
		AudioInputStream audioInputStream = null;
		
		try {
			audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}

		AudioFormat format = audioInputStream.getFormat();
		SourceDataLine auline = null;
		DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

		try {
			auline = (SourceDataLine) AudioSystem.getLine(info);
			auline.open(format);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		auline.start();
		int nBytesRead = 0;
	
		byte[] abData = new byte[512];

		try {
			while (nBytesRead != -1) {
				nBytesRead = audioInputStream.read(abData, 0, abData.length);
				if (nBytesRead >= 0)
					auline.write(abData, 0, nBytesRead);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} finally {
			auline.drain();
			auline.close();
		}

	}
}














