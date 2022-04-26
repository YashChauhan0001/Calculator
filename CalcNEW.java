import javax.swing.*;
import java.awt.event.*;
public class CalcNEW implements ActionListener
{static int choice;
static double a=0,b=0,res=0;
JButton b1,b2,b3,b4,b5,b6;
JButton[]Numberbutton=new JButton[10];
	JTextField tf=new JTextField();
	JFrame frame=new JFrame();
	CalcNEW()
	{try{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
	  catch(Exception e){}
	 int x=50,y=140;
	frame.setSize(400,400);
	frame.setVisible(true);
	tf=new JTextField(); 
	for (int i=0;i<=9;i++)
	{ Numberbutton[i]=new JButton(String.valueOf(i)); 
      if((i%3==0)&&(i!=0)){x=50;y+=40;}
	  Numberbutton[i].setBounds(x, y, 60, 30);
	  frame.add(Numberbutton[i]);
	  x+=70;
	Numberbutton[i].addActionListener(this);}
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  b1= new JButton("C"); b1.setBounds(120,260,60,30);    frame.add(b1); b1.addActionListener(this);
      b2= new JButton("="); b2.setBounds(190,260,60,30);    frame.add(b2); b2.addActionListener(this);
      b3= new JButton("*"); b3.setBounds(260,140,60,30);    frame.add(b3); b3.addActionListener(this);
      b4= new JButton("/"); b4.setBounds(260,180,60,30);    frame.add(b4); b4.addActionListener(this);
      b5= new JButton("-"); b5.setBounds(260,220,60,30);    frame.add(b5); b5.addActionListener(this);
	  b6= new JButton("+"); b6.setBounds(260,260,60,30);    frame.add(b6); b6.addActionListener(this);
	  tf.setBounds(50,40,280,50); 
	  frame.add(tf);  
	}
	public void actionPerformed(ActionEvent ae)
	{
		int i=0;
		for(i=0;i<=9;i++)
		{if(ae.getSource()==Numberbutton[i]){tf.setText(tf.getText().concat(String.valueOf(i)));}}
	   if(ae.getSource()==b1){tf.setText("");}
	   if(ae.getSource()==b3){a=Double.parseDouble(tf.getText()); tf.setText("");choice=1;}
	   if(ae.getSource()==b4){a=Double.parseDouble(tf.getText()); tf.setText("");choice=2;}
	   if(ae.getSource()==b5){a=Double.parseDouble(tf.getText()); tf.setText("");choice=3;}
	   if(ae.getSource()==b6){a=Double.parseDouble(tf.getText()); tf.setText("");choice=4;}
	   if(ae.getSource()==b2){b=Double.parseDouble(tf.getText()); switch(choice){
		   case 1:res=a*b; break;
		   case 2:res=a/b; break;
		   case 3:res=a-b; break;
		   case 4:res=a+b; break;
		   default:res=0;
	   }tf.setText(String.valueOf(res));}
	}
	public static void main(String s[])
	{
		new CalcNEW();
	}
}