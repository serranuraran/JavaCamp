package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";

		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber = "78910";

		SendikaCustomer abcCustomer = new SendikaCustomer();
		abcCustomer.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();

//	    customerManager.add(hepsiburada);
//	    customerManager.add(engin);
//	    customerManager.add(abcCustomer);  // i�te burada polymorphism yap�yoruz.

		Customer[] customers = { engin, abcCustomer, hepsiburada };

		customerManager.addMultiple(customers);

	}

}
