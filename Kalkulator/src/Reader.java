import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
//опис зміних
	JButton b1, b2, b3, b4, b5, b6 ,b7 ,b8 ,b9 ,b10, plus, minus, pomn, podil, doriv, plusminus, CE, to, CC; //кнопки
	JLabel l1, l2, l3, l4;//напис
	JTextField t1, t2;//рядок вводу
	float i, k, k1;
	Boolean pl, mi, mn, di, um;
	String a, b;//стрічка
	eHandler hendler = new eHandler(); //створення ссилки на клас
		
	public Reader(String s){
		super(s);//визов???
		setLayout(new FlowLayout());
		b1 = new JButton("1");//присвоєння значення , по сті назва кнопки/елементу
		b2 = new JButton("2");		b3 = new JButton("3");		b4 = new JButton("4");
		b5 = new JButton("5");		b6 = new JButton("6");		b7 = new JButton("7");
		b8 = new JButton("8");		b9 = new JButton("9");		b10 = new JButton("0");
		plus = new JButton("+");	minus = new JButton("-");	pomn = new JButton("*");
		podil = new JButton("/");	doriv = new JButton("=");	plusminus = new JButton("±");
		CE = new JButton("CE");		to =new JButton(".");	CC =new JButton("C");
		
		t1 = new JTextField("0",18);
		t1.setEditable(false); //БЛОКУЄ ЗМІНУ ТЕКСТУ ВРУЧНУ В ПОЛІ
		t1.setHorizontalAlignment ( JTextField.RIGHT );
		t1.setBackground(Color.white);
		//t1.
		add(t1);
		add(b7);add(b8);add(b9);add(podil);
		add(b4);add(b5);add(b6);add(pomn);
		add(b1);add(b2);add(b3);add(minus);
		add(b10);add(to);add(doriv);add(plus);
		add(plusminus);add(CE);add(CC);
		
		
		pl = false;
		mi = false;
		mn = false;
		di = false;
		um = false;
		
		b2.addActionListener(hendler);
		b1.addActionListener(hendler);
		b3.addActionListener(hendler);
		b4.addActionListener(hendler);
		b5.addActionListener(hendler);
		b6.addActionListener(hendler);
		b7.addActionListener(hendler);
		b8.addActionListener(hendler);
		b9.addActionListener(hendler);
		b10.addActionListener(hendler);
		CE.addActionListener(hendler);
		plus.addActionListener(hendler);
		minus.addActionListener(hendler);
		pomn.addActionListener(hendler);
		podil.addActionListener(hendler);
		plusminus.addActionListener(hendler);
		doriv.addActionListener(hendler);
		to.addActionListener(hendler);
		CC.addActionListener(hendler);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		//	try{           //оператор задає умову на виконня, якщо програма виконується без помилок то гуд якщо з помилками то Catch
			//if (q)		{
		//double = Double.parseDouble(string)
			try {	
			if (e.getSource()==plusminus){
					//	k = Float.parseFloat(t1.getText());
						t1.setText(String.valueOf(Float.parseFloat(t1.getText()) * -1));
							}
					
					if (e.getSource()==doriv){
					  if (pl||mi||mn||di)	{
						if (pl) { 
							k1 = k1 + k;
							t1.setText(String.valueOf(k1));
							k1 = Float.parseFloat(t1.getText());
						}
						if (mi) {
							k1 = k1 - k;
							t1.setText(String.valueOf(k1));
							k1 = Float.parseFloat(t1.getText());
						}
						if (mn) {
							k1 = k1 * k;
							t1.setText(String.valueOf(k1));
							k1 = Float.parseFloat(t1.getText());
						}
						if (di) {
							if (k!=0) {
							k1 = k1 / k;
							
							t1.setText(String.valueOf(k1));
							k1 = Float.parseFloat(t1.getText());
							} else t1.setText("Ділення на нуль недопустиме");
						}
						//k1 = 0;
						um = false;
					}
					  }
					if (e.getSource()==plus)
						if (pl) {
							k1 = k1 + k;
							t1.setText(String.valueOf(k1));
							k1 = Float.parseFloat(t1.getText());
							um = true;
						} else {
					pl = true;
					mi = false;
					mn = false;
					di = false;	
					um = true;
					k1 = Float.parseFloat(t1.getText());
					}
	
					if (e.getSource()==minus){
					pl = false;
					mi = true;
					mn = false;
					di = false;
					um = true;
					if (k1!=0) {
						k = Float.parseFloat(t1.getText());
						k1 = k1 + k;
						t1.setText(String.valueOf(k1));
						um = true;
					} 
					else {
					k1 = Float.parseFloat(t1.getText());
					  
					}
					
					}
					if (e.getSource()==pomn){
					pl = false;
					mi = false;
					mn = true;
					di = false;
					um = true;
					if (k1!=0) {
						k = Float.parseFloat(t1.getText());
						k1 = k1 * k;
						t1.setText(String.valueOf(k1));
						um = true;
					} 
					else {
					k1 = Float.parseFloat(t1.getText());
					  
					}
					
					}
					if (e.getSource()==podil){
					pl = false;
					mi = false;
					mn = false;
					di = true;
					um = true;
					if (k1!=0) {
						k = Float.parseFloat(t1.getText());
						k1 = k1 / k;
						t1.setText(String.valueOf(k1));
						um = true;
					} 
					else {
					k1 = Float.parseFloat(t1.getText());
					  
					}
					
					}					
					if (e.getSource()==CC){
				k = 0;
				k1 = 0;
				t1.setText(String.valueOf("0"));
				pl = false;
				mi = false;
				mn = false;
				di = false;
				um = false;
					}
					if (e.getSource()==CE){
				k = 0;
				t1.setText(String.valueOf("0"));

					} //else {
					
					if (t1.getText().length()==1){
						if (Integer.parseInt(t1.getText())==0){

							if (e.getSource()==b1) {if (um) t1.setText(""); t1.setText("1");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b2) {if (um) t1.setText(""); t1.setText("2");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b3) {if (um) t1.setText(""); t1.setText("3");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b4) {if (um) t1.setText(""); t1.setText("4");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b5) {if (um) t1.setText(""); t1.setText("5");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b6) {if (um) t1.setText(""); t1.setText("6");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b7) {if (um) t1.setText(""); t1.setText("7");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b8) {if (um) t1.setText(""); t1.setText("8");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b9) {if (um) t1.setText(""); t1.setText("9");um = false;k = Float.parseFloat(t1.getText());}
							
							} else {
							if (e.getSource()==b1) {if (um) t1.setText(""); t1.setText(t1.getText() + "1");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b2) {if (um) t1.setText(""); t1.setText(t1.getText() + "2");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b3) {if (um) t1.setText(""); t1.setText(t1.getText() + "3");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b4) {if (um) t1.setText(""); t1.setText(t1.getText() + "4");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b5) {if (um) t1.setText(""); t1.setText(t1.getText() + "5");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b6) {if (um) t1.setText(""); t1.setText(t1.getText() + "6");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b7) {if (um) t1.setText(""); t1.setText(t1.getText() + "7");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b8) {if (um) t1.setText(""); t1.setText(t1.getText() + "8");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b9) {if (um) t1.setText(""); t1.setText(t1.getText() + "9");um = false;k = Float.parseFloat(t1.getText());}
							if (e.getSource()==b10) {if (um) t1.setText(""); t1.setText(t1.getText() + "0");um = false;k = Float.parseFloat(t1.getText());}

							}
					} else {
						if (e.getSource()==b1) {if (um) t1.setText(""); t1.setText(t1.getText() + "1");um = false;k = Float.parseFloat(t1.getText());}
						if (e.getSource()==b2) {if (um) t1.setText(""); t1.setText(t1.getText() + "2");um = false;k = Float.parseFloat(t1.getText());}
						if (e.getSource()==b3) {if (um) t1.setText(""); t1.setText(t1.getText() + "3");um = false;k = Float.parseFloat(t1.getText());}
						if (e.getSource()==b4) {if (um) t1.setText(""); t1.setText(t1.getText() + "4");um = false;k = Float.parseFloat(t1.getText());}
						if (e.getSource()==b5) {if (um) t1.setText(""); t1.setText(t1.getText() + "5");um = false;k = Float.parseFloat(t1.getText());}
						if (e.getSource()==b6) {if (um) t1.setText(""); t1.setText(t1.getText() + "6");um = false;k = Float.parseFloat(t1.getText());}
						if (e.getSource()==b7) {if (um) t1.setText(""); t1.setText(t1.getText() + "7");um = false;k = Float.parseFloat(t1.getText());}
						if (e.getSource()==b8) {if (um) t1.setText(""); t1.setText(t1.getText() + "8");um = false;k = Float.parseFloat(t1.getText());}
						if (e.getSource()==b9) {if (um) t1.setText(""); t1.setText(t1.getText() + "9");um = false;k = Float.parseFloat(t1.getText());}
						if (e.getSource()==b10) {if (um) t1.setText(""); t1.setText(t1.getText() + "0");um = false;k = Float.parseFloat(t1.getText());}

					}
						
						if (e.getSource()==to){
							if (um) {t1.setText("0.");um =false;} else {
							Boolean eto = true;
							a = t1.getText();
							for (int x=0;x<a.length();x++){
								
								char b1 = a.charAt(x);
								
								if (b1=='.') eto = false;
							}
							if (eto)
								t1.setText(String.valueOf(t1.getText() + "."));
						}
						}
						//	} 
			//}catch (Exception ex){}// JOptionPane.showMessageDialog(null, "Введыть в поле число");//частина коду яка виконуэться при винекнены помилки в головный програмы
								 }catch (Exception ex) {
									 k = 0;
									k1 = 0;
									t1.setText(String.valueOf("0"));
									pl = false;
									mi = false;
									mn = false;
									di = false;
									um = false;}
		}
		
	}
}
