package basic;
abstract class A{
	
	abstract void print();
}

class Sub1 extends A{
	void print() {
		System.out.println("Sub1의 print");
	}
}
public class Test {
	public static void run(A obj) {
		obj.print();
	}
	public static void main(String[] args) {
		run(new Sub1());
	}

}
