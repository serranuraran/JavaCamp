package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
		// m��teri ekleme kodlar�.
		System.out.println("M��teri eklendi... s");
		
		logger.log();
		
	}
}


// miras verilen s�n�f yani bizim temel s�n�f�m�z, base class file'�n referans�n� tutar. Ne yollarsak, asl�nda onun log'u �al���r.

// y�zdey�z ortak m�? olay� oluyor asl�nda. Y�zde y�z ortak de�il ise, tekrarlamam�z gerekiyor. Modellemenin mant���
