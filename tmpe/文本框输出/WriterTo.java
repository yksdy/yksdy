import java.io.*; 
import javax.swing.*; 
import java.awt.FlowLayout; 
import java.awt.event.*; 

public class WriterTo extends JFrame implements ActionListener{ 

 JButton b;
 JTextField t; 
 public WriterTo(){ 

  super("�ı�������д���ļ�"); 
  JLabel l=new JLabel("���������ݣ�"); 
  t=new JTextField(20); 
  b=new JButton("д��"); 
  b.addActionListener(this); 
  this.add(l); 
  this.add(t); 
  this.add(b); 
  this.setLayout(new FlowLayout()); 
  this.pack(); 
  this.setVisible(true); 
 } 

 public void actionPerformed(ActionEvent e) { 
  if(e.getSource()==b){ 
   if(t.getText().equals("")){ 
    JOptionPane.showMessageDialog(null,"����������~","����",JOptionPane.ERROR_MESSAGE); 
    t.grabFocus(); 
   }else{ 
    write(t.getText()); 
    JOptionPane.showMessageDialog(null,"д��ɹ�","��ʾ",JOptionPane.INFORMATION_MESSAGE); 
   } 
  } 
 } 

 public void write(String line){ 
  try{ 
   File f=new File("�ı���.txt");//��ָ���ı�����д�� 
   FileWriter fw=new FileWriter(f); 
   fw.write(line); 
   fw.close(); 
  }catch(Exception e){ 
  } 
 } 
 public static void main(String[] args) { 

  new WriterTo(); 

 } 

  

}