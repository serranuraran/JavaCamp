package inheritance;

public class CustomerManager {

	public void add(Customer customer) {

		System.out.println(customer.customerNumber + " Kaydedildi.");
	}

	// ayn� anda birden fazla m��teri eklemek = bulk operasyonu (bulk insert)

	public void addMultiple(Customer[] customers) {

		for (Customer customer : customers) {
			add(customer);
		}

	}

}

// tekrar kullanilabilirlik i�in metot yapt�k : reusabilityn (oop faydalar�)

// Solid => Open Closed Principle : sisteme yeni �zellik eklendi�inde mevcuttaki kodu de�i�tiremezsin. sadece yeni kodu eklersin.

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