


enum Chec{
	Apple(30), Banana(10), Orange(20),Mango;
	
	int quantity;
	
	 Chec(int quantity) {
		this.quantity=quantity;
	}
	 
	 Chec(){
		 this.quantity=quantity;
	 }
	 
	 public int getPrice(){
		 return this.quantity;
	 }
	 
	
}

public class EnumConstructor {
	
	public static void main(String[] args) {
		
		Chec c[]=Chec.values();
		for(Chec k:c)
			System.out.println(k+"     "+k.getPrice());
	}
	
	 
}