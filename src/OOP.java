
public class OOP {
	
	String name;
	int age;
	double weight;
	
	
	OOP(String name, int age, double weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking");
	}
	
	public String toString() {
		return(name+"\n"+ age+"\n"+ weight);
	}
	void park(car mach) { 
		System.out.println("this "+mach.name+" is parked here");
	}
}
