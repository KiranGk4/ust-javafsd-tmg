package java8.streamingg;

import java.util.ArrayList;
import java.util.List;

class Product1
{
	int id;
	String name;
	float price;
	public Product1(int id, String name, float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class Stream_Example2 {

	public static void main(String[] args) {
		List<Product1> productList = new ArrayList<Product1>();
		
		productList.add(new Product1(1,"HP Laptop", 25000f));
		productList.add(new Product1(2,"DellLaptop", 30000f));
		productList.add(new Product1(3,"Lenovo Laptop", 28000f));
		productList.add(new Product1(4,"Sony Laptop", 28000f));
		productList.add(new Product1(5,"Apple Laptop", 90000f));
		
		Float totalPrice = productList.stream()
							.map(product -> product.price)
							.reduce(0.0f, (sum,price)->sum+price);
		System.out.println(totalPrice);
		
		float totalPrice2 = productList.stream()
							.map(product -> product.price)
							.reduce(0.0f, Float::sum);
		System.out.println(totalPrice2);

	}

}
