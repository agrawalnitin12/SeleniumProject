package ecommerce;

public class ConstConcept {
	
	String name;
	int age;
	String location;
	
	public ConstConcept(String name, int age, String location) {
		this.name=name; //this.class variable = local variable;
		this.age=age;
		this.location=location;
	}
	
	public static void main(String[] args) {
		ConstConcept obj3 = new ConstConcept("nitin", 35, "GNoida");
		ConstConcept obj4 = new ConstConcept("deepa", 31, "GNoida");
		System.out.println(obj3.age+" "+obj3.name+" "+obj3.location);
		System.out.println(obj4.age+" "+obj4.name+" "+obj4.location);
	}

}
