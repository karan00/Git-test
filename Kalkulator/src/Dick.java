import javax.swing.JFrame; //імпорт бібліотеки вікна

public class Dick {
	public static void main(String args[]){
		Reader r = new Reader("Kалькулятор");
		r.setVisible(true);//візуалізація вікна
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//дія на кнопкузакриття вікна
		r.setSize(220, 320);///розміри вікна
		r.setResizable(false);//позиція вікна - поцентру
		r.setLocationRelativeTo(null);//блокування розтягування вікна
	}

}
