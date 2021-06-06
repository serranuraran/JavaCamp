  
package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	  Product getByProductName(String productName);
	  
	  Product getByProductNameAndCategory(String productName, int categoryId);
	  
	  List<Product> getByProductNameOrCategory(String productName, int categoryId);
	  
	  List<Product> getByCategoryIn(List<Integer> categories);
	  
	  List<Product> getByProductNameContains(String productName);
	  
	  List<Product> getByProductNameStartsWith(String productName);
	  
	  @Query("From Product where productName=:productName and category.categoryId=:categoryId")
	  List<Product> getByNameAndCategory(String productName, int categoryId);
	  
	  //select * from products where product_name=bisey and categoryId=bisey
}

// JpaRepository => verdigin veritipi icin yani entity anatasyonlari ile suslenmis nesne icin(product => entity koymazsan problem yasarsin)
// primary key alanin da ne oldugunu bana ver ki sorgulari da ona gore hazirlayim diyor. bu sekilde urunle ilgili crud operasyonlarini
// hazirliyor.

// entityFramework base repository=> JpaRepository => hangi tabloya hangi id veritipi ile sorgularin hazirlanmasi gerektigini soyluyoruz.