import java.awt.*;  
import java.awt.event.*;   
class addition extends Frame implements ActionListener{  
TextField tf1,tf2;  
Label l1,l2,l3;
Button sum,sub,mul,div;
addition(){  
l1 = new Label("First label");
l2 = new Label("Second label");
l1.setBounds(10,50,100,30);
l2.setBounds(10,100,100,30);
l3 = new Label();
l3.setBounds(10,200,300,30);
add(l1);
add(l2);
add(l3);
sub=new Button("sub");  
sub.setBounds(300,400,100,30);  
sum=new Button("sum");  
sum.setBounds(500,400,100,30);  
mul=new Button("mul");  
mul.setBounds(700,400,100,30);  
div=new Button("div");  
div.setBounds(900,400,100,30); 
add(sub);add(sum);add(mul);add(div); ;
tf1=new TextField();  
tf1.setBounds(150,50,250,30); 
tf2=new TextField();
tf2.setBounds(150,100,250,30);  
sub.addActionListener(this);//passing current instance  
sum.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
 add(tf1);add(tf2);;   
setSize(1000,600);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){ 
String s1 = tf1.getText();
String s2 = tf2.getText();
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2); 
int c=0;
if(e.getSource()==sub) 
    {
       c=a-b;
    }
    if(e.getSource()==sum) 
    {
        c=a+b;
    }
    if(e.getSource()==mul) 
    {
        c = a*b;
    }
    if(e.getSource()==div) 
    {
       c= a/b;
    }
String res = String.valueOf(c); 
l3.setText(res);
}  
public static void main(String args[]){  
addition a = new addition();  
}  
} 