package app;

import java.util.Scanner;

import entites.Product;

public class Application {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Product p1 = new Product();
		
		int add;
		int remove;
		
		p1.setName("PS4");
		p1.setPrice(3000.00);
		p1.setQuantity(10);
		p1.totalValueStock();
		
		System.out.println(p1.toString());
		
		System.out.println("Entre com o número dos produtos para adicionar ao estoque");
		add = s.nextInt();
		
		p1.addProducts(add);
		
		System.out.println(p1.toString());
		
		System.out.println("Entre com o número de produtos para remover do estoque ");
		remove = s.nextInt();
		
		p1.removeProducts(remove);
		
		System.out.println(p1.toString());
		
		
		
	
	}

}
