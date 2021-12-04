package Com.Sonata1;

public class Tshirt {
	String color;
	String material;
	String design;
	String brand;
	//constructor
	Tshirt()
	{
	}
	//Parameterized constructor
	Tshirt(String color,String material,String design)
	{
		this.color=color;
		this.material=material;
		this.design=design;
	}
	Tshirt(String color,String material,String design,String brand)
	{
		this.color=color;
		this.material=material;
		this.design=design;
		this.brand=brand;
	}
	//display method for displaying details
	public void display( String size)
	{
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
		System.out.println(size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tshirt s=new Tshirt();//object
		s.color="pink";
		s.material="cotton";
		s.design="trend";
		s.display("small");
		Tshirt s1=new Tshirt("blue","silk","oldfashion");//object
		s1.display("large");
		Tshirt s2=new Tshirt("white","Reyon","newfashion");
		s2.display("X-large");

	}

}
