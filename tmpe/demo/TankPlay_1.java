//package abc;
//import javax.imageio.ImageIO;
//import javax.sound.sampled.AudioFormat;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.DataLine;
//import javax.sound.sampled.SourceDataLine;
import javax.swing.*;
//import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class TankPlay_1 extends JFrame implements ActionListener {
	public static void main(String[] arg){
		new TankPlay_1();
	}
	private JMenuBar jmb = null;
	private JMenu jm = null;
	private JMenuItem jmi1 = null;
	private JMenuItem jmi2 = null;
	private MyStartPanel msp = null;
	private MyPanel mp = null;
	TankPlay_1(){
		jmi1 = new JMenuItem("New game");
		jmi2 = new JMenuItem("Exit");
		jm = new JMenu("File");
		jm.setMnemonic('F');
		jmb = new JMenuBar();
		msp = new MyStartPanel();
		jmi1.addActionListener(this);
		jmi1.setActionCommand("newgame");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("exit");
		jm.add(jmi1);
		jm.add(jmi2);
		jmb.add(jm);
		this.add(BorderLayout.NORTH,jmb);
		this.add(BorderLayout.CENTER,msp);
		this.setSize(400,300);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("newgame")){
			if(MyStartPanel.isLive == true)
				{
				MyStartPanel.isLive = false;
				this.remove(msp);
				mp = new MyPanel();
				this.add(BorderLayout.CENTER,mp);
				this.addKeyListener(mp);
				this.setVisible(true);
				System.out.println("newgame");
				}
			else{
				this.remove(mp);
				mp = new MyPanel();
				this.add(BorderLayout.CENTER, mp);
				System.out.println("game new");
				this.addKeyListener(mp);
				this.setVisible(true);
				}
		}
		else if(e.getActionCommand().equals("exit")){
			System.out.println("exit");
			System.exit(0);
			}
		}
}

class MyStartPanel extends JPanel implements Runnable {
	private int time =0;
	public static boolean isLive = false;
	MyStartPanel(){
		isLive = true;
		Thread t = new Thread(this);
		t.start();
	}
	public void paint(Graphics g){
		super.paint(g);
		if(time%2 == 0)
			{
			g.setColor(Color.yellow);
			g.setFont(new Font("ËÎÌו", Font.BOLD,30));
			g.drawString("levle one:",100,80);
			}
	}
	public void run(){
		while(true){
		try {
			Thread.sleep(400);
			}
		catch (Exception e){
		}
		this.repaint();
		time++;
		if(isLive==false)
			break;
		}
	}
}
class MyPanel extends JPanel implements KeyListener, Runnable {
	public static boolean isMpLive = false;
	MyTank mt = null;
	Bullet b = new Bullet(20,20,2);
	MyPanel(){
		isMpLive = true;
		mt =  new MyTank(50,50,2);
		System.out.println("MyPanel");
		Thread t = new Thread(this);
		t.start();
	}
	public void run(){
		while(true) {
			try{
				Thread.sleep(30);
				}
			catch (Exception e){
			}
			this.repaint();
		}
	}
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		System.out.println("paint");
		g.setColor(Color.yellow);
		g.draw3DRect(50, 50, 5, 5,true);
		g.fillRect(150, 100, 5, 5);
		g.draw3DRect(b.x, b.y, 5, 5,false);
		drawMyTank(mt, g);
	}
	public void drawMyTank(MyTank tt,Graphics g) {
		g.setColor(Color.red);
		System.out.println("drawMyTank");
		MyTank t = tt;
		drawTank(t,g);
		System.out.println("---------------------");
		System.out.println(t.tvb.size());
		System.out.println("---------------------");
		
		for(int i =0; i< t.tvb.size(); i++){
			if(t.tvb.get(i) != null && t.tvb.get(i).isLive == true){
				drawBullet(t.tvb.get(i),g);

			}
			else if(t.tvb.get(i).isLive == false) {
				t.tvb.remove(t.tvb.get(i));
			}
		}
		
	}
	public void drawEnemyTank(MyTank t,Graphics g) {
		g.setColor(Color.yellow);
		drawTank(t,g);
	}
	public void drawBullet(Bullet b, Graphics g) {
		g.setColor(Color.yellow);
		g.draw3DRect(b.x, b.y, 5, 5,true);
	}
	public void drawTank(Tank t, Graphics g) {
		System.out.println("drawTank");
		//MyTank mytank = (MyTank)t;
		Tank mytank = t;
		g.setColor(Color.yellow);
		switch(mytank.direct)
		{
		case 0:
			g.fill3DRect(mytank.x, mytank.y, 5, 30,false);
			g.fill3DRect(mytank.x+15,mytank.y , 5, 30,false);
			g.fill3DRect(mytank.x+5,mytank.y+5 , 10, 20,false);
			g.fillOval(mytank.x+5, mytank.y+10, 10, 10);
			g.drawLine(mytank.x+10, mytank.y+15, mytank.x+10, mytank.y);
			break;
		case 1:
			g.fill3DRect(mytank.x, mytank.y, 30, 5,false);
			g.fill3DRect(mytank.x, mytank.y+15, 30, 5, false);
			g.fill3DRect(mytank.x+5, mytank.y+5, 20, 10, false);
			g.fillOval(mytank.x+10, mytank.y+5, 10, 10);
			g.drawLine(mytank.x+15, mytank.y+10, mytank.x+30, mytank.y+10);
			break;
		case 2:
			g.fill3DRect(mytank.x, mytank.y, 5, 30,false);
			g.fill3DRect(mytank.x+15,mytank.y , 5, 30,false);
			g.fill3DRect(mytank.x+5,mytank.y+5 , 10, 20,false);
			g.fillOval(mytank.x+5, mytank.y+10, 10, 10);
			g.drawLine(mytank.x+10, mytank.y+15, mytank.x+10, mytank.y+30);
			break;
		case 3:
			g.fill3DRect(mytank.x, mytank.y, 30, 5,false);
			g.fill3DRect(mytank.x, mytank.y+15, 30, 5, false);
			g.fill3DRect(mytank.x+5, mytank.y+5, 20, 10, false);
			g.fillOval(mytank.x+10, mytank.y+5, 10, 10);
			g.drawLine(mytank.x+15, mytank.y+10, mytank.x, mytank.y+10);
			break;
			
		}

	}
	public void keyPressed(KeyEvent arg0) {
		System.out.println("keyPressed");
		if(arg0.getKeyCode()==KeyEvent.VK_W)
		{
		System.out.println("drawMyTank");
			this.mt.direct=0;
			this.mt.moveUp();
			
		}else if(arg0.getKeyCode()==KeyEvent.VK_D)
		{
			this.mt.direct=1;
			this.mt.moveRight();
		}else if(arg0.getKeyCode()==KeyEvent.VK_S)
		{
			this.mt.direct=2;
			this.mt.moveDown();
		}else if(arg0.getKeyCode()==KeyEvent.VK_A)
		{
			this.mt.direct=3;
			this.mt.moveLeft();
		}	
		if(arg0.getKeyCode()==KeyEvent.VK_J)
		{
			if(mt.tvb.size()<5){
				mt.tvb.add(new Bullet(10,50,2));
				System.out.println("---------------------");
				System.out.println(mt.tvb.size());
				System.out.println("---------------------");
			}
		}
		this.repaint();
	}
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

class Tank {
	int x;
	int y;
	int direct;
	int speed;
	boolean isLive = false;
	Tank(int x, int y) {
		this.x = x;
		this.y = y;
		this.speed = 3;
		this.direct = 0;
		this.isLive = true;
		System.out.println("Tank(x,y)"+" x="+x+" y="+y+" speed="+speed+" isLive="+isLive+" direct="+direct);
	}
	Tank(int x, int y, int speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.isLive = true;
		System.out.println("Tank(x,y,speed)"+" x="+x+" y="+y+" speed="+speed+" isLive="+isLive+" direct="+direct);
	}
}

class MyTank extends Tank {
	Vector<Bullet> tvb = new Vector<Bullet>();
	Bullet tb = null;
	MyTank(int x,int y) {
		super(x, y);
		this.direct = 1;	
		System.out.println("MyTank(x,y)"+" x="+x+" y="+y+" speed="+speed+" isLive="+isLive+" direct="+direct);
	}
	MyTank(int x, int y, int speed) {
		super(x, y, speed);
		this.direct = 3;
		System.out.println("MyTank(x,y)"+" x="+x+" y="+y+" speed="+speed+" isLive="+isLive+" direct="+direct);
	}
	public void moveUp() {
		this.y -= this.speed;
	}
	public void moveDown() {
		this.y += this.speed;
	}
	public void moveLeft() {
		this.x -= this.speed;
	}
	public void moveRight() {
		this.x += this.speed;
	}
}
class EnemyTank extends Tank {
	EnemyTank(int x, int y) {
		super(x, y);
		this.direct = 2;
	}
	EnemyTank(int x, int y, int speed) {
		super(x,y,speed);
		this.direct = 2;
	}
}
class Bullet implements Runnable {
	int x;
	int y;
	int direct;
	int speed;
	boolean isLive;
	Bullet(int x, int y, int direct){
		this.x = x;
		this.y = y;
		this.direct = direct;
		speed = 3;
		isLive = true;
		Thread t = new Thread(this);
		t.start();
	}
	public void run(){
		while(true){
			try {
			Thread.sleep(40);
			}
			catch (Exception e){
			}
			switch(direct){
			case 0:
				this.y -= this.speed;
				break;
			case 1:
				this.x += this.speed;
				break;
			case 2:
				this.y += this.speed;
				break;
			case 3:
				this.x -= this.speed;
				break;		
			}
			if(x>400 || x<0 ||y<0 || y>300){
				isLive = false;
				break;
			}
		}
	}
}

























































	
