import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import java.util.*;
import java.io.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;


public class TankGame3 extends JFrame implements ActionListener{
	public static void main(String[] args)
	{
		new TankGame3();
	}
	JMenuBar jmb = null;
	JMenu jm = null;
	JMenuItem jmi1 = null;
	JMenuItem jmi2 = null;
	JMenuItem jmi3 = null;

	MyStartPanel msp =  null;
	TankGame3(){
		jmb = new JMenuBar();
		jm = new JMenu("Game");
		jmi1 = new JMenuItem("NewGame");
		jmi2 = new JMenuItem("SaveGame");
		jmi3 = new JMenuItem("Exit");

		msp = new MyStartPanel();

		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		jmi3.addActionListener(this);
		
		jmi1.setActionCommand("newgame");
		jmi2.setActionCommand("savegame");
		jmi3.setActionCommand("exit");

		jm.add(jmi1);
		jm.add(jmi2);
		jm.add(jmi3);
		jmb.add(jm);
		this.add(BorderLayout.NORTH,jmb);
		this.add(BorderLayout.CENTER,msp);
		
		//this.setJMenuBar(jmb);
		this.setVisible(true);
		this.setSize(600,480);
		this.setLocation(200,100);
		//this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("newgame")){
			msp.isLive = false;
			this.remove(msp);
			MyPanel mp = new MyPanel();
			this.add(BorderLayout.CENTER,mp);
			this.setVisible(true);
			this.addKeyListener(mp);
			
		}
		else if(e.getActionCommand().equals("exit")){
			System.exit(0);
		}
	}
}
class AePlayWave extends Thread {

	private String filename;
	public AePlayWave(String wavfile) {
		filename = wavfile;

	}
	public void run() {

		File soundFile = new File(filename);// opern file

		AudioInputStream audioInputStream = null;  // open for AudioInputStream
		try {
			audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}

		AudioFormat format = audioInputStream.getFormat(); //AudioFormat  , get audio file format
		
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
		//ÕâÊÇ»º³å
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

class MyPanel extends JPanel implements KeyListener,Runnable{
	MyTank mt = null;

	public static int mpX=400;
	public static int mpY=400;

	int j;
	MyPanel(){
		new AePlayWave("dingding.wav").start();
		new Thread(this).start();
		mt = new MyTank(100,100);
	}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.gray);
		g.fillRect(0,0,mpX,mpY);
		paintMyTank(mt,g);
		
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(300);
				}
			catch(Exception e){}
			repaint();
		}
	}
	public void paintMyTank(MyTank mt,Graphics g){
		g.setColor(Color.blue);
		paintTank(mt,g);
		g.setColor(Color.red);
		paintBullet(mt.b,g);
	}
	public void paintBullet(Bullet b,Graphics g){
		if(b!=null)
		{		
			if(b.isLive==false){
				System.out.println(" "+j+++"if(b.isLive==false)"+" b: "+b);
				//b=null;
				//System.gc();
			}
			else
			{
				g.draw3DRect(b.x, b.y, 1, 1,false);
			}
		}
		
	}
	public void paintTank(Tank t,Graphics g){
		int x=t.x;
		int y=t.y;
		switch(t.direct)
		{
		case 0:
			g.fill3DRect(x, y, 5, 30,false);
			g.fill3DRect(x+15,y , 5, 30,false);
			g.fill3DRect(x+5,y+5 , 10, 20,false);
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y);
			break;
		case 1:
			g.fill3DRect(x, y, 30, 5,false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x+30, y+10);
			break;
		case 2:
			g.fill3DRect(x, y, 5, 30,false);
			g.fill3DRect(x+15,y , 5, 30,false);
			g.fill3DRect(x+5,y+5 , 10, 20,false);
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y+30);
			break;
		case 3:
			g.fill3DRect(x, y, 30, 5,false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x, y+10);
			break;
			
		}
		
	}
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub	
		if(arg0.getKeyCode()==KeyEvent.VK_W)
		{
			mt.moveUp();			
		}
		else if(arg0.getKeyCode()==KeyEvent.VK_D)
		{
			mt.moveRight();			
		}
		else if(arg0.getKeyCode()==KeyEvent.VK_S)
		{
			mt.moveDown();			
		}
		else if(arg0.getKeyCode()==KeyEvent.VK_A)
		{
			mt.moveLeft();			
		}
		else if(arg0.getKeyCode()==KeyEvent.VK_J)
		{
			mt.b=new Bullet(mt.x,mt.y,mt.direct);
		}
		repaint();
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
class Bullet extends Tank implements Runnable{
	boolean isLive = false;
	Bullet(int x,int y,int direct){
		this.direct=direct;
		this.speed=3;
		this.isLive=true;
		switch(direct){
		case 0:
			this.x=x+10;
			this.y=y;
			break;
		case 1:
			this.x=x+30;
			this.y=y+10;
			break;
		case 2:
			this.x=x+10;
			this.y=y+30;
			break;
		case 3:
			this.x=x;
			this.y=y+10;
			break;
		}
		new Thread(this).start();
	}
	Bullet(int x,int y,int direct,int speed){
		this.x=x;
		this.y=y;
		this.direct=direct;
		this.speed=speed;
		this.isLive=true;
		new Thread(this).start();
	}
	public void run(){
		int i=0;
		while(true){
			System.out.println("  "+(++i)+ " Bullet b.isLive= "+ isLive);
			if(isLive==false){			
				break;
			}
			try{
				Thread.sleep(300);
				}
			catch(Exception e){}
			switch(direct){
			case 0:
				moveUp();
				break;
			case 1:
				moveRight();
				break;
			case 2:
				moveDown();
				break;
			case 3:
				moveLeft();
				break;
			}
		}
	}
	public void moveUp(){
		if(y>speed)
			y-=speed;
		else
			isLive=false;
	}
	public void moveDown(){
		if(y<(MyPanel.mpY-speed))
			y+=speed;
		else
			isLive=false;
	}
	public void moveLeft(){
		if(x>speed)
			x-=speed;
		else
			isLive=false;
	}
	public void moveRight(){
		if(x<(MyPanel.mpX-speed))
			x+=speed;
		else
			isLive=false;
	}
}
class Tank{
	int x,y;
	int direct;
	int speed;
	//Vector vb<Bullet> = null;
	Bullet b=null;
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getDirect(){
		return direct;
	}
	public int getSpeed(){
		return speed;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setDirect(int direct){
		this.direct=direct;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}

	public void moveUp(){
		direct =0;
		if(y>speed)
			y-=speed;
	}
	public void moveDown(){
		direct =2;
		if(y<(MyPanel.mpY-speed-30))
			y+=speed;
	}
	public void moveLeft(){
		direct =3;
		if(x>speed)
			x-=speed;
	}
	public void moveRight(){
		direct =1;
		if(x<(MyPanel.mpX-speed-30))
			x+=speed;
	}		
}
class MyTank extends Tank{

	MyTank(int x,int y){
		this.x=x;
		this.y=x;
		this.direct=0;
		this.speed=3;
	}
	MyTank(int x,int y,int speed){
		this.x=x;
		this.y=y;
		this.direct=0;
		this.speed=speed;
	}
}
class MyStartPanel extends JPanel implements Runnable{
	public boolean isLive = false;
	private boolean flag = false;
	MyStartPanel(){
		isLive = true;
		new Thread(this).start();
	}
	public void paint(Graphics g){
		super.paint(g);
		if(flag){
			g.setFont(new Font("ËÎÌå",Font.BOLD,30));
			g.setColor(Color.YELLOW);
			g.drawString("Wellcom",100,100);
		}
	}
	public void run(){
		while(true){
			if(isLive == false){
				break;
			}
			flag=!flag;
			repaint();
			try{
				Thread.sleep(300);
				}catch(Exception e){
				}
			
		}
	}
}

