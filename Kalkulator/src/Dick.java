import javax.swing.JFrame; //������ �������� ����

public class Dick {
	public static void main(String args[]){
		Reader r = new Reader("K����������");
		r.setVisible(true);//���������� ����
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�� �� �������������� ����
		r.setSize(220, 320);///������ ����
		r.setResizable(false);//������� ���� - ��������
		r.setLocationRelativeTo(null);//���������� ������������ ����
	}

}
