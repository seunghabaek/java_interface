// 다른 사람이 실제 구현해왔지만 내가 생각했던 것과 자료형이 다르다.
class RealCal {
	public double sum(double v1, double v2, double v3) {
		return v1+v2+v3;
	}
}

class DummyCal {
	public int sum(int v1, int v2) {
		return 3;
	}
}
public class InterfaceApp {
	public static void main(String[] args) {
		// 다른사람에게 class 구현을 부탁, "더하기 기능이 있는 class를 만들어 주세요"
		DummyCal c = new DummyCal();
		System.out.println(c.sum(2, 1));
	}

}
