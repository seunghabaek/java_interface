interface Calculable { // class�� ���¸� �����ϴ� interface
	double PI = 3.14;
	int sum(int v1, int v2);
}
interface Printable {
	void print(); // method�� interface�� ������ ���� ������ ���� ����.
}

class RealCal2 implements Calculable, Printable { // interface���� ����� ���¸� ��ü������ �����������.���� ���� compile���� �ȵ�.
	public int sum(int v1, int v2) {			// �ϳ��� class�� ���� ���� interface�� ������ �� �ִ�.
		return v1+v2;
	}
	public void print() {
		System.out.println("This is RealCal!!");
	}
}

class DummyCal2 implements Calculable {
	public int sum(int v1, int v2) { 
		return 3;
	}
}
public class InterfaceApp2 {
	public static void main(String[] args) {
		RealCal2 c = new RealCal2();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	}
}
