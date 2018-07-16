package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;


public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("üũ�ڽ� �׽�Ʈ");
		setLocation(100, 100);
		setSize(1000, 1000);
		
		Panel p = new Panel();
		
		//Checkbox �����
		Checkbox cb1 = new Checkbox("����");
		Checkbox cb2 = new Checkbox("���ǰ���");
		Checkbox cb3 = new Checkbox("����");
		Checkbox cb4 = new Checkbox("��ȭ����");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		//���� ��ư �����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("����", group, true);
		Checkbox woman = new Checkbox("����", group, false);
		p.add(man);;
		p.add(woman);
		
		//Choice �����
		Choice ch = new Choice();
		ch.add("��");
		ch.add("����");
		ch.add("����");
		ch.add("�ܿ�");
		p.add(ch);
		
		//List �����- 5���� �����ְ� ���� ���� ������ �� �ֵ��� ���ִ� List
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
		//list�� remove(int idx)�� ��� 
		//ù��°�� �׹�° ����� 
		//list.remove(0);
		//list.remove(2);
		//������ ���� ����� ������ ��迭������ �ڿ������� �����
		list.remove(3);
		list.remove(0);
		add(p);
		setVisible(true);
		
		
	}

}
