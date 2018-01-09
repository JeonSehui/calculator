/*Major: Computer Engineering
 ID: 1515056
 Name: Sehui Jeon*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HW3_2 extends JFrame implements ActionListener{
	JTextField field;//�ؽ�Ʈ�ʵ� ����
	JPanel panel;//�г� ����
	JButton button;//���� ��ư ����
	int n1 = 0, n2 = 0;//���⿡�� �ǿ����� ���� ������ ������
	String operator;//�����ڸ� ������ ����
	String[] name = {"7","8","9","/","4","5","6","*","1","2","3","-", "New", "0","=","+"};
	//������ ��ư���� ��µ� ����, ������ ���� ��Ʈ�� �迭�� ���� 
	
	HW3_2(){
		setSize(300, 200);//â�� ũ�⸦ ����
		setTitle("Calculator");//â�� Ÿ��Ʋ�� ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);//â�� ������ ���α׷� ����
		field = new JTextField();//�ؽ�Ʈ �ʵ� ����
		add(field);//�ʵ带 ���Ѵ�
		setLayout(new BorderLayout());//���� ��Ų��.
		field.setHorizontalAlignment(JTextField.RIGHT);//�Է� Ŀ���� ���������� ��ġ��Ų��.
		add(field, BorderLayout.PAGE_START);//�ؽ�Ʈ ���ڸ� ���Ѵ�(�ʵ�)
		panel = new JPanel(new GridLayout(0, 4, 0, 0));//4��
		for(int i = 0; i<name.length; i++){//name�迭�� ���� ��ŭ �ݺ�
			button = new JButton(name[i]);//name[i]�� �̸����� ��ư ����
			button.addActionListener(this);//�� ��ư�� Ŭ�� �̺�Ʈ ����
			panel.add(button);//�гο� �� ��ư�� ���Ѵ�
		}
		add(panel);//�г��� ���Ѵ�
		setVisible(true);//���̵��� �Ѵ�.
	}
	public void actionPerformed(ActionEvent e){
		String text = e.getActionCommand();//��ư�� �����ִ� �ؽ�Ʈ ���� text�� ����
		if(text!="/"&&text!="*"&&text!="-"&&text!="+"&&text!="="&&text!="New"){
			//text���� ������ ���
			n2 = n1;/*ó�� ���� ��ư�� ���� ����� n2�� 0��,
			2��°�� ���� ��ư�� ��������� ó���� ���� ���ڸ� n2�� ����*/
			n1 = Integer.parseInt(text);//n1�� text�� ������ ��ȯ�� ���� ����
			field.setText(text);//�ؽ�Ʈ �ʵ忡 text�� ��� 
		}
		if(text=="/"||text=="*"||text=="-"||text=="+")//text���� �������� ���
			operator = text;//operator�� ������ text�� ����
		if(text=="="){//text�� =���
			if(operator=="/")//�����ڰ� /���
				field.setText(Double.toString((double)n2/n1));//�ؽ�Ʈ �ʵ忡 double������ ����� ���� ���
			else if(operator=="*")//�����ڰ� *���
				field.setText(Integer.toString(n2*n1));//�ؽ�Ʈ�ʵ忡 �ǿ����� 2�� ���Ѱ� ��� 
			else if(operator=="-")//�����ڰ� -���
				field.setText(Integer.toString(n2-n1));//�ؽ�Ʈ�ʵ忡 ���� ������ ���ڿ��� ���߿� ������ ���ڸ� �� �� ��� 
			else if(operator=="+")//�����ڰ� +���
				field.setText(Integer.toString(n2+n1));//�ؽ�Ʈ �ʵ忡 �ǿ����� 2�� ���� �� ��� 
		}
		if(text=="New"){//text�� New���
			field.setText("");//�ؽ�Ʈ �ʵ带 ����ش�
			n1 = 0; n2 = 0;//n1�� n2�� 0���� �ʱ�ȭ
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===========================");
		System.out.println("Major: Computer Engineering");
		System.out.println("ID: 1515056");
		System.out.println("Name: Sehui Jeon");
		System.out.println("===========================");
		HW3_2 hw3_2 = new HW3_2();//HW3_2 ��ü ����
	}

}
