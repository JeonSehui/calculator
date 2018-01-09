/*Major: Computer Engineering
 ID: 1515056
 Name: Sehui Jeon*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HW3_1 extends JFrame implements ActionListener{
	JCheckBox apple, banana, grape, strawberry;//üũ�ڽ��� ����
	JPanel panel;//�г� ����
	JPanel panel2;//�г�2 ����
	JButton ok;//ok ��ư ����
	JButton cancel;//cancel��ư ����
	JLabel label;//�� ����
	String line;//��Ʈ�� ����
	HW3_1(){
		setTitle("FRUIT SELECTION");//â�� Ÿ��Ʋ�� ����
		setSize(300, 200);//â�� ũ�⸦ ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);//â�� ������ ���α׷� ����
		setLayout(new BorderLayout());//borderlayout���Ļ��
		label = new JLabel("Choose the fruit you like.");//�� ����
		panel = new JPanel();//�г� ����
		panel2 = new JPanel();//�г�2 ����
		ok = new JButton("OK");//ok��ư ����
		cancel = new JButton("Cancel");//cancel��ư ����
		apple = new JCheckBox("Apple");//appleüũ�ڽ� ����
		banana = new JCheckBox("Banana");//bananaüũ�ڽ� ����
		grape = new JCheckBox("Grape");//grapeüũ�ڽ� ����
		strawberry = new JCheckBox("Strawberry");//strawberryüũ�ڽ� ����
		ok.addActionListener(this);//ok��ư�� Ŭ�� �̺�Ʈ ����
		cancel.addActionListener(this);//cancel��ư�� Ŭ�� �̺�Ʈ ����
		label.setHorizontalAlignment(JLabel.CENTER);//���� �߾����� ����
		add(label, BorderLayout.PAGE_START);//���� ������ ���ۺκ�(�� ���κ�)�� ���Ѵ�
		panel.setLayout(new GridLayout(2, 2));//�г��� ���� 2, ���� 2�� ����
		panel.add(apple);//�гο� appleüũ�ڽ��� ���Ѵ�
		panel.add(banana);//�гο� bananaüũ�ڽ��� ���Ѵ�
		panel.add(grape);//�гο� grapeüũ�ڽ��� ���Ѵ�
		panel.add(strawberry);//�гο� strawberryüũ�ڽ��� ���Ѵ�
		add(panel, BorderLayout.CENTER);//�г��� �߾����� ��ġ�ϵ��� �Ͽ� ���Ѵ�
		panel2.add(ok);//�г�2�� ok��ư�� ���Ѵ�
		panel2.add(cancel);//�г�2�� cancel��ư�� ���Ѵ�
		add(panel2, BorderLayout.SOUTH);//�г�2�� â�� �Ʒ��κ����� ��ġ��Ű�鼭 ���Ѵ�
		setVisible(true);//â�� ���̵��� �Ѵ�
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==ok){//ok��ư�� ������ ��
			line = "You like ";//line����
			if(apple.isSelected()){//appleüũ�ڽ��� ���õƴٸ�
				line = line+"Apple ";//line�� "apple "���ڿ��� ���δ�
			}
			if(banana.isSelected()){//bananaüũ�ڽ��� ���õƴٸ�
				line = line+"Banana ";//line�� "banana "���ڿ��� ���δ�
			}
			if(grape.isSelected()){//grapeüũ�ڽ��� ���õƴٸ�
				line = line+"Grape ";//line�� "grape "���ڿ��� ���δ�
			}
			if(strawberry.isSelected()){//strawberryüũ�ڽ��� ���õƴٸ�
				line = line+"Strawberry ";//line�� "strawberry "���ڿ��� ���δ�
			}
			if(!apple.isSelected()&&!banana.isSelected()
					&&!grape.isSelected()&&!strawberry.isSelected())
				//� üũ�ڽ��� ���õ��� �ʾҴٸ�
				line = "You like nothing";//line�� �ٽ� ����
			label.setText(line);//���� line������ ����
		}
		if(e.getSource()==cancel){//cancel��ư�� �����ٸ�
			apple.setSelected(false);
			banana.setSelected(false);
			grape.setSelected(false);
			strawberry.setSelected(false);
			//��� üũ�ڽ��� ǥ�ø� �����
			label.setText("Choose the fruit you like.");//�󺧰��� �ٽ� ����
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===========================");
		System.out.println("Major: Computer Engineering");
		System.out.println("ID: 1515056");
		System.out.println("Name: Sehui Jeon");
		System.out.println("===========================");
		HW3_1 hw3_1= new HW3_1();//hw3_1��ü ����		
	}
}
