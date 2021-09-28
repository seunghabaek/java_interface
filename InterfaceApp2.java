interface Calculable { // class의 형태를 규정하는 interface
	double PI = 3.14;
	int sum(int v1, int v2);
}
interface Printable {
	void print(); // method를 interface에 적용할 때는 내용이 들어가지 않음.
}

class RealCal2 implements Calculable, Printable { // interface에서 선언된 형태를 구체적으로 선언해줘야함.만약 어기면 compile조차 안됨.
	public int sum(int v1, int v2) {			// 하나의 class는 여러 개의 interface를 구현할 수 있다.
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
