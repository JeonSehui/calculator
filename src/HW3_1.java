/*Major: Computer Engineering
 ID: 1515056
 Name: Sehui Jeon*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//This calculator

public class HW3_1 extends JFrame implements ActionListener{
	JCheckBox apple, banana, grape, strawberry;//체크박스들 선언
	JPanel panel;//패널 선언
	JPanel panel2;//패널2 선언
	JButton ok;//ok 버튼 선언
	JButton cancel;//cancel버튼 선언
	JLabel label;//라벨 선언
	String line;//스트링 선언
	HW3_1(){
		setTitle("FRUIT SELECTION");//창의 타이틀을 설정
		setSize(300, 200);//창의 크기를 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);//창을 닫으면 프로그램 종료
		setLayout(new BorderLayout());//borderlayout정렬사용
		label = new JLabel("Choose the fruit you like.");//라벨 생성
		panel = new JPanel();//패널 생성
		panel2 = new JPanel();//패널2 생성
		ok = new JButton("OK");//ok버튼 생성
		cancel = new JButton("Cancel");//cancel버튼 생성
		apple = new JCheckBox("Apple");//apple체크박스 생성
		banana = new JCheckBox("Banana");//banana체크박스 생성
		grape = new JCheckBox("Grape");//grape체크박스 생성
		strawberry = new JCheckBox("Strawberry");//strawberry체크박스 생성
		ok.addActionListener(this);//ok버튼에 클릭 이벤트 적용
		cancel.addActionListener(this);//cancel버튼에 클릭 이벤트 적용
		label.setHorizontalAlignment(JLabel.CENTER);//라벨을 중앙으로 정렬
		add(label, BorderLayout.PAGE_START);//라벨을 페이지 시작부분(맨 윗부분)에 더한다
		panel.setLayout(new GridLayout(2, 2));//패널을 가로 2, 세로 2로 정렬
		panel.add(apple);//패널에 apple체크박스를 더한다
		panel.add(banana);//패널에 banana체크박스를 더한다
		panel.add(grape);//패널에 grape체크박스를 더한다
		panel.add(strawberry);//패널에 strawberry체크박스를 더한다
		add(panel, BorderLayout.CENTER);//패널을 중앙으로 위치하도록 하여 더한다
		panel2.add(ok);//패널2에 ok버튼을 더한다
		panel2.add(cancel);//패널2에 cancel버튼을 더한다
		add(panel2, BorderLayout.SOUTH);//패널2를 창의 아랫부분으로 위치시키면서 더한다
		setVisible(true);//창이 보이도록 한다
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==ok){//ok버튼을 눌렀을 때
			line = "You like ";//line설정
			if(apple.isSelected()){//apple체크박스가 선택됐다면
				line = line+"Apple ";//line에 "apple "문자열을 붙인다
			}
			if(banana.isSelected()){//banana체크박스가 선택됐다면
				line = line+"Banana ";//line에 "banana "문자열을 붙인다
			}
			if(grape.isSelected()){//grape체크박스가 선택됐다면
				line = line+"Grape ";//line에 "grape "문자열을 붙인다
			}
			if(strawberry.isSelected()){//strawberry체크박스가 선택됐다면
				line = line+"Strawberry ";//line에 "strawberry "문자열을 붙인다
			}
			if(!apple.isSelected()&&!banana.isSelected()
					&&!grape.isSelected()&&!strawberry.isSelected())
				//어떤 체크박스도 선택되지 않았다면
				line = "You like nothing";//line을 다시 설정
			label.setText(line);//라벨을 line값으로 설정
		}
		if(e.getSource()==cancel){//cancel버튼을 눌렀다면
			apple.setSelected(false);
			banana.setSelected(false);
			grape.setSelected(false);
			strawberry.setSelected(false);
			//모든 체크박스의 표시를 지운다
			label.setText("Choose the fruit you like.");//라벨값을 다시 설정
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===========================");
		System.out.println("Major: Computer Engineering");
		System.out.println("ID: 1515056");
		System.out.println("Name: Sehui Jeon");
		System.out.println("===========================");
		HW3_1 hw3_1= new HW3_1();//hw3_1객체 생성
		
	}

}
