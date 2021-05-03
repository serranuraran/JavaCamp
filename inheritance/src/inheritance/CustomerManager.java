package inheritance;

public class CustomerManager {

	public void add(Customer customer) {

		System.out.println(customer.customerNumber + " Kaydedildi.");
	}

	// ayný anda birden fazla müþteri eklemek = bulk operasyonu (bulk insert)

	public void addMultiple(Customer[] customers) {

		for (Customer customer : customers) {
			add(customer);
		}

	}

}

// tekrar kullanilabilirlik için metot yaptýk : reusabilityn (oop faydalarý)

// Solid => Open Closed Principle : sisteme yeni özellik eklendiðinde mevcuttaki kodu deðiþtiremezsin. sadece yeni kodu eklersin.

//public void add(IndividualCustomer customer) { 
//
//System.out.println(customer.customerNumber +  "Kaydedildi. ");
//
//}
//
//
//public void add(CorporateCustomer customer) { 
//  System.out.println(customer.customerNumber +  " Kaydedildi. ");
//}