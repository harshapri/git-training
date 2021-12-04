package Com.Sonata1;

public class Product {
	int ProId;
	String ProName;
	double ProPrice;
	Product(){}
	Product(int Id ,String Name, double Price){
		this.ProId=Id;
		this.ProName=Name;
		this.ProPrice=Price;
	}
		
public void display() {
	System.out.println(ProId);
	System.out.println(ProName);
	System.out.println(ProPrice);	
}
public double totalPrice(double GST) {
	return this.ProPrice+GST;
}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product P1=new Product(25,"Fridge",15000);
		P1.display();
		System.out.println(P1.totalPrice(1555));

	}

}
