// �ٸ� ����� ���� �����ؿ����� ���� �����ߴ� �Ͱ� �ڷ����� �ٸ���.
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
		// �ٸ�������� class ������ ��Ź, "���ϱ� ����� �ִ� class�� ����� �ּ���"
		DummyCal c = new DummyCal();
		System.out.println(c.sum(2, 1));
	}

}
