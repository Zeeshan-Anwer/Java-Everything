package Constructor;


class Vehicle{
	int wheels;
	Vehicle(){
		wheels=4;
	}
}
public class defaultConstructor{
	
	defaultConstructor() {
	System.out.println("Object initialize");
	
	}
	public static void main(String args[]) {
		defaultConstructor obj=new defaultConstructor();
		Vehicle car=new Vehicle();
		
		System.out.print(car.wheels+"wheels");
	}

}
