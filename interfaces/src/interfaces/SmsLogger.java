package interfaces;

public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Sms G�nderildi : " + message);
		
	}

}


// implemente etmek demek : logger' � SmsLogger a uyarla