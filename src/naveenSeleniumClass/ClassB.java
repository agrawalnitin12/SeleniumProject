package naveenSeleniumClass;

public class ClassB extends ClassA {

	public void method3() {
		System.out.println("Class B normal method");
	}
	
	public void method2() {
		System.out.println("Class B overriding method");
	}

	public static void main(String[] args) {
		ClassB a = new ClassB();
		a.method1();
		a.method2();

	}

}
