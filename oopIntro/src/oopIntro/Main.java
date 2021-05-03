package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product0 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10);

		Product product1 = new Product(); // �rnek olu�turma, referans olu�turma, instance creation(alma)
		product1.setId(2);
		product1.setName("Lenova V15");
		product1.setDetail("16 GB Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(16000);

		System.out.println(product1.getUnitPriceAfterDiscount());

		Product product2 = new Product();

		Product product3 = new Product();

		Product[] products = { product0, product1, product2, product3 };

		System.out.println(products.length);

		for (Product product : products) {

			// System.out.println(product.name);
		}

		Category category1 = new Category();

		category1.setId(1);
		category1.setName("bilgisayar");

		Category category2 = new Category();

		category2.setId(2);
		category2.setName("Ev/Bah�e");

		System.out.println(category1.getName());
		System.out.println(category2.getName());

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1); // product'�n bellek adresini g�ndermi� oluyoruz.
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}

// k�m�latif bir �r�n listesi olu�tu.

// persistancy = kal�c� demek. db de tutmak demek 

// classlar referans tiptir.