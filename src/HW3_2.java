/*Major: Computer Engineering
 ID: 1515056
 Name: Sehui Jeon*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HW3_2 extends JFrame implements ActionListener{
	JTextField field;//텍스트필드 선언
	JPanel panel;//패널 선언
	JButton button;//계산기 버튼 선언
	int n1 = 0, n2 = 0;//계산기에서 피연산자 값을 저장할 변수들
	String operator;//연산자를 저장할 변수
	String[] name = {"7","8","9","/","4","5","6","*","1","2","3","-", "New", "0","=","+"};
	//계산기의 버튼으로 출력될 숫자, 연산자 등을 스트링 배열에 저장 
	
	HW3_2(){
		setSize(300, 200);//창의 크기를 설정
		setTitle("Calculator");//창의 타이틀을 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);//창을 닫으면 프로그램 종료
		field = new JTextField();//텍스트 필드 생성
		add(field);//필드를 더한다
		setLayout(new BorderLayout());//정렬 시킨다.
		field.setHorizontalAlignment(JTextField.RIGHT);//입력 커서를 오른쪽으로 위치시킨다.
		add(field, BorderLayout.PAGE_START);//텍스트 상자를 더한다(필드)
		panel = new JPanel(new GridLayout(0, 4, 0, 0));//4열
		for(int i = 0; i<name.length; i++){//name배열의 길이 만큼 반복
			button = new JButton(name[i]);//name[i]의 이름으로 버튼 생성
			button.addActionListener(this);//이 버튼에 클릭 이벤트 적용
			panel.add(button);//패널에 이 버튼을 더한다
		}
		add(panel);//패널을 더한다
		setVisible(true);//보이도록 한다.
	}
	public void actionPerformed(ActionEvent e){
		String text = e.getActionCommand();//버튼에 적혀있는 텍스트 값을 text에 저장
		if(text!="/"&&text!="*"&&text!="-"&&text!="+"&&text!="="&&text!="New"){
			//text값이 숫자일 경우
			n2 = n1;/*처음 숫자 버튼을 누른 경우라면 n2에 0을,
			2번째로 숫자 버튼을 누른경우라면 처음에 누른 숫자를 n2에 저장*/
			n1 = Integer.parseInt(text);//n1에 text를 정수로 변환한 값을 저장
			field.setText(text);//텍스트 필드에 text를 출력 
		}
		if(text=="/"||text=="*"||text=="-"||text=="+")//text값이 연산자인 경우
			operator = text;//operator에 연산자 text를 저장
		if(text=="="){//text가 =라면
			if(operator=="/")//연산자가 /라면
				field.setText(Double.toString((double)n2/n1));//텍스트 필드에 double값으로 계산한 값을 출력
			else if(operator=="*")//연산자가 *라면
				field.setText(Integer.toString(n2*n1));//텍스트필드에 피연산자 2개 곱한값 출력 
			else if(operator=="-")//연산자가 -라면
				field.setText(Integer.toString(n2-n1));//텍스트필드에 먼저 눌렀던 숫자에서 나중에 눌렀던 숫자를 뺀 값 출력 
			else if(operator=="+")//연산자가 +라면
				field.setText(Integer.toString(n2+n1));//텍스트 필드에 피연산자 2개 합한 값 출력 
		}
		if(text=="New"){//text가 New라면
			field.setText("");//텍스트 필드를 비워준다
			n1 = 0; n2 = 0;//n1과 n2를 0으로 초기화
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===========================");
		System.out.println("Major: Computer Engineering");
		System.out.println("ID: 1515056");
		System.out.println("Name: Sehui Jeon");
		System.out.println("===========================");
		HW3_2 hw3_2 = new HW3_2();//HW3_2 객체 생성
	}

}
