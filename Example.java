import javax.swing.*;
public class Example extends JFrame{
JLabel l1,l2,l3;
JTextfield t1,t2;
JButton b1;
public Example(){}
public Example(String s)
{
super(s);
}
public void setcomponents(){
l1=new JLable("USER NAME");
l2=new JLable("PASSWORD");
t1=new JTextfield();
t2=new JTextfield();
b1=new JButton("log in");
setLayout(null);

l1.setBounds(50,50,100,20);
l2.setBounds(50,80,100,20);

