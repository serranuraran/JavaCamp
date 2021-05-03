package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
		// müþteri ekleme kodlarý.
		System.out.println("Müþteri eklendi... s");
		
		logger.log();
		
	}
}


// miras verilen sýnýf yani bizim temel sýnýfýmýz, base class file'ýn referansýný tutar. Ne yollarsak, aslýnda onun log'u çalýþýr.

// yüzdeyüz ortak mý? olayý oluyor aslýnda. Yüzde yüz ortak deðil ise, tekrarlamamýz gerekiyor. Modellemenin mantýðý
