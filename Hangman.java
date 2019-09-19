import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
public class Hangman extends Frame implements ActionListener{  
static int i=0,p=0,count=0,k=0,l=0;
static String symbol="";
 static String pp="";
 static String r="";
Button bp1,bp2,bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12;
Button nbt1,nbt2,nbt3,nbt4,nbt5,nbt6,nbt7;
TextField F1,F2,F3; 
void fun(){  
	
	String arr[]={"hello","friend","college","java","cmd","code","program","codechef","hangman","cricket"};
	int max=10,min=0;

	int tp=(int)((Math.random() * ( max - min )) + min);
	pp=arr[tp];
	
	
 
	
    F1=new TextField("");
    F2=new TextField(""); 	
	F3=new TextField("");
    bt10=new Button("try this \ncharacter"); 
    bt11=new Button("try this string");
	  bt0=new Button("GUESS IT");
	 bt1=new Button(""); 
    bt2=new Button(""); 
    bt3=new Button(""); 
    bt4=new Button("");
	bt5=new Button("");
	bt6=new Button("");
	bt7=new Button("");
	bt8=new Button("");
	bt9=new Button("");
    bt12=new Button("show ans.");
	nbt1=new Button("");
	nbt2=new Button("");
	nbt3=new Button("");
	nbt4=new Button("");
	nbt5=new Button("");
	nbt6=new Button("");
	nbt7=new Button("");
	
	
	F1.setFont(new Font("SansSerif", Font.BOLD, 20));
	F2.setFont(new Font("SansSerif", Font.BOLD, 20));
	F3.setFont(new Font("SansSerif", Font.BOLD, 20));
	bt0.setFont(new Font("Courier", Font.BOLD,28));
	bt1.setFont(new Font("Courier", Font.BOLD,28));
	bt2.setFont(new Font("Courier", Font.BOLD,28));
	bt3.setFont(new Font("Courier", Font.BOLD,28));
	bt4.setFont(new Font("Courier", Font.BOLD,28));
	bt5.setFont(new Font("Courier", Font.BOLD,28));
	bt6.setFont(new Font("Courier", Font.BOLD,28));
	bt7.setFont(new Font("Courier", Font.BOLD,28));
	bt8.setFont(new Font("Courier", Font.BOLD,28));
	bt9.setFont(new Font("Courier", Font.BOLD,28));
	
	nbt1.setFont(new Font("Courier", Font.BOLD,28));
	nbt2.setFont(new Font("Courier", Font.BOLD,28));
	nbt3.setFont(new Font("Courier", Font.BOLD,28));
	nbt4.setFont(new Font("Courier", Font.BOLD,28));
	nbt5.setFont(new Font("Courier", Font.BOLD,28));
	nbt6.setFont(new Font("Courier", Font.BOLD,28));
	nbt7.setFont(new Font("Courier", Font.BOLD,28));
	
	
	
	
	add(bt10);
	add(bt11);
    add(F1);
    add(F2);	
    add(F3);
	add(bt12);
	add(bt0);
	add(nbt1);
	add(nbt2);
	add(nbt3);
	add(nbt4);
	add(nbt5);
	add(nbt6);
	add(nbt7);
	
	
	
	
     F1.setBounds(60,220,100,30);
	 F2.setBounds(180,220,100,30);
	 F3.setBounds(300,220,100,30);
	 bt10.setBounds(60,280,100,40);
	 bt11.setBounds(180,280,100,40);
     bt12.setBounds(300,280,100,40);
      bt0.setBounds(130,40,140,40);
      nbt1.setBounds(480,40,30,30);
      nbt2.setBounds(480,70,30,40);
	  nbt3.setBounds(480,110,30,40);
      nbt4.setBounds(450,80,30,30);
	  nbt5.setBounds(510,80,30,30);
      nbt6.setBounds(450,150,30,30);
	  nbt7.setBounds(510,150,30,30);


    bt10.addActionListener(this);
	bt11.addActionListener(this);
    bt12.addActionListener(this);
	


setSize(580,440);  
    setLayout(null);  
    setVisible(true);	
	setBackground(Color.blue);  
	
	  
	 if(pp.length()==3)
	  {
     bt1.setBounds(120,120,35,35);    
     bt2.setBounds(160,120,35,35);  
     bt3.setBounds(200,120,35,35);  
     add(bt1);
     add(bt2);
     add(bt3);
	  }
	  
	  
	  
	    
	  if(pp.length()==4)
	  {
     bt1.setBounds(100,120,35,35);    
     bt2.setBounds(140,120,35,35);  
     bt3.setBounds(180,120,35,35);  
     bt4.setBounds(220,120,35,35);
     add(bt1);
     add(bt2);
     add(bt3);
     add(bt4);	  
	  }
	  
	  
	  else if(pp.length()==5)
	  {
     bt1.setBounds(80,120,35,35);    
     bt2.setBounds(120,120,35,35);  
     bt3.setBounds(160,120,35,35);  
     bt4.setBounds(200,120,35,35);
	  bt5.setBounds(240,120,35,35);
     add(bt1);
     add(bt2);
     add(bt3);
     add(bt4);	  
	 add(bt5);
	  }
	  
	  
	  
	  else if(pp.length()==6)
	  {
	 bt1.setBounds(90,120,35,35);    
     bt2.setBounds(130,120,35,35);  
     bt3.setBounds(170,120,35,35);  
     bt4.setBounds(210,120,35,35);  
     bt5.setBounds(250,120,35,35);  
     bt6.setBounds(290,120,35,35);  
    
 
	 add(bt1);
	add(bt2);
	add(bt3);
	add(bt4);
	add(bt5);
    add(bt6);	
	  }
	  
	  
	  
	  
	  else if(pp.length()==7)
	  {
	 bt1.setBounds(90,120,35,35);    
     bt2.setBounds(130,120,35,35);  
     bt3.setBounds(170,120,35,35);  
     bt4.setBounds(210,120,35,35);  
     bt5.setBounds(250,120,35,35);  
     bt6.setBounds(290,120,35,35);  
     bt7.setBounds(330,120,35,35);  
    
	 
	 
	 add(bt1);
	add(bt2);
	add(bt3);
	add(bt4);
	add(bt5);
	add(bt6);
	add(bt7);
	  }
	  
	  
	  
	  else if(pp.length()==8)
	  {
	 bt1.setBounds(70,120,35,35);    
     bt2.setBounds(110,120,35,35);  
     bt3.setBounds(150,120,35,35);  
     bt4.setBounds(190,120,35,35);  
     bt5.setBounds(230,120,35,35);  
     bt6.setBounds(270,120,35,35);  
     bt7.setBounds(310,120,35,35);  
     bt8.setBounds(350,120,35,35);  
  
	 
	 
	 add(bt1);
	add(bt2);
	add(bt3);
	add(bt4);
	add(bt5);
	add(bt6);
	add(bt7);
	add(bt8);
	  }
	  
	  
	  
	  
	  else if(pp.length()==9)
	  {
	 bt1.setBounds(60,120,35,35);    
     bt2.setBounds(100,120,35,35);  
     bt3.setBounds(140,120,35,35);  
     bt4.setBounds(180,120,35,35);  
     bt5.setBounds(220,120,35,35);  
     bt6.setBounds(260,120,35,35);  
     bt7.setBounds(300,120,35,35);  
     bt8.setBounds(340,120,35,35);  
     bt9.setBounds(380,120,35,35); 
	 
	 
	 add(bt1);
	add(bt2);
	add(bt3);
	add(bt4);
	add(bt5);
	add(bt6);
	add(bt7);
	add(bt8);
	add(bt9);
	  }
	
	
	
	
	  
		
	//JOptionPane.showMessageDialog(this,"player 1 will have symbol \"x\" and player 2 will have \"0\" \n symbols will automatically change after each game \n please enter your names");


} 

 
public void actionPerformed(ActionEvent e){
	if(e.getSource()==bt10)
	{ 


     if(F1.getText().equals(""))
		 return;
	 
     if(F1.getText().length()>1){
		 JOptionPane.showMessageDialog(this,"enter only a lower case character");
		 F1.setText("");
		 return;
	 }

        l=0;
	String qq;
	  for(int i=0;i<pp.length();i++)
	  {
		  qq=String.valueOf(pp.charAt(i));
		  if(qq.equals(F1.getText()))
		  {
			  if(i==0){
				  bt1.setLabel(qq);
				  count++;
				  l=1;
			  }
			  if(i==1){
				  bt2.setLabel(qq);
				  count++;
				  l=1;
			  }
			  if(i==2){
				  bt3.setLabel(qq);
				  count++;
				  l=1;
			  }
		    if(i==3){
				bt4.setLabel(qq);
				count++;
				l=1;
			}
			if(i==4){
				bt5.setLabel(qq);
			count++;
			l=1;
			}
			if(i==5){
				bt6.setLabel(qq);
				count++;
				l=1;
			}
			if(i==6){
				bt7.setLabel(qq);
			count++;
			l=1;
			}
		  if(i==7){
			  bt8.setLabel(qq);
		  count++;
		  l=1;
		  }
		  if(i==8){
			  bt9.setLabel(qq);
		  l=1;
		  count++;}
		  }
	  }
	  
	  if(l==0){
			  k++;
			  if(k==1)
				  nbt1.setLabel("0");
			  if(k==2)
				  nbt2.setLabel("|");
			  if(k==3)
				  nbt3.setLabel("|");
			  if(k==4)
				  nbt4.setLabel("/");
			  if(k==5)
				  nbt5.setLabel("\\");
			  if(k==6)
				  nbt6.setLabel("/");
			  if(k==7){
				  nbt7.setLabel("\\");
				  nbt1.setLabel("-");
				  JOptionPane.showMessageDialog(this,"Hanged!");
			  }
		  }
	  
	  
F1.setText("");

if(count==pp.length()&&F3.getText().equals(""))
	JOptionPane.showMessageDialog(this,"congrats you guessed it correct");
	  
	}




if(e.getSource()==bt11)
{
if(F2.getText().equals(pp)&&F3.getText().equals(""))
	JOptionPane.showMessageDialog(this,"congrats you guessed it correct");
else
	F2.setText("");
}

if(e.getSource()==bt12)
{
	F3.setText(pp);
	//fun();
 } 

}
public static void main(String []args) { 
    Hangman obj2=new Hangman();
obj2.fun();	
}   
} 