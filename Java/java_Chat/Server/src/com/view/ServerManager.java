package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ServerManager extends JFrame implements ActionListener{
	JPanel jp ;
	JButton jb1,jb2;
	public static void main(String[] agrs){
		new ServerManager();
	}
	public ServerManager(){
		jp = new JPanel();
		jb1 = new JButton("oo");
		jb2 = new JButton("jj");
		jp.add(jb1);
		jp.add(jb2);
		this.add(jp);
		this.setVisible(true);
		this.setLocation(100, 50);
		this.setSize(400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb1){
			
		}
		else if(e.getSource()==jb2){
			
		}
	}
}
