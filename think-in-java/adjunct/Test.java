/**
 * 
 */
/**
 * @author yy263
 *
 */
package adjunct;

public class Test {
	public Test() {
		System.out.println("Ĭ�Ϲ��췽����");
	}

	// �Ǿ�̬�����
	{
		System.out.println("�Ǿ�̬����飡");
	}
	// ��̬�����
	static {
		System.out.println("��̬����飡");
	}

	public static void test() {
		System.out.println("��̬�����е�����! ");
		{
			System.out.println("��̬�����еĴ���飡");
		}

	}

	public static void main(String[] args) {

		Test test = new Test();
		Test.test();// ��̬����飡--��̬�����е�����! --��̬�����еĴ���飡--
	}
}