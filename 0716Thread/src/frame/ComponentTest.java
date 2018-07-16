package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;


public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("체크박스 테스트");
		setLocation(100, 100);
		setSize(1000, 1000);
		
		Panel p = new Panel();
		
		//Checkbox 만들기
		Checkbox cb1 = new Checkbox("독서");
		Checkbox cb2 = new Checkbox("음악감상");
		Checkbox cb3 = new Checkbox("게임");
		Checkbox cb4 = new Checkbox("영화감상");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		//라디오 버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("남자", group, true);
		Checkbox woman = new Checkbox("여자", group, false);
		p.add(man);;
		p.add(woman);
		
		//Choice 만들기
		Choice ch = new Choice();
		ch.add("봄");
		ch.add("여름");
		ch.add("가을");
		ch.add("겨울");
		p.add(ch);
		
		//List 만들기- 5개를 보여주고 여러 개를 선택할 수 있도록 해주는 List
		List list = new List(5,true);
		list.add("C&C++");
		list.add("Java");
		list.add("JavaScript");
		list.add("Object-C");
		list.add("Python");
		list.add("Switf");
		list.add("Kotlin");
		list.add("Scala");
		p.add(list);
		//list의 remove(int idx)를 사용 
		//첫번째와 네번째 지우기 
		//list.remove(0);
		//list.remove(2);
		//위에서 부터 지우면 순서가 재배열됨으로 뒤에서부터 지우기
		list.remove(3);
		list.remove(0);
		add(p);
		setVisible(true);
		
		
	}

}
